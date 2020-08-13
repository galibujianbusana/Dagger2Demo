package com.example.dagger2demo.page2;

import dagger.Module;
import dagger.Provides;

@Module
public class SourceModule {

    @Provides
    LocalSource provideLocalSource() {
        return new LocalSource();
    }
}
