package com.example.dagger2demo.page4;

import dagger.Subcomponent;

@Subcomponent(modules = AModule.class)
public interface AComponent {
    void inject(MainPage4Activity activity);
}

