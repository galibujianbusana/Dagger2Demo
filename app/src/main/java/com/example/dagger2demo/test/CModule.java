package com.example.dagger2demo.test;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class CModule {
    @ForGuo
    @Provides
    Test3 getGxw(){
        return new Test3("gxw");
    }

    @ForGail
    @Provides
    Test3 getGali(){
        return  new Test3("gali");
    }
}
