package com.example.dagger2demo.test;

import com.example.dagger2demo.MainActivity;

import dagger.Component;

@Component(modules = CommonModule.class)
public interface CommonComponent {
    void inject(MainActivity activity);
}
