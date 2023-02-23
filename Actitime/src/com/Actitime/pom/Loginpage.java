package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	//Decleration
	@FindBy(id="username")
	private WebElement untbx;
	                                                      
	@FindBy(name="pwd")
	private WebElement pwtbx;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement lgbtx;
	
	//initialization
	public Loginpage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

	public WebElement getUntbx() {
		return untbx;
	}

	public WebElement getPwtbx() {
		return pwtbx;
	}

	public WebElement getLgbtx() {
		return lgbtx;
	}
	
	//business logic
	public void login(String username,String password) {
		untbx.sendKeys(username);
		pwtbx.sendKeys(password);
		lgbtx.click();
	}
}
	
