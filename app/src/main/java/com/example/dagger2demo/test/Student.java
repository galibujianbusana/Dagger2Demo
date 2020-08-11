package com.example.dagger2demo.test;

import javax.inject.Inject;

public class Student {



    private Type type;

    @Inject public Student(Type type) {

        this.type = type;
    }

    public Type getType(){
        return type;
    }

    @Override
    public String toString() {
        return "Student{" +
                "type=" + type +
                '}';
    }
}
