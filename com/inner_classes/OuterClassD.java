package com.inner_classes;

public class OuterClassD {
    MyInterface myInterface=new MyInterface() {
        @Override
        public void methodA() {
            System.out.println("Hello World");
        }

        @Override
        public void methodB() {
            System.out.println("Bye World");
        }
    };

    MyClass myClass=new MyClass(){
        public void anotherMethod(int num){
            System.out.println("Hello World"+num);
        }
    };

    MyClass myClass2=new MyClass();

    public void method(){
        myClass.anotherMethod();
        myClass2.anotherMethod();
    }
}
