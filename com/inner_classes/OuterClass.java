package com.inner_classes;

public class OuterClass {
    private int data;
    private InnerClass innerClass;

    public OuterClass(int data) {
        this.data = data;
    }

    public void outerMethod(){
        System.out.println("Some data "+data);
        InnerClass innerClass=new InnerClass(10);
      innerClass.innerMethod();
    }

    public InnerClass getInnerClass() {
        return innerClass;
    }

    public void setInnerClass(InnerClass innerClass) {
        this.innerClass = innerClass;
    }

    public class InnerClass{
        private int data_b;

        public InnerClass(int data_b) {
            this.data_b = data_b;
        }

        public void innerMethod(){
            System.out.println("Some data "+data_b);
        }
    }
}

