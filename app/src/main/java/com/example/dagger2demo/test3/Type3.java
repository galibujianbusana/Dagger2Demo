package com.example.dagger2demo.test3;

public class Type3 {

    public String name;
    public String age;

    public Type3(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Type3{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
