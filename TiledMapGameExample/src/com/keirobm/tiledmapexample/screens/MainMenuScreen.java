package com.keirobm.tiledmapexample.screens;

import com.moribitotech.mtx.game.AbstractGame;
import com.moribitotech.mtx.interfaces.IScreen;
import com.moribitotech.mtx.screen.AbstractScreen;

public class MainMenuScreen extends AbstractScreen implements IScreen {
	//---------------  CONSTANTS  -----------------
	
	//-------------------------------------------
	
	//---------------  MEMBERS  -----------------
	
	//-------------------------------------------
	
	
	//---------------  CONSTRUCTOR  -----------------
	public MainMenuScreen(AbstractGame game, String screenName) {
		super(game, screenName);
		
		//Set Back Button Active
		setBackButtonActive(true);
		
		//Setup GUI Elements
		setUpScreenElements();
		setUpMenu();
		
		//TODO Add more setup elements methods
	}
	//-------------------------------------------
	
	
	//---------------  METHODS  -----------------	
	@Override
	public void setUpScreenElements() {
		

	}

	@Override
	public void setUpMenu() {
		

	}
	//-------------------------------------------
}
