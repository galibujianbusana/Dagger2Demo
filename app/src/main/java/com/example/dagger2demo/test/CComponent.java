package com.example.dagger2demo.test;

import com.example.dagger2demo.MainActivity;

import dagger.Component;

@Component(modules = CModule.class)
public interface  CComponent {
    void  inject(MainActivity activity);
}
