package com.inner_classes_advanced;

public class Main {
    public static void main(String[] args) {
        OuterClass outerClass=new OuterClass();
        OuterClass.InnerChildClass innerChildClass=outerClass.new InnerChildClass();
        innerChildClass.InnerMethod();
        System.out.println(innerChildClass.data);
        //--------------------------------------------
        StaticInnerChildClass staticInnerChildClass=new StaticInnerChildClass();
        staticInnerChildClass.method();
        //--------------------------------------------

        OuterClassD outerClassD=new OuterClassD();
        OuterClassD.InnerClass innerClassD=outerClassD.new InnerClass();
    }
}
