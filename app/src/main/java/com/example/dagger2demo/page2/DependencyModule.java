package com.example.dagger2demo.page2;

import dagger.Module;
import dagger.Provides;

@Module
public class DependencyModule {

    @Provides
    DependencySource provideDependencySource() {
        return new DependencySource();
    }
}
