package com.example.dagger2demo.test;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import javax.inject.Inject;

public class MainPresenter {

    MainView view;

    @Inject public MainPresenter(MainView view) {
        this.view = view;
    }

    public void login(){

        view.log();
        Log.d("TAG", "login: user ");
    }

}
