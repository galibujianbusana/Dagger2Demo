package com.example.dagger2demo.test;

import javax.inject.Inject;

public class Type {

    String name = "guo";

    String age = "18";

    @Inject public Type(String name, String age) {
        this.name = name;
        this.age = age;
    }


}
