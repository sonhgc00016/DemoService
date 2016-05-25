package com.sh.demoservice.receivers;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.sh.demoservice.services.AndroidServiceStartOnBoot;

/**
 * Created by SonH on 2016-05-25.
 */
public class BroadcastReceiverOnBootComplete extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction().equalsIgnoreCase(Intent.ACTION_BOOT_COMPLETED)){
            Intent serviceIntent = new Intent(context, AndroidServiceStartOnBoot.class);
            context.startService(serviceIntent);
        }
    }
}
