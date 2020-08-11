package com.example.dagger2demo.test;

/**
 * 假设该类为第三方类，不能再构造函数上使用@Inject时，则使用@Module提供该类实例
 */
public class Student {

    private String name;

    private String age;

    public Student(String name,String age) {

        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
