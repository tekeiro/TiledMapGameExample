package com.keirobm.tiledmapexample;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		/**
		 * Set Lwjgl Configuration for this app
		 */
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = TiledMapExampleMain.TITLE;
		cfg.useGL20 = false;
		cfg.width = TiledMapExampleMain.DESKTOP_WIDTH;
		cfg.height = TiledMapExampleMain.DESKTOP_HEIGHT;
		
		
		/**
		 * Initialize our app
		 * Passed null as IAndroidObject because its a desktop launch
		 */
		new LwjglApplication(new TiledMapExampleMain(null), cfg);
	}
}
