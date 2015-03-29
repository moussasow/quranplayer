package com.mas.sow.quranplayer.util;

import android.content.Context;
import android.support.v4.app.NotificationCompat;
import android.widget.RemoteViews;

import com.mas.sow.quranplayer.R;

/**
 * Created by Sow on 2015/03/29.
 */
public class NotificationUtil {

    public static void showNotification( Context context){
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context);

        RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.activity_main);
    }
}
