package com.aaxs.nitrov17.intentsandbroadcast;

import android.content.Context;
import android.content.Intent;
import android.icu.util.Calendar;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    void trigger(Context context, Intent intent){

        if(Calendar.getInstance().get(Calendar.HOUR_OF_DAY)==17)
            Toast.makeText(context, "Intent Detected", Toast.LENGTH_SHORT).show();
    }
}
