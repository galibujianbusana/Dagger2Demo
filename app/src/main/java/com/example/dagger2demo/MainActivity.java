package com.example.dagger2demo;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dagger2demo.test.AndroidModule;
import com.example.dagger2demo.test.CModule;
import com.example.dagger2demo.test.DaggerApplicationComponent;
import com.example.dagger2demo.test.DaggerMainActivityComponent;
import com.example.dagger2demo.test.DemoApplication;
import com.example.dagger2demo.test.Test;
import com.example.dagger2demo.test.Test2;
import com.example.dagger2demo.test.Test3;

import javax.inject.Inject;


public class MainActivity extends AppCompatActivity  {

    private static final String TAG = "MainActivity";

    Button btn;

    @Inject
    Test3 test1;

    @Inject
    Test3 test2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

        DaggerApplicationComponent.builder()
                .androidModule(new AndroidModule((DemoApplication) getApplication()))
                .build()
                .inject(this);

        DaggerMainActivityComponent.builder()
                .applicationComponent(((DemoApplication) getApplication()).component())
                .build().inject(this);
        Log.d(TAG, "onCreate: test1 == null ?" + (test1 == null));
        Log.d(TAG, "onCreate: test2 == test1" + (test1 == test2));

    }


}