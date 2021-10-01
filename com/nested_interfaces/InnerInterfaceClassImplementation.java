package com.nested_interfaces;

public class InnerInterfaceClassImplementation implements OuterInterface.InnerInterface {
    @Override
    public void innerMethod() {
        System.out.println("Implemented successfully");
    }
}
