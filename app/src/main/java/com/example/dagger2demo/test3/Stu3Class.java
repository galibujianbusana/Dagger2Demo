package com.example.dagger2demo.test3;

import com.example.dagger2demo.test.Type;

import java.security.cert.TrustAnchor;

import javax.inject.Inject;

public class Stu3Class {


    public Type3 type;

    @Inject Stu3Class(Type3 type){
        this.type = type;
    }

}
