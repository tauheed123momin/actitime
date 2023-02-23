package com.Actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert2 {
	@Test
	public void demoassertion() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		String expectedtitle = "soogle";
		String actualtitle = driver.getTitle();
		Assert.assertEquals(expectedtitle, actualtitle);
		driver.close();
	}
}
