package com.example.dagger2demo.page4;

import android.app.Application;

public class BaseApplication extends Application {

    private ApplicationComponent mApplicationComponent;

    private static BaseApplication sApplication;

    public static BaseApplication getInstance() {
        return sApplication;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        sApplication = this;
        mApplicationComponent = DaggerApplicationComponent.builder().build();
    }

    public ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }


}
