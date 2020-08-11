package com.example.dagger2demo.test3;

import com.example.dagger2demo.MainActivity;

import dagger.Module;

@Module(includes = Type3Module.class)
public interface Type3Component {
    void inject(MainActivity activity);
}
