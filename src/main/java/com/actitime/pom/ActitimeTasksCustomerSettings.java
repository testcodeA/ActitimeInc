package com.actitime.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.AutoConstant;
import com.actitime.generics.BasePage;
import com.actitime.generics.ExcelLibrary;

public class ActitimeTasksCustomerSettings extends BasePage implements AutoConstant{
	
	@FindBy(xpath="(//div[@class='editButton'])[1]")
	private WebElement editButton;
	
	@FindBy(xpath="(//span[@class='placeholderText'])[1]")
	private WebElement sendmessageTextField;
	
	@FindBy(xpath="(//div[@class='sendIcon'])[1]")
	private WebElement sendButton;
	
	@FindBy(xpath="(//div[@class='hideButton_panelContainer'])[1]")
	private WebElement closeButton;
	
	@FindBy(xpath="(//div[.='ACTIONS'])[1]")
	private WebElement actionsDropDown;
	
	@FindBy(xpath="(//div[.='Delete'])[2]")
	private WebElement deletecustomerButton;
	
	@FindBy(xpath="(//div[@class='cancelBtn greyButton'])[1]")
	private WebElement confirmcanceldeleteButton;
	
	@FindBy(xpath="(//span[@class='submitTitle buttonTitle'])[1]")
	private WebElement confirmdeletepermanentButton;
	
	public ActitimeTasksCustomerSettings(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void editMethod(){
		BasePage.javascriptExecutor(editButton);
	}
	public void sendMessageMethod() throws IOException, InterruptedException{
		sendmessageTextField.sendKeys(ExcelLibrary.getCellValue(excel_path, excel_sheet, 10, 0));
		sendButton.click();
		Thread.sleep(3000);
		closeButton.click();
	}
	public void actionsMethod(){
		BasePage.javascriptExecutor(actionsDropDown);
	}
	public void deletecustomerMethod(){
		deletecustomerButton.click();
		//confirmcanceldeleteButton.click();
		confirmdeletepermanentButton.click();
	}
	

}
