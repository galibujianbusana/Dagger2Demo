package com.example.dagger2demo.test;

import android.location.LocationManager;

import dagger.Module;
import dagger.Provides;

@Module
public class CModule {


    @PerActivity
    @Provides
    Test3 provideBody(LocationManager locationManager){

        return new Test3(locationManager);
    }
}
