package com.pageobjectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Enter_Time_track {

@FindBy(xpath = "//button[@class='containers-EnterTT-ETTTaskPanel-trigger--ANgIUi1t']")
private WebElement Add_Task_To_Sheet;
@FindBy(xpath = "//div[text()='Tasks']")
private WebElement Task_link;
@FindBy(xpath = "//div[text()='Reports']")
private WebElement Reports_link;
@FindBy(xpath = "//div[text()='Users']")
private WebElement Users_link;
@FindBy(xpath = "//button[contains(@class,'components-Buttons-button--2ZtATn8v components-Buttons-default--2AuE4tKC containers-EnterTT-ETTTaskPanel-addNew--1XHPprq8')]")
private WebElement Add_new_btn;
@FindBy(id="logoutLink")
private WebElement logoutlnk;

WebDriver driver;
public Enter_Time_track(WebDriver driver) {
	this.driver=driver;
}

public void getTasktoaddsheet() {
	Add_Task_To_Sheet.click();
}
public void click_on_Tasks() {
	Task_link.click();
}
public void click_on_Reports_Link() {
	Reports_link.click();
}  
public void click_Users_link() {
	Users_link.click();
}
public void click_on_Add_New_button() {
	Add_new_btn.click();
}
public void click_on_logout() {
	logoutlnk.click();
}
}