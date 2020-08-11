package com.example.dagger2demo.test3;

import com.example.dagger2demo.MainActivity;

import java.lang.reflect.Type;

import dagger.Component;
import dagger.Module;

@Component(modules =  Stu3Module.class )
public interface Stu3Component {
     void inject(MainActivity activity);
}
