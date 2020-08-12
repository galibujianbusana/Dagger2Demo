package com.example.dagger2demo.test;

import android.app.Application;
import android.location.LocationManager;
import android.util.Log;

import androidx.annotation.LongDef;

import javax.inject.Inject;

public class DemoApplication extends Application {

    private static final String TAG = "DemoApplication";

    @Inject  LocationManager locationManager;
    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent.builder()
                .androidModule(new AndroidModule(this))
                .build();
        applicationComponent.inject(this);
        Log.d(TAG, "onCreate: " + (locationManager == null));

    }

    public ApplicationComponent component(){
        return  applicationComponent;
    }
}
