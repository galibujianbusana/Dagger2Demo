package com.example.dagger2demo;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


import com.example.dagger2demo.test.DaggerAndroidComponent;
import com.example.dagger2demo.test.Test;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity  {

    private static final String TAG = "MainActivity";

    Button btn;


    @Inject
    Test test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: "+ test.toString());
            }
        });

        DaggerAndroidComponent.builder().build().inject(this);

    }


}