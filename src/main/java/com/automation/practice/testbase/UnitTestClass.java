package com.automation.practice.testbase;

import java.io.IOException;

public class UnitTestClass {

	public static void main(String[] args) throws IOException {
		
		TestInitialization obj=new TestInitialization();
		obj.init();
		
		
		
		obj.closeBrowser();
		
		System.out.println("its completed");

	}

}
