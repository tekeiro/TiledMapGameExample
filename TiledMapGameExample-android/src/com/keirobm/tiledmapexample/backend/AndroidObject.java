package com.keirobm.tiledmapexample.backend;

import android.app.Activity;

import com.moribitotech.mtx.android.IAdController;
import com.moribitotech.mtx.android.IAndroidIntents;
import com.moribitotech.mtx.android.IAndroidObject;
import com.moribitotech.mtx.android.IScoreLoop;

/**
 * Create a simple IAndroidObject implementation
 * @author Angel
 *
 * High functionality is not necesary
 */
public class AndroidObject implements IAndroidObject {
	//-------- MEMBERS ----------------
	private Activity mActivity;
	//---------------------------------
	
	//-------- CONSTRUCTOR ------------
	public AndroidObject (Activity activity) {
		mActivity = activity;
	}
	//---------------------------------

	
	//--------  PROPERTIES ------------
	/**
	 * Get for Activity
	 * @return Activity object
	 */
	public Activity getActivity() {
		return this.mActivity;
	}
	
	/**
	 * Set for Activity
	 * @param activity Activity object
	 */
	public void setActivity(Activity activity) {
		mActivity = activity;
	}
	//---------------------------------
	
	
	//------- METHODS -----------------
	
	/**
	 * This methods are not necesary at this moment
	 * Its for Ads or Intents functionalities
	 */
	
	@Override
	public IAdController getAdController() {
		return null;
	}

	@Override
	public IAndroidIntents getAndroidIntents() {
		return null;
	}

	@Override
	public IScoreLoop getScoreLoop() {
		return null;
	}
	//-----------------------------------

}
