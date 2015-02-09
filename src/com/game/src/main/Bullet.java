package com.game.src.main;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

import com.game.src.main.classes.EntityA;
import com.game.src.main.libs.Animation;

public class Bullet extends GameObject implements EntityA {

	private Textures tex;
	private Game game;
	Random rand;

	Animation anim;
	
	private int speed;

	public Bullet(double x, double y, Textures tex, Game game) {
		super(x, y);
		this.tex = tex;
		this.game = game;

		anim = new Animation(5, tex.missile[0], tex.missile[1], tex.missile[2]);
		rand = new Random ();
		
		setSpeed (5);
	}

	public void tick() {
		y -= speed;

		anim.runAnimation();
	}

	public void render(Graphics g) {
		anim.drawAnimation(g, x, y, 0);
	}

	public double getY() {
		return y;
	}

	public double getX() {
		return x;
	}

	public Rectangle getBounds() {

		return new Rectangle((int) x, (int) y, 21, 32);

	}
	
	public void setSpeed (int speed){
		this.speed = speed;
	}
	
	public int getSpeed (){
		return this.speed;
	}
	
	
}
