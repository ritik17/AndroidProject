package com.example.ritik.recievr;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyReciever extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String msg="hello: ";
        Toast.makeText(context, "Intent Detected", Toast.LENGTH_LONG).show();
        Log.d(msg, "DETECTED");
    }
}
