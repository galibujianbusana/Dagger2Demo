package com.example.dagger2demo.test;

import dagger.Module;
import dagger.Provides;

@Module
public class StuModule {

    @Provides
     Student provideStu( ){
        return  new Student();
    }
}
