package com.game.src.main;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

import com.game.src.main.classes.EntityB;
import com.game.src.main.libs.Animation;

public class Enemy extends GameObject implements EntityB {

	Random r = new Random();
	private double x, y;

	private int speed = r.nextInt(3) + 1;;
	private Textures tex;
	Animation anim;

	private Game game;
	private Controller c;
	private Bullet b;

	public Enemy(double x, double y, Textures tex, Controller c, Game game) {
		super(x, y);
		this.x = x;
		this.y = y;
		this.tex = tex;
		this.c = c;
		this.game = game;

		anim = new Animation(-9, tex.enemy[0], tex.enemy[1], tex.enemy[2]);
	}

	public void tick() {

		y += speed;

		if (y > Game.HEIGHT * Game.SCALE) {
			speed = r.nextInt(3) + 1;
			x = r.nextInt(640);
			y = -10;
		}

		if (Physics.Collision(this, game.ea)) {
			c.removeEntity(this);
			c.removeEntity(b);
			c.createEnemy(1);
			game.kills++;
			
		}

		anim.runAnimation();
	}

	public void render(Graphics g) {
		anim.drawAnimation(g, x, y, 0);

	}

	public Rectangle getBounds() {
		return new Rectangle((int) x, (int) y, 22, 24);
	}

	public double getX() {
		return x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getY() {
		return y;
	}

}
