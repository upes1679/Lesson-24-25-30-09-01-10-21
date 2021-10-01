package com.inner_classes_advanced;

public class InnerChildClass extends OuterClassB.InnerClass{
    public InnerChildClass() {
        new OuterClassB().super();
    }

    public void method(){
        System.out.println(data);
    }
}
