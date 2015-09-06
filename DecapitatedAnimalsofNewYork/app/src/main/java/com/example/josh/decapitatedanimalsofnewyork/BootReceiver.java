package com.example.josh.decapitatedanimalsofnewyork;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class BootReceiver extends BroadcastReceiver {
    public BootReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent locIntent = new Intent(context, LocationService.class);
        context.startService(locIntent);

    }
}
