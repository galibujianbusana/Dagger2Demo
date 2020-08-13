package com.example.dagger2demo.page3.case1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.dagger2demo.R;

import javax.inject.Inject;

/**
 * @dependencies 注解使用
 */
public class Case1Activity extends AppCompatActivity {

    private static final String TAG = "Case1Activity";

    @Inject
    BoyPeople boyPeople;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_case1);
        PeopleComponent component = DaggerPeopleComponent.builder().build();
        DaggerBoyComponent.builder()
                .peopleComponent(component)
                .boyModule(new BoyModule("男"))
                .build()
                .inject(this);
        Log.d(TAG, "onCreate: "+ boyPeople.toString());


    }
}