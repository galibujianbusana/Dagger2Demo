package com.example.dagger2demo.test2;

import com.example.dagger2demo.MainActivity;

import dagger.Component;

@Component
public interface Stu2Component {

    Stu2Class inject();

}
