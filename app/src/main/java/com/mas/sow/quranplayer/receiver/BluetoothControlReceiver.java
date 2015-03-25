package com.mas.sow.quranplayer.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;

/**
 * Created by Sow on 2015/03/25.
 */
public class BluetoothControlReceiver extends BroadcastReceiver{

    @Override
    public void onReceive(Context context, Intent intent) {
        final KeyEvent event = intent.getParcelableExtra(Intent.EXTRA_KEY_EVENT);
        if( event.getAction() == KeyEvent.ACTION_DOWN){
            final int keycode = event.getKeyCode();
        }
        abortBroadcast();
    }
}
