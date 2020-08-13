package com.example.dagger2demo.page3.case1;

import dagger.Module;
import dagger.Provides;

@Module
public class PeopleModule {
    @Provides
    People providePeople() {
        return new People("guo", "22");
    }
}
