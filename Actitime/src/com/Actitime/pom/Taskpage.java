package com.Actitime.pom;

import org.openqa.selenium.WebElement;

public class Taskpage {

	@FindBy(xpath = "//div[.='Add New']")
	private WebElement addnewbtn;
	
	@FindBy(xpath = "//div[.='+ New Customer']")
	private WebElement newcust;
	
	@FindBy(xpath = "//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement newcustname;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Discription']")
	private WebElement custdesp;
	
	@FindBy(xpath = "//div[@class='dropdownButton'])[15]")
	private WebElement dropdownbtn;
	
	@FindBy(xpath = "//div[.='Our Company'])[11]")
	private WebElement ourcomp;
	
	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement createbtn;
	
	public WebElement getAddnewbtn() {
		return addnewbtn;
	}
	
	public WebElement 
	
}
