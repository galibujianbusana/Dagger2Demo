package com.example.dagger2demo.page3.case1;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

@Module
public class BoyModule {


    private String sex;

    public BoyModule(String sex) {
        this.sex = sex;
    }

    @Provides
    String getSex() {
        return this.sex;
    }

    @Provides
    BoyPeople getBoyPeople(People people, String sex) {
        return new BoyPeople(sex, people);
    }

}
