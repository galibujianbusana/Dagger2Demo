package com.example.dagger2demo.page3.case1;

import dagger.Component;

@Component(modules = PeopleModule.class)
public interface PeopleComponent {
    // BoyComponent 依赖 ，则需要向外面提供People
    People getPeople();

}
