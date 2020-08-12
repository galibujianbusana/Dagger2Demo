package com.example.dagger2demo.test;

import android.content.Context;
import android.location.LocationManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AndroidModule {

    private final DemoApplication  application;

    public AndroidModule(DemoApplication application) {
        this.application = application;
    }

    @Provides
    Context ApplicationContext(){
        return  application;
    }

    @Provides
    LocationManager provideLocationManager(){
        return (LocationManager) application.getSystemService(Context.LOCATION_SERVICE);
    }

    @Singleton
    @Provides
    Test2 provideTest(){
        return  new Test2(application);
    }
}
