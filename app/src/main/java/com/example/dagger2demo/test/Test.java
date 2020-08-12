package com.example.dagger2demo.test;

import android.content.Context;

import javax.inject.Inject;

public class Test {

    private User user;

    @Inject public Test(User user){
        this.user = user;
    }


    @Override
    public String toString() {
        return "Test{" +
                "user=" + user +
                '}';
    }
}
