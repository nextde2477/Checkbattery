package com.Elick.check;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        BatteryInfoBroadcastReceiver receiver = new BatteryInfoBroadcastReceiver();
        IntentFilter filter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
        registerReceiver(receiver, filter);
    }
}
