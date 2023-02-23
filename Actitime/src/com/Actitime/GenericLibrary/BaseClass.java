package com.Actitime.GenericLibrary;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.Actitime.pom.Loginpage;

public class BaseClass {
	FileLibraryClass f= new FileLibraryClass();
    static {
        System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
    }
    public static WebDriver driver;
    
@BeforeSuite 
public void databaseconnection() {
    Reporter.log("i have given data base connection",true);
}

@AfterSuite
public void databasedisconnection() {
    Reporter.log("i have disconnected to database",true);
}

@BeforeClass
public void launchBrowser() {
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
String url = f.readDataFromPropertyFile("url");
driver.get("https://demo.actitime.com");
Reporter.log("browser is launched",true);
}

@AfterClass
public void closebrowser() {
    driver.close();
    Reporter.log("browser is closed",true);
}

@BeforeMethod
public void loginToActitime() {
    String UN = f.readDataFromPropertyFile("username");
    String PW=f.readDataFromPropertyFile("pwd");
    driver.findElement(By.xpath("//div[.='Login ']")).click();
    Loginpage lp=new Loginpage(driver);
    lp.login(UN, PW);
    Reporter.log("logged is to actitime",true);
}

@AfterMethod
public void lodoutactitime() throws InterruptedException {
	Thread.sleep(3000);
    driver.findElement(By.id("logoutLink")).click();
    Reporter.log("logged out to actitime",true);
}

//@Test
public void customercreate() {
    Reporter.log("customer created succesfully",true);
}
}

