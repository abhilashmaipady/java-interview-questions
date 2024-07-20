package com.scribbleexample.demo;

public class OverloadingVsOverriding {
	public String test() {
		return "test";
	}
	
	public static void main(String[] args) {
		OverloadingVsOverriding ob = new OverloadingVsOverriding();
		String result = ob.test();
		System.out.println("Result from method: "+result);
	}
}

class BaseClass {
	public void test() {
		System.out.println("This is test method");
	}
	
	public String test() {
		return "test";
	}
}
