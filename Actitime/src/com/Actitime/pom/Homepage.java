package com.Actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
    @FindBy(xpath="//div[.='task']")
    private WebElement taskint;
    
    @FindBy(id="logoutlink")
    private WebElement logout;
    
    public Homepage (WebDriver driver){
    	PageFactory.initElements(driver, this);
    }
    
}
