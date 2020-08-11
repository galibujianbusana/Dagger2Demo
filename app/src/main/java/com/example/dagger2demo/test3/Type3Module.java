package com.example.dagger2demo.test3;

import dagger.Module;
import dagger.Provides;

@Module
public class Type3Module {
    @Provides
    Type3 provideType3(){
        return  new Type3("gxw","33");
    }
}
