package com.aaxs.nitrov17.intentsandbroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.widget.Toast;

/**
 * Created by NitroV17 on 11/26/2016.
 */


public class MyReceiver extends BroadcastReceiver {

    MainActivity mainActivity = new MainActivity();

    public void onReceive(Context context, Intent intent) {

       mainActivity.trigger(context, intent);

    }
}
