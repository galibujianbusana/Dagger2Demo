package com.example.dagger2demo.page2;


import dagger.Subcomponent;

@Subcomponent
public interface SubSourceComponent {
    public void inject(SubRepository subRepository);
}
