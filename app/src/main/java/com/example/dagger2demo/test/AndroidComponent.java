package com.example.dagger2demo.test;

import com.example.dagger2demo.MainActivity;

import dagger.Component;

@Component(modules = AndroidModule.class)
public interface AndroidComponent {

    void inject(MainActivity activity);
}
