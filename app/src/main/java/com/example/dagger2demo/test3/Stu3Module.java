package com.example.dagger2demo.test3;

import dagger.Module;
import dagger.Provides;

@Module(includes = {Type3Module.class})
public class Stu3Module {

    @Provides Stu3Class provideStu3(Type3 type3){
        return  new Stu3Class(type3);
    }


}
