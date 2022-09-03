package com.pageobjectrepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.genericlib.Browser;

public class Create_New_Tasks {
@FindBy(xpath = "//div[@class='customerSelector customerOrProjectSelector selectorWithPlaceholderContainer']/div/div/div[@class='dropdownButton']")
private WebElement customerdropdown;
@FindBy(xpath = "")
private WebElement New_Active_customer_Value_dropdown;
@FindBy(xpath = "//div[text()='Big Bang Company']")
private WebElement Big_bang_value;
@FindBy(xpath = "//div[text()='Galaxy Corporation']")
private WebElement Galaxy_Corporation_value;
@FindBy(xpath = "//div[text()='Our company']")
private WebElement Our_company_value;
@FindBy(xpath = "//input[@class='newCustomer newCustomerProjectField inputFieldWithPlaceholder']")
private WebElement New_customer_txtbox;
@FindBy(xpath = "//input[@class='newProject newCustomerProjectField inputFieldWithPlaceholder']")
private WebElement New_Project_txtbox;

@FindBy(xpath = "//input[@placeholder='Enter Project Name']")
private WebElement New_Project_nametxt;

@FindBy(xpath = "//td[table[tbody[tr[td[@id='descriptionCell0']]]]]/preceding-sibling::td/input")
private WebElement Entertasktimefield;
@FindBy(xpath = "//table[@id='ext-comp-1001']/tbody/tr[@id='ext-gen17']//td/em/button")
private WebElement deadlinesfield;

@FindBy(xpath = "//div[text()='Create Tasks']")
private WebElement createtaskbtn;

@FindBy(xpath = "//a[@title='Next Month (Control+Right)']")
private WebElement nextarrowbutton;


WebDriver driver;
public Create_New_Tasks(WebDriver driver) {
	this.driver=driver;   
}
public void click_dropdown_icon() {
	customerdropdown.click();
}
public void click_on_New_customer_Active_cust(String Customer,String NewCustomer,String NewProjectName) {
	Browser.driver.findElement(By.xpath("//div[text()='Big Bang Company']/preceding-sibling::div[contains(text(),'"+Customer+"')]")).click();
 if(Customer.equals("New Customer")) {
	 New_customer_txtbox.sendKeys(NewCustomer);
	 New_customer_txtbox.sendKeys(NewProjectName);
 }else if(Customer.equals("ALL ACTIVE CUSTOMERS")) {
	 New_Project_nametxt.sendKeys(NewProjectName);
 }else if(Customer.equals("Big Bang Company")) {
	 New_Project_nametxt.sendKeys(NewProjectName);
 }else if(Customer.equals("Galaxy Corporation")) {
	 New_Project_nametxt.sendKeys(NewProjectName);
 }else if(Customer.equals("Our company")) {
	 New_Project_nametxt.sendKeys(NewProjectName);
      }
    
  }
public void Entertaskdetails(String Task) {
	Entertasktimefield.sendKeys(Task); 
}
public void setdetailsfor_Task() {
	deadlinesfield.click();
}
public void setdeadlinesforthetask(String Month,int date) {
	String xpathfordate="//tr[td[table[tbody[tr[td[em[button[text()='"+Month+"']]]]]]]]/following-sibling::tr/td/table/tbody/tr/td[@class='x-date-active']/a/em/span[text()='"+date+"']";
  int n=1;
  while(true)
  try {
	Browser.driver.findElement(By.xpath(xpathfordate)).click();
	break;
  }catch(Exception e) {
	  nextarrowbutton.click(); 
  }
 }
public void createtaskaction() {
	createtaskbtn.click();
}
}
