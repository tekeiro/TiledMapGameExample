package com.keirobm.tiledmapexample;

import android.os.Bundle;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.keirobm.tiledmapexample.backend.AndroidObject;


public class MainActivity extends AndroidApplication {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        /**
         * Set Android Configuration for this app
         */
        AndroidApplicationConfiguration cfg = new AndroidApplicationConfiguration();
        cfg.useGL20 = false;
        
        /**
         * Simple Android Object Backend
         * You cannot use ad controllers, intents, uris, etc... in LibGDX
         * for this moment
         */
        AndroidObject androidObject = new AndroidObject (this); 
        
        /**
         * Initialize and call our Main Class
         */
        initialize(new TiledMapExampleMain(androidObject), cfg);
    }
}