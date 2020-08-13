package com.example.dagger2demo.page4;

import dagger.Component;


@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    UserBase getUserBase();
    AComponent plus(AModule module);
}


