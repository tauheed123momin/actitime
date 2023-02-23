package com.Actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert3 {

	@Test
	public void demoassertion() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		String expectedtitle = "soogle";
		String actualtitle = driver.getTitle();
		SoftAssert s=new SoftAssert();
		driver.close();
		s.assertAll();
	}

}
