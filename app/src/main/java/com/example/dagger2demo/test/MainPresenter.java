package com.example.dagger2demo.test;

import android.content.Context;
import android.widget.Toast;

import javax.inject.Inject;

public class MainPresenter {

    IMainView view;

    @Inject public MainPresenter(IMainView view) {
        this.view = view;
    }

    public void login(User user){

        Context mContext = view.getContext();
        Toast.makeText(mContext,"login......", Toast.LENGTH_SHORT).show();
    }

}
