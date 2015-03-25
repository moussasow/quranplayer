package com.mas.sow.quranplayer.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * Created by Sow on 2015/03/25.
 */
public class PlayerService extends Service {
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }
}
