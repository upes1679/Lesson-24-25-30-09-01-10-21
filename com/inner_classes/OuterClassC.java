package com.inner_classes;

public class OuterClassC {
    private int data = 10;

    public void method() {
        int number = 1;
        class LocalInnerClass {
            void innerMethod() {
                System.out.println("Inner method! " + data);
                System.out.println(number);
            }
        }
        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.innerMethod();
    }
}
