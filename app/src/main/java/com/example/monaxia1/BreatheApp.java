package com.example.monaxia1;

import android.app.Application;

public class BreatheApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        BreathePreferences.init(getApplicationContext());
    }

}
