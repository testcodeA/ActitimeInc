package com.actitime.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.actitime.pom.ActitimeHomePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest implements AutoConstant{
	public WebDriver driver;
	@BeforeMethod
	public void setup(){
		//WebDriverManager.chromedriver().setup();
		System.setProperty(chrome_key, chrome_value);
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@AfterMethod
	public void teardown() throws InterruptedException{
		Thread.sleep(3000);
		//ActitimeHomePage home= new ActitimeHomePage(driver);
		//home.logoutMethod();
		Thread.sleep(7000);
		driver.quit();
	}

}
