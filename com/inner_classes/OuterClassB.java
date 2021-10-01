package com.inner_classes;

public class OuterClassB {
    private int data;
    private static int static_data_outer;
    public OuterClassB(int data,int static_data_outer){
        this.data=data;
        this.static_data_outer=static_data_outer;
    }

    public void outerMethod(){
        System.out.println("data: "+data);
        System.out.println(StaticInnerClass.static_data);
    }

    static class StaticInnerClass{
        private static int static_data;

        public StaticInnerClass(int static_data){
            this.static_data=static_data;
        }
        public void innerMethod(){
            System.out.println("data: "+static_data);
        }
    }
}
