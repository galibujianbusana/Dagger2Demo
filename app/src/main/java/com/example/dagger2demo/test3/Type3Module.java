package com.example.dagger2demo.test3;

import com.example.dagger2demo.test.Type;

import dagger.Module;
import dagger.Provides;

@Module
public class Type3Module {

    @Provides
    Type3 getType3(){
        return  new Type3("gxw","30");
    }
}
