package com.example.dagger2demo.test;

import com.example.dagger2demo.MainActivity;

import dagger.Component;
@PerActivity
@Component(dependencies = ApplicationComponent.class,modules = CModule.class)
public interface MainActivityComponent {
    void inject(MainActivity activity);
}
