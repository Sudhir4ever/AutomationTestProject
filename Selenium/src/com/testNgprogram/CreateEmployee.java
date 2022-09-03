package com.testNgprogram;

import org.testng.annotations.Test;

public class CreateEmployee {
@Test
public void VCreateEmployeeData() {
	System.out.println("Enter Employee Data");
}
@Test(dependsOnMethods = "VCreateEmployeeData")
public void UpdateEmployeeData() {
	System.out.println("Update Employee Data");
}
}
