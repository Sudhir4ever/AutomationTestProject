package com.pageobjectrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.genericlib.Browser;
import com.genericlib.Project_constants;
import com.genericlib.commonlibrary;

public class Login extends commonlibrary {

@FindBy(xpath = "//div[@class='atProductName']")
private WebElement TitleofLoginPage;
@FindBy(xpath = "//div[@class='atLogoImg']")
private WebElement logoofloginpage;
@FindBy(id="headerContainer")
private WebElement Headertxtoflogin;
@FindBy(id="username")
private WebElement usernametxtbox;
@FindBy(name="pwd")
private WebElement passwordtxtbox;
@FindBy(id="keepLoggedInLabel")
private WebElement keepmeloggedintext;
@FindBy(id="keepLoggedInCheckBox")
private WebElement keepmeloggedchkbox;
@FindBy(id="loginButton")
private WebElement loginbtn;
@FindBy(id="toPasswordRecoveryPageLink")
private WebElement forgotpasslnk;

WebDriver driver;

public Login(WebDriver driver) {
	this.driver=driver;
	
}

public void login_to_app() {
	driver.get(Project_constants.URL);
	waitforpageload(5000);
	usernametxtbox.sendKeys(Project_constants.username);
	passwordtxtbox.sendKeys(Project_constants.Password);
	loginbtn.click();
}


	
}

