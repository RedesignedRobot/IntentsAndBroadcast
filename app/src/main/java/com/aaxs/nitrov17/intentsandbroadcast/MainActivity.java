package com.aaxs.nitrov17.intentsandbroadcast;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void trigger(Context context, Intent intent){


        Calendar calendar = Calendar.getInstance();
        if((int)calendar.get(Calendar.HOUR_OF_DAY)==15){

            Toast.makeText(context, "Triggered", Toast.LENGTH_SHORT).show();

        }

    }
}
