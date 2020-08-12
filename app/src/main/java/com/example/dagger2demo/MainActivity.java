package com.example.dagger2demo;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dagger2demo.test.DaggerCComponent;
import com.example.dagger2demo.test.ForGail;
import com.example.dagger2demo.test.ForGuo;
import com.example.dagger2demo.test.Test3;

import javax.inject.Inject;
import javax.inject.Named;


public class MainActivity extends AppCompatActivity  {

    private static final String TAG = "MainActivity";

    Button btn;


    @ForGail
    @Inject
    Test3 test3;

    @ForGuo
    @Inject
    Test3 test3_2;

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
        DaggerCComponent.builder().build().inject(this);



        Log.d(TAG, "onCreate: " + test3.toString() +" - -" + test3_2.toString());

    }


}