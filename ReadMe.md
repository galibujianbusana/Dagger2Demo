1.  AndroidModule 类如果是有参构造函数，必须调用 androidModule() 传入参数
2.  Singleton 注解在类顶部可以实现单例
3.  dev1.3 实现简q单的自定义注解
4.  dev1.4 @Name 使用
5.  dev1.5 自定义注解替代@Name 使用 对比参照 dev1.4 
    ```java
        @Module
       public class CModule {
           @ForGuo
           @Provides
           Test3 getGxw(){
               return new Test3("gxw");
           }
       
           @ForGail
           @Provides
           Test3 getGali(){
               return  new Test3("gali");
           }
       }
    ```
    
    ```java
     @Module
           public class CModule {
               @Name("Guo")
               @Provides
               Test3 getGxw(){
                   return new Test3("gxw");
               }
           
               @Name("gali")
               @Provides
               Test3 getGali(){
                   return  new Test3("gali");
               }
           }
    
    ```
    
6. page3.case1/case2 里面是 @dependencies 使用

7. page4 @Subcomponent 使用

