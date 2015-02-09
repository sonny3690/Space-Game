package com.game.src.main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class Score {

	private Game game;
	private int count;

	public Score(Game game, int count) {
		this.game = game;
		this.count = count;
	}

	public void showScore() {

	}

	public void render(Graphics g, Font scoreFont) {
		Graphics2D g2d = (Graphics2D )g;
		g2d.setFont(scoreFont);
		g2d.setColor(Color.WHITE);
		
		g2d.setRenderingHint(
		        RenderingHints.KEY_TEXT_ANTIALIASING,
		        RenderingHints.VALUE_TEXT_ANTIALIAS_GASP);
		g2d.drawString("Score:" +Integer.toString (game.getEnemy_killed()), 4 , 40);
	
	}

}
