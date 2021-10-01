package com.inner_classes;

public class Main {

    public static void main(String[] args) {
	    OuterClass outerClass=new OuterClass(10);
	    outerClass.outerMethod();
	    OuterClass.InnerClass innerClass= outerClass.new InnerClass(20);
	    innerClass.innerMethod();

	    outerClass.setInnerClass(innerClass);
	    outerClass.getInnerClass().innerMethod();

	    //------------------------------------------------------------------
		OuterClassB.StaticInnerClass staticInnerClass=new OuterClassB.StaticInnerClass(10);
		OuterClassB outerClassB=new OuterClassB(20,30);
		staticInnerClass.innerMethod();
		//--------------------------------------------------------------------
		OuterClassC outerClassC=new OuterClassC();
		outerClassC.method();
		//--------------------------------------------------------------------
		OuterClassD outerClassD=new OuterClassD();
		outerClassD.method();
	}
}
