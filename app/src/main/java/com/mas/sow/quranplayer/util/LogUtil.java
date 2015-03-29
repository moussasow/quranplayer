package com.mas.sow.quranplayer.util;

import android.util.Log;

import com.mas.sow.quranplayer.BuildConfig;

/**
 * Created by Sow on 2015/03/25.
 */
public class LogUtil {

    public static void d( String tag, String msg){
        if(BuildConfig.DEBUG){
            Log.d(tag, msg);
        }
    }
}
