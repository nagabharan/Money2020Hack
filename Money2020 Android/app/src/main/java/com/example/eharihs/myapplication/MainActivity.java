package com.example.eharihs.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;


import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reply);
        Intent serviceIntent = new Intent(this,SmsReceiver.class);
        //serviceIntent.setAction(".SmsReceiver");
        startService(serviceIntent);

        String savedData = LockPatternUtils.loadFromPreferences(this);
        if (savedData == null) {
            Intent intent = new Intent(this, SetLockPatternActivity.class);
            startActivity(intent);
        }
    }


}
