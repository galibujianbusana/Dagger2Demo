package com.example.dagger2demo.test;

import dagger.Module;
import dagger.Provides;

@Module
public class StudentModule{
    @Provides Student provideStudent(){
        return  new Student("GUO","33");
    }
}
