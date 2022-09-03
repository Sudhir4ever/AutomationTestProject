package com.testNgprogram;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2Test {
	@BeforeClass
	public void bfrclass() {
		System.out.println("Open Browser");
	}
	@BeforeMethod
	public void bfrmtd() {  
		System.out.println("Login to Application"); 	
	}
  @Test
  public void GTestmethod1Test() {
	  System.out.println("Testcase1");
  }
  @Test
  public void Testmethod2Test() {
	  System.out.println("Testcase2");
	  //test execute on alphabet method
  }
  @AfterMethod
  public void aftrmtd() {
	  System.out.println("Logout");
  }
  @AfterClass
  public void aftrclass() {
	  System.out.println("Close Browser");
  }
}
