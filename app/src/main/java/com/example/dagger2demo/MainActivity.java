package com.example.dagger2demo;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dagger2demo.test3.DaggerStu3Component;
import com.example.dagger2demo.test3.Stu3Class;
import com.example.dagger2demo.test3.Stu3Module;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

   /* @Inject
    Student student;*/

   /* @Inject
    Stu2Class stu2Class;*/

    @Inject
    Stu3Class stu3Class;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // test1
        // DaggerStudentComponent.builder().build().inject(this);
        // Log.d(TAG, "onCreate: Stu: name:" + student.toString());
        // test2
        // DaggerStu2Component.builder().build().inject();
        DaggerStu3Component.builder().build().inject(this);
        DaggerStu3Component.builder().stu3Module(new Stu3Module()).build().inject(this);
        Log.d(TAG, "onCreate: " + stu3Class.toString());

    }
}