package com.example.dagger2demo.test;

import android.content.Context;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Test {

    private Context mContext;

    @Inject
    public Test(Context mContext) {
        this.mContext = mContext;
    }
}
