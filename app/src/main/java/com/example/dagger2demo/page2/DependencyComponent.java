package com.example.dagger2demo.page2;


import dagger.Component;

@Component(modules = DependencyModule.class)
public interface DependencyComponent {
    DependencySource getDependencySource();
}
