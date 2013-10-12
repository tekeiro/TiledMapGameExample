package com.keirobm.tiledmapexample.assets;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.moribitotech.mtx.animation.AnimationCreator;
import com.moribitotech.mtx.asset.AbstractAssets;
import com.moribitotech.mtx.interfaces.IAssets;

public class Assets extends AbstractAssets implements IAssets {
	
	//------------- CONSTANTS -------------------
	//--- STRINGS ---
	public static final String TITLE = "Tiled Map Game Example";
	
	//--- DIRS ----
	public static final String DIR_FONTS = "fonts";
	public static final String DIR_IMAGES = "images";
	public static final String DIR_MAPS = "maps";
	public static final String DIR_ATLAS = "atlas";
	
	//--- IMAGES ---
	public static final String img_loading_gear = "img_loading_gear.png";
	
	//--- FONTS ---
	public static final String font_default = "default";
	public static final String font_default_file = "default.fnt";
	public static final String font_default_img= "default.png";
	private static BitmapFont fnt;
	
	//--- ATLAS FILE ---
	public static final String tmg_atlas = "tmg_atlas.atlas";
	public static final String reg_logo = "logo";
	public static final String reg_grass = "hierba";
	public static final String reg_btExit = "btExit";
	public static final String reg_btPlay = "btPlay";
	public static final String reg_swype = "swype";
	public static final String reg_down = "down";
	public static final String reg_left = "left";
	public static final String reg_up = "up";
	public static final String reg_right = "right";
	public static final String reg_drop = "gota";
	
	//--- TMG ATLAS ---
	private static TextureAtlas taAtlas = null;
	private static TextureRegion trLogo = null;
	private static TextureRegion trGrass = null;
	private static TextureRegion trBtExit = null;
	private static TextureRegion trBtPlay = null;
	private static TextureRegion trSwype = null;
	//private static TextureRegion trDown = null;
	//private static TextureRegion trLeft = null;
	//private static TextureRegion trRight = null;
	//private static TextureRegion trUp = null;
	private static TextureRegion trDrop = null;
	
	//--- TMG ATLAS ANIMATIONS ---
	public static final int ANIM_FRAMES = 3;
	public static final float ANIM_DURATION = 0.65f;
	private static Animation anDown = null;
	private static Animation anLeft = null;
	private static Animation anRight = null;
	private static Animation anUp = null;
	
	
	
	//-------------------------------------------
	
	
	//------------ PROPERTIES ------------------
	//--- TMG ATLAS ---
	public static TextureAtlas getAtlas() {
		return taAtlas;
	}
	
	//--- REGIONS ---
	public static TextureRegion getLogoRegion() {
		return trLogo;
	}	
	public static TextureRegion getGrassRegion() {
		return trGrass;
	}	
	public static TextureRegion getBtExitRegion() {
		return trBtExit;
	}	
	public static TextureRegion getBtPlayRegion() {
		return trBtPlay;
	}	
	public static TextureRegion getSwypeRegion() {
		return trSwype;
	}	
	public static TextureRegion getDropRegion() {
		return trDrop;
	}
	
	//--- ANIMATIONS ---
	public static Animation getDownAnimation() {
		return anDown;
	}
	public static Animation getUpAnimation() {
		return anUp;
	}
	public static Animation getLeftAnimation() {
		return anLeft;
	}
	public static Animation getRightAnimation() {
		return anRight;
	}
	
	//--- FONTS ---
	public static BitmapFont getDefaultFont() {
		return fnt;
	}

	//------------------------------------------------
	
	//------------------------------------------
	
	
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
		if (taAtlas==null)
			taAtlas = new TextureAtlas(Gdx.files.internal(DIR_ATLAS + "/" + tmg_atlas));

	}
	
	
	@Override
	public void loadImages() {
		trBtExit = getAtlas().findRegion(reg_btExit);
		trBtPlay = getAtlas().findRegion(reg_btPlay);
		trDrop = getAtlas().findRegion(reg_drop);
		trGrass = getAtlas().findRegion(reg_grass);
		trLogo = getAtlas().findRegion(reg_logo);
		trSwype = getAtlas().findRegion(reg_swype);
	}
	
	
	
	@Override
	public void loadFonts() {
		fnt = new BitmapFont(Gdx.files.internal(DIR_FONTS+"/"+font_default_file), Gdx.files.internal(DIR_FONTS+"/"+font_default_img), false);
	}

	@Override
	public void loadAnimations() {
		anDown = AnimationCreator.getAnimationFromSingleTexture(getAtlas(), reg_down, ANIM_FRAMES, ANIM_DURATION);
		anLeft = AnimationCreator.getAnimationFromSingleTexture(getAtlas(), reg_left, ANIM_FRAMES, ANIM_DURATION);
		anRight = AnimationCreator.getAnimationFromSingleTexture(getAtlas(), reg_right, ANIM_FRAMES, ANIM_DURATION);
		anUp = AnimationCreator.getAnimationFromSingleTexture(getAtlas(), reg_up, ANIM_FRAMES, ANIM_DURATION);

	}

	@Override
	public void loadSoundsAndMusics() {
		

	}
	//-------------------------------------------
}
