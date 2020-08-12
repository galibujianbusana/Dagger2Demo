package com.example.dagger2demo.test;

public class Test3 {
    private String name;

    public Test3(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Test3{" +
                "name='" + name + '\'' +
                '}';
    }
}
