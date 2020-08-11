package com.example.dagger2demo.test;

import dagger.Module;
import dagger.Provides;

@Module
public class CommonModule {

    private IMainView view;

    public CommonModule(IMainView view) {
        this.view = view;
    }

    @Provides public IMainView provideMainView(){
        return  this.view;
    }

}
