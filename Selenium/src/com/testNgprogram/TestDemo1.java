package com.testNgprogram;

import org.testng.annotations.Test;

public class TestDemo1 {
	@Test(enabled = false)  //for not execution
	public void DemoTest() {
		System.out.println("Demo Test");
	}
	@Test    
	public void DemoTest1() {
		System.out.println("Demo Test1");
	}
	@Test   
	public void DemoTest2() {
		System.out.println("Demo Test2");
	}
	@Test   
	public void DemoTest3() {
		System.out.println("Demo Test3");
	}
	@Test(enabled = false)  //for not execution
	public void DemoTest4() {
		System.out.println("Demo Test4");
	}
}
