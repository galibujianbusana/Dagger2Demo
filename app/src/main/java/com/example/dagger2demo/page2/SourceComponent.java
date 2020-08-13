package com.example.dagger2demo.page2;

import dagger.Component;

@Component(dependencies = DependencyComponent.class, modules = SourceModule.class)
public interface SourceComponent {

    public void inject(DataRepository dataRepository);

    SubSourceComponent getSubSourceComponent();
}
