package com.example.dagger2demo.test;

import javax.inject.Inject;
import javax.inject.Scope;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class StuModule {


    @Provides @Singleton
    Type getType() {
        return new Type("gxw", "28");
    }

    @Provides
    Student provideStu() {
        return new Student(getType());
    }




}
