package com.example.dagger2demo.test;

import javax.inject.Inject;

public class Student {

    private String name;

    private String age;

    @Inject public Student() {

        this.name = "GUO";
        this.age = "22";
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
