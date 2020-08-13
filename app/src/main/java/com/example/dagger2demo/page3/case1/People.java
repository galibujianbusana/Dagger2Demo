package com.example.dagger2demo.page3.case1;

public class People {

    private String name;

    private String age;

    public People(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
