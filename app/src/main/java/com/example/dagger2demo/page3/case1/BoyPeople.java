package com.example.dagger2demo.page3.case1;

import javax.inject.Inject;

public class BoyPeople {

    String sex;

    People people;

    public BoyPeople(String sex, People people) {
        this.sex = sex;
        this.people = people;
    }

    @Override
    public String toString() {
        return "BoyPeople{" +
                "sex='" + sex + '\'' +
                ", people=" + people +
                '}';
    }
}
