package com.example.dagger2demo.test3;

import com.example.dagger2demo.test.Type;

import dagger.Module;
import dagger.Provides;

@Module
public class Stu3Module {

    @Provides Stu3Class provideStu3(Type3 type3){
        return  new Stu3Class(type3);
    }
}
