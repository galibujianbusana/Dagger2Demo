package com.example.dagger2demo.test;

import android.location.LocationManager;

import javax.inject.Inject;

public class Test3 {
    private LocationManager locationManager;

    @Inject public Test3(LocationManager locationManager) {
        this.locationManager = locationManager;
    }
}
