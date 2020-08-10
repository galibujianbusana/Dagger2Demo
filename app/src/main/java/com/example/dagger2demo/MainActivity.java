package com.example.dagger2demo;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dagger2demo.test.DaggerStudentComponent;
import com.example.dagger2demo.test.Student;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Inject Student student;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(student == null){
            Log.d(TAG, "onCreate: null");
        }
        DaggerStudentComponent.builder().build().inject(this);










    }
}