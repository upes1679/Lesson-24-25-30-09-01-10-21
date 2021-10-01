package com.inner_classes_advanced;

public class OuterChildClassC extends OuterClassC{
    public void method(){
        System.out.println(outerData);
        outerMethod();
    }

    public class InnerChildClass extends InnerClass{
        public void innerClassMethod(){
            System.out.println(innerData);
            System.out.println(outerData);
        }
    }
}
