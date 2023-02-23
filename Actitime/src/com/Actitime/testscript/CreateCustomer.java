package com.Actitime.testscript;

import com.Actitime.GenericLibrary.BaseClass;
import com.Actitime.pom.Homepage;

public class CreateCustomer extends BaseClass{

	@Test
	public void createCustomer() {
		Homepage hp = new Homepage(driver);
		hp.getTasklink().click();
		
		
	}
}
