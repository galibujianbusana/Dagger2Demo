package com.example.dagger2demo.test3;

import javax.inject.Inject;

public class Stu3Class {


    public Type3 type;

    @Inject Stu3Class(Type3 type){
        this.type = type;
    }

    @Override
    public String toString() {
        return "Stu3Class{" +
                "type=" + type +
                '}';
    }
}
