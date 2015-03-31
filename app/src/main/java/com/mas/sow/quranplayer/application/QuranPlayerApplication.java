package com.mas.sow.quranplayer.application;

import android.app.Application;

/**
 * Created by Sow on 2015/03/25.
 */
public class QuranPlayerApplication extends Application {

    private static QuranPlayerApplication sInstance;

    public static QuranPlayerApplication getsInstance(){
        return sInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
    }
}
