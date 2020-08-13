package com.example.dagger2demo.page4;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {
    @Provides
    public UserBase provideUserBase(){
        return new UserBase("baseGuo","22");
    }
}
