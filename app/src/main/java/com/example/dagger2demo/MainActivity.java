package com.example.dagger2demo;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dagger2demo.test.CommonModule;
import com.example.dagger2demo.test.DaggerCommonComponent;
import com.example.dagger2demo.test.MainPresenter;
import com.example.dagger2demo.test.MainView;
import com.example.dagger2demo.test.User;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity  {

    private static final String TAG = "MainActivity";

    Button btn;

    @Inject
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        DaggerCommonComponent.builder().commonModule(new CommonModule(new MainView()))
                .build().inject(this);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainPresenter.login();
            }
        });

    }


}