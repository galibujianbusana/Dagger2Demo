package com.example.dagger2demo.page4;

import dagger.Module;
import dagger.Provides;

@Module
public class AModule {

    @Provides
    public User getUser(){
        return new User("guo","22");
    }
}
