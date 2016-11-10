package com.example.admin.hday14_progit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.LoginFilter;
import android.util.Log;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "she";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(TAG, "onCreate: clone  clone  ");
    }
}
