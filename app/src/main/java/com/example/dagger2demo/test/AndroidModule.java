package com.example.dagger2demo.test;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

@Module
public class AndroidModule {


    @Provides
    public User getUser() {
        return new User("gxw", "3");
    }

}
