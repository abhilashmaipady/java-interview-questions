package com.scribbleexample.demo;

public class DiamondProblem implements interfaceA {

	@Override
	public void test() {
		System.out.println("This is a test method");
		testDefault();
	}

//	@Override
//	public void testDefault() {
//		System.out.println("This is a default method from Class");
//	}

	public static void main(String[] args) {
		DiamondProblem ob = new DiamondProblem();
		ob.test();
	}
}

interface interfaceA {
	void test();
	
	default void testDefault() {
		System.out.println("This is a default method from A");
	}
}

interface interfaceB {
	void test();
	
	default void testDefault() {
		System.out.println("This is a default method from A");
	}
}