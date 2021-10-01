package com.nested_interfaces;

public class Main {
    public static void main(String[] args) {
        OuterInterface.InnerInterface innerInterface=new OuterInterface.InnerInterface() {
            @Override
            public void innerMethod() {
                System.out.println("Anonymous worked");
            }
        };

        InnerInterfaceClassImplementation innerInterfaceClassImplementation=new InnerInterfaceClassImplementation();
        innerInterfaceClassImplementation.innerMethod();

        innerInterface.innerMethod();
    }
}
