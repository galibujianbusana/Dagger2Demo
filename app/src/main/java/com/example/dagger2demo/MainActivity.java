package com.example.dagger2demo;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dagger2demo.test.AndroidModule;
import com.example.dagger2demo.test.DaggerApplicationComponent;
import com.example.dagger2demo.test.DemoApplication;
import com.example.dagger2demo.test.Test;
import com.example.dagger2demo.test.Test2;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity  {

    private static final String TAG = "MainActivity";

    Button btn;

    @Inject
    Test test;

    @Inject
    Test test2;


    @Inject
    Test2 test2_0;

    @Inject
    Test2 test2_1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: test is null ?  " + (test == null));
            }
        });
        DaggerApplicationComponent.builder()
                .androidModule(new AndroidModule((DemoApplication) getApplication()))
                .build()
                .inject(this);

        Log.d(TAG, "onCreate: test == test2: " + (test == test2));


        Log.d(TAG, "onCreate: test2_0 is null ?" + (test2_0 == null));
        Log.d(TAG, "onCreate: test2_0 == test2_1: " + (test2_0 == test2_1));


    }


}