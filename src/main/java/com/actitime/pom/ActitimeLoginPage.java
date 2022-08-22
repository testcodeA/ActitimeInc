package com.actitime.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.AutoConstant;
import com.actitime.generics.BasePage;
import com.actitime.generics.ExcelLibrary;

public class ActitimeLoginPage extends BasePage implements AutoConstant {
	@FindBy(xpath="//input[@name='username']")
	private WebElement usernameTextField;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordTextField;
	
	@FindBy(xpath="//label[@for='keepLoggedInCheckBox']")
	private WebElement keepmeloggedinCheckBox;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginButton;
	
	@FindBy(xpath="//a[.='Forgot your password?']")
	private WebElement forgotyourpasswordLink;
	
	@FindBy(xpath="//a[.='actiTIME Inc.']")
	private WebElement actitimeincLink;
	
	public ActitimeLoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void loginMethod() throws IOException{
		usernameTextField.sendKeys(ExcelLibrary.getCellValue(excel_path, excel_sheet, 2, 0));
		passwordTextField.sendKeys(ExcelLibrary.getCellValue(excel_path, excel_sheet, 2, 1));
		keepmeloggedinCheckBox.click();
		loginButton.click();
	}
	public void forgotpasswordMethod(){
		forgotyourpasswordLink.click();
	}
	public void actitimeincMethod(){
		actitimeincLink.click();
	}

}
