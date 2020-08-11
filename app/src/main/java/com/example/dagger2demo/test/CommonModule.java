package com.example.dagger2demo.test;

import dagger.Module;
import dagger.Provides;

@Module
public class CommonModule {

    private MainView view;

    public CommonModule(MainView view) {
        this.view = view;
    }

    @Provides public MainView provideMainView(){
        return  this.view;
    }

}
