package com.testngtestscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.genericlib.Browser;
import com.genericlib.ExcelLibrary;
import com.genericlib.commonlibrary;
import com.pageobjectrepo.Create_New_Tasks;
import com.pageobjectrepo.Enter_Time_track;
import com.pageobjectrepo.Login;

public class CreateTaskTest {
    WebDriver driver; 
	ExcelLibrary elib;
	commonlibrary clib;
	Login loginpage;
	Enter_Time_track timetrackpage;
	Create_New_Tasks newtaskpage;
@BeforeClass
public void bfrcls() {
	
	elib=new ExcelLibrary();
	clib=new commonlibrary();
	//loginpage=new Login(driver);
	driver=Browser.getBrowser();
	 //Login loginpage=new Login(driver);
	 
	loginpage=PageFactory.initElements(driver, Login.class);
	timetrackpage=PageFactory.initElements(driver, Enter_Time_track.class);
	newtaskpage=PageFactory.initElements(driver, Create_New_Tasks.class);
    //driver=Browser.getBrowser();
	
}
@BeforeMethod
public void bfrmtd() {
	loginpage.login_to_app();
}
@Test
public void CreateNewTaskTest() throws EncryptedDocumentException, IOException, InterruptedException {
	timetrackpage.getTasktoaddsheet();
	clib.waitforpageload(5);
	timetrackpage.click_on_Add_New_button();
	clib.waitforpageload(5);
	newtaskpage.click_dropdown_icon();
	clib.normal_wait(3000);
	String CustomerName=elib.ReadExceldata("Sheet2",1, 1);
	System.out.println(CustomerName);
	String NewCustomer=elib.ReadExceldata("Sheet2",1, 2);
	System.out.println(NewCustomer);
	String ProjectName=elib.ReadExceldata("Sheet2",1, 5);
	System.out.println(ProjectName);
	newtaskpage.click_on_New_customer_Active_cust(CustomerName, NewCustomer, ProjectName);
	String Taskname=elib.ReadExceldata("Sheet2",1,5);
	newtaskpage.Entertaskdetails(Taskname);
	String Month=elib.ReadExceldata("Sheet2",1,3);
	int Date=elib.ReadNumericExceldata ("Sheet2",1,4);
	newtaskpage.setdetailsfor_Task();
	newtaskpage.setdeadlinesforthetask(Month, Date);
	newtaskpage.createtaskaction();
	
}
@AfterMethod
public void aftmtd() throws InterruptedException {
	clib.normal_wait(3000);
	timetrackpage.click_on_logout();
}
@AfterClass
public void aftcls() {
	driver.quit();
}




}
