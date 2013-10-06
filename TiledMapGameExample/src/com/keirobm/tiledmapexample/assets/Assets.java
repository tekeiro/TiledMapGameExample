package com.keirobm.tiledmapexample.assets;

import com.moribitotech.mtx.asset.AbstractAssets;
import com.moribitotech.mtx.interfaces.IAssets;

public class Assets extends AbstractAssets implements IAssets {
	
	//------------- CONSTANTS -------------------
	//--- DIRS ----
	public static final String DIR_FONTS = "fonts";
	public static final String DIR_IMAGES = "images";
	public static final String DIR_MAPS = "maps";
	
	//--- IMAGES ---
	public static final String img_loading_gear = "img_loading_gear.png";
	
	//--- FONTS ---
	public static final String font_default = "default";
	
	//-------------------------------------------
	
	//------------- METHODS -------------------
	
	@Override
	public void loadAll() {
		loadSkin();
		loadTextureAtlas();
		loadImages();
		loadFonts();
		loadAnimations();
		loadSoundsAndMusics();
	}
	
	
	@Override
	public void loadSkin() {
		

	}
	
	
	@Override
	public void loadTextureAtlas() {
		

	}
	
	
	@Override
	public void loadImages() {
		

	}
	
	
	
	@Override
	public void loadFonts() {
		

	}

	@Override
	public void loadAnimations() {
		

	}

	@Override
	public void loadSoundsAndMusics() {
		

	}
	//-------------------------------------------
}
