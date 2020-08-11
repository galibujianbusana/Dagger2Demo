package com.example.dagger2demo.test;

import com.example.dagger2demo.MainActivity;

import dagger.Component;

@Component(modules = StudentModule.class)
public interface StudentComponent {

    void inject(MainActivity activity);
}
