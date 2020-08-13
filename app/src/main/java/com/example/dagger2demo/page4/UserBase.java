package com.example.dagger2demo.page4;

public class UserBase {

    private String name;

    private String age;

    public UserBase(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User2{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
