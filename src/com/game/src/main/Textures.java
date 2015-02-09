package com.game.src.main;

import java.awt.image.BufferedImage;

public class Textures {
	
	public BufferedImage [] player = new BufferedImage [3];
	public BufferedImage [] missile = new BufferedImage [3];
	public BufferedImage [] enemy = new BufferedImage [3];
	
	private SpriteSheet ss;
	
	public Textures (Game game){
		ss = new SpriteSheet(game.getSpriteSheet());
		getTextures();
	}
			
	private void getTextures(){
		//may invoke error
		for (int i =0; i < 3; i++){		
		player[i]= ss.grabImage(1, 1+i, 32, 32);
		missile [i] = ss.grabImage(2, 1+i, 32, 32);
		enemy[i] = ss.grabImage(3, 1+i, 32, 32);
		}
		
		
	}
}
