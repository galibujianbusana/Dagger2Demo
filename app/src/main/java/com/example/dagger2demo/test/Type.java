package com.example.dagger2demo.test;

import javax.inject.Inject;

public class Type {

    public String name = "guo";

    public String age = "18";

    @Inject public Type(String name, String age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Type{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
