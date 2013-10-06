package com.keirobm.tiledmapexample.screens;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;
import com.keirobm.tiledmapexample.assets.Assets;
import com.moribitotech.mtx.game.AbstractGame;
import com.moribitotech.mtx.scene2d.models.EmptyActorLight;
import com.moribitotech.mtx.screen.AbstractScreenLoading;
import com.moribitotech.mtx.settings.AppSettings;
import com.moribitotech.mtx.utils.UtilsAssets;
import com.moribitotech.mtx.utils.UtilsOrigin;
import com.moribitotech.mtx.utils.UtilsAssets.Filter;
import com.moribitotech.mtx.utils.UtilsOrigin.Origin;

public class LoadingScreen extends AbstractScreenLoading {
	//---------------  CONSTANTS  -----------------
	private static final float ANIM_MOVE_DURATION = .9f;
	private static final float LOADING_SCREEN_DURATION = 5f;
	//-------------------------------------------
	
	//---------------  MEMBERS  -----------------
	private Table table;
	private EmptyActorLight loadingGear;
	private Label loadingText;
	private BitmapFont font;
	private boolean isNextScreenSet = false;
	//-------------------------------------------
	
	
	//---------------  CONSTRUCTOR  -----------------
	public LoadingScreen(AbstractGame game, String screenName) {
		super(game, screenName);
	}
	//-------------------------------------------
	
	
	//---------------  METHODS  -----------------
	@Override
	public void setUpLoading() {
		/**
		 * Set up background color
		 */
		setOpenGLClearColor(0f, 0f, 0f, 1f);
		
		/**
		 * Load resources by hand because all Assets is not loaded yet
		 */
		//Loads table to manage all controls
		table = new Table();
		table.setPosition(getStage().getWidth()/2, 0);
		//Loads Loading Gear Resource
		Texture txrLoadingGear = UtilsAssets.loadTexture(Assets.DIR_IMAGES+"/"+Assets.img_loading_gear, Filter.Linear_Linear);
		TextureRegion trLoadingGear = new TextureRegion(txrLoadingGear);
		loadingGear = new EmptyActorLight(txrLoadingGear.getWidth(), txrLoadingGear.getHeight(), true);
		loadingGear.setTextureRegion(trLoadingGear, true);
		//Loads Loading Text Label
		font = UtilsAssets.loadFont(Assets.DIR_FONTS+"/"+Assets.font_default,false, Filter.Linear_Linear);
		LabelStyle lbStyle = new LabelStyle(font, null);
		loadingText = new Label("LOADING", lbStyle);
		//Add controls to table
		table.add(loadingGear).center().pad(5f).row();
		table.add(loadingText).center().pad(5f);
		
		
		/**
		 * Adjust rotation origin
		 */
		UtilsOrigin.setActorOrigin(loadingGear, Origin.CENTER);
		
		/**
		 * Add animation to controls
		 */
		table.addAction(Actions.moveTo(getStage().getWidth()/2, getStage().getHeight()/2,ANIM_MOVE_DURATION));
		
		
		/**
		 * Add actor to stage
		 */
		getStage().addActor(table);
		
		/**
		 * Set loading time screen
		 */
		setLoadingTime(LOADING_SCREEN_DURATION);
	}
	
	@Override
	public void render(float delta) {
		super.render(delta);
		
		if (getGame().getAssets().getAssetManager().update()) {
			if(getSecondsTime() > getLoadingTime() && !isNextScreenSet) {
				//TODO Transition to Main Menu Screen
				
				/**
				 * Next screen set
				 */
				isNextScreenSet = true;
			}
		}
		
		/**
		 * Rotate Loading Gear
		 */
		loadingGear.rotate(2);
	}
	//-------------------------------------------
}
