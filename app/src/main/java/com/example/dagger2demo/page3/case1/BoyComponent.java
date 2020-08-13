package com.example.dagger2demo.page3.case1;

import dagger.Component;

@Component(dependencies = PeopleComponent.class, modules = BoyModule.class)
public interface BoyComponent {
    void  inject(Case1Activity activity);
}
