package com.example.dagger2demo.test;

import com.example.dagger2demo.MainActivity;

import dagger.Component;

@Component
public interface StudentComponent {

    void inject(MainActivity activity);
}
