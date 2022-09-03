package com.testNgprogram;

import org.testng.annotations.Test;

public class TestDemo {
@Test(invocationCount = 10)    //for multiple test execution occurs
public void DemoTest() {
	System.out.println("Demo Test");
}
}
