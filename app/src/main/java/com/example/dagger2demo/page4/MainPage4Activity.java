package com.example.dagger2demo.page4;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;


import com.example.dagger2demo.R;

import javax.inject.Inject;

public class MainPage4Activity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Inject
    UserBase userBase;

    @Inject
    User user;


    ApplicationComponent appCompatActivity;
    AComponent component;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_case1);
        appCompatActivity = BaseApplication.getInstance().getApplicationComponent();
        component = appCompatActivity.plus(new AModule());
        component.inject(this);

        Log.d(TAG, "onCreate: userBase:" + userBase.toString()
         + " user: " + user.toString());


    }
}