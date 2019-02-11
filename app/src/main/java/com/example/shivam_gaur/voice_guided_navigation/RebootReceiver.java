package com.example.shivam_gaur.voice_guided_navigation;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by Shivam_Gaur on 12-03-2017.
 */
public class RebootReceiver extends BroadcastReceiver {
    public RebootReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        // throw new UnsupportedOperationException("Not yet implemented");
        Intent myIntent = new Intent(context, MapsActivity.class);
        myIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        context.startActivity(myIntent);
    }
}

