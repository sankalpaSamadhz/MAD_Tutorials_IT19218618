package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtVMsg2 = findViewById(R.id.TvMsg2);
        txtVMsg2.setText(R.string.Msg2);

        //LifeCycle Part

        log.i( tag:"LifeCycle", msg:"OnCreate() invoked..");

        Log.i(TAG , "OnCreate() invoked.. ");



    }

    @Override
    protected void onStart() {
        super.onStart();


        Log.i(TAG , "onStart Called: ");

        log.i( tag:"LifeCycle", msg:"onStart Called:");

    }


    @Override
    protected void onRestart() {
        super.onRestart();


        Log.i(TAG, "onRestart: ");

        log.i( tag:"LifeCycle", msg:"onRestart:");
    }


    @Override
    protected void onResume() {
        super.onResume();
    }




}