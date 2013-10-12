package com.keirobm.tiledmapexample;


import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.keirobm.tiledmapexample.assets.Assets;
import com.keirobm.tiledmapexample.screens.LoadingScreen;
import com.moribitotech.mtx.android.IAndroidObject;
import com.moribitotech.mtx.game.AbstractGame;
import com.moribitotech.mtx.managers.SettingsManager;
import com.moribitotech.mtx.settings.AppSettings;
import com.moribitotech.mtx.settings.MtxLogger;

public class TiledMapExampleMain extends AbstractGame {
	
	//--------------  CONSTANTS ----------------------
	/**
	 * World Target Constants
	 */
	public static final int WORLD_TARGET_WIDTH = 960;
	public static final int WORLD_TARGET_HEIGHT = 540;
	
	/**
	 * Desktop Dimensions
	 */
	public static final int DESKTOP_WIDTH = 800;
	public static final int DESKTOP_HEIGHT = 600;
	
	/**
	 * Constructor for Main Class
	 * @param androidObject
	 */
	public TiledMapExampleMain(IAndroidObject androidObject){
		setAndroidObject(androidObject);
	}
	
	/**
	 * Will be called on creation process
	 */
	@Override
	public void create() {
		super.create();
		//Nothing to do here
	}
	
	/**
	 * Set up application general settings
	 */
	@Override
	public void setUpAppSettings() {
		/**
		 * Set up application settings class using DIPActive and
		 * based on screen resolution of device
		 */
		AppSettings.setUp(Gdx.graphics.getWidth(),    // Screen width
						  Gdx.graphics.getHeight(),   // Screen height
						  Gdx.graphics.getWidth(),	  // World width resolution
						  Gdx.graphics.getHeight(),   // World height resolution
						  WORLD_TARGET_WIDTH,		  // World target width
						  WORLD_TARGET_HEIGHT		  // World target height
						  );
	   
		
		/**
		 * Set logs true for development
		 */
		//TODO Set MTX Logs false when release
		MtxLogger.setLogs(true);
		
		
		/**
		 * Do things for first launch
		 */
		if (!SettingsManager.isFirstLaunchDone()) {
			//TODO Puts first launch actions to do
		}		
	}
	
	
	/**
	 * Load all assets or resources for application
	 */
	@Override
	public void setUpAssets() {
		
		Assets assets = new Assets();
		assets.loadAll();
		setAssets(assets);
	}
	
	
	/**
	 * Go to Loading Screen
	 */
	@Override
	public void setUpLoadingScreen() {
		setScreen(new LoadingScreen(this, Assets.TITLE));
	}
	
}
