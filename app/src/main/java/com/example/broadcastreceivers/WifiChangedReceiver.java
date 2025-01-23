package com.example.broadcastreceivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.widget.Toast;

public class WifiChangedReceiver extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        int wifiState = intent.getIntExtra(WifiManager.EXTRA_WIFI_STATE, WifiManager.WIFI_STATE_UNKNOWN);

        if (wifiState == WifiManager.WIFI_STATE_ENABLED) {
            Toast.makeText(context, "Wi-Fi is Enabled", Toast.LENGTH_LONG).show();
        } else if (wifiState == WifiManager.WIFI_STATE_DISABLED) {
            Toast.makeText(context, "Wi-Fi is Disabled", Toast.LENGTH_LONG).show();
        }
    }
}
