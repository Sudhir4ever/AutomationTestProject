package com.testNgprogram;

import org.testng.annotations.Test;

public class UpdateEmployeeDetails {
	@Test(dependsOnMethods = "CreateEmployeeData",groups="Smoke")
	public void UpdateEmployeeData() {
		System.out.println("Update Employee Data");
	}
}
