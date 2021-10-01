package com.nested_interfaces;

public interface OuterInterface {
    void outerMethod();
    interface InnerInterface{
        void innerMethod();
    }
}
