package com.game.src.main;

import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseInput implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		int mx = e.getX();
		int my = e.getY();

		/*
		 * public Rectangle playButton = new Rectangle (Game.WIDTH/2+120, 150,
		 * 100, 50); public Rectangle helpButton = new Rectangle
		 * (Game.WIDTH/2+120, 250, 100, 50); public Rectangle quitButton = new
		 * Rectangle (Game.WIDTH/2+120, 350, 100, 50);
		 */

		System.out.println(Game.WIDTH);

		if (mx >= Game.WIDTH / 2 + 120 && mx <= Game.WIDTH / 2 + 220) {
			System.out.println("internal access");
			if (my >= 150 && my <= 200) {
				// Pressed Play Button
				Game.state = Game.STATE.GAME;

			}
		}

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}
