package com.example.dagger2demo.test;

import android.location.LocationManager;

import com.example.dagger2demo.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AndroidModule.class)
public interface ApplicationComponent {

    void inject(DemoApplication application);

    void inject(MainActivity activity);

    LocationManager getLocationManager();

}
