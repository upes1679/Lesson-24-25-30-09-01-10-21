package com.inner_classes_advanced;

public class OuterClass {
    private int outerData=20;
    public class InnerClass {
        int data = 10;

        public void InnerMethod() {
            System.out.println("Inner method");
        }
    }

    public class InnerChildClass extends InnerClass{
//       public void SomeMethod(){
//           outerData=10;
//           System.out.println(outerData);
//       }
    }
}
