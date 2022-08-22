package com.actitime.pom;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.AutoConstant;
import com.actitime.generics.BasePage;
import com.actitime.generics.ExcelLibrary;

public class ActitimeCreateNewCustomerPage extends BasePage implements AutoConstant {
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement entercustomernameTextField;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement entercustomerdescriptionTextField;
	
	@FindBy(xpath="//div[.='Create Customer']")
	private WebElement createcustomerButton;
	
	@FindBy(xpath="//div[@class='greyButton cancelBtn']")
	private WebElement cancelButton;
	
	@FindBy(xpath="//div[@id='customerLightBoxCloseButton']")
	private WebElement closeButton;
    
	public ActitimeCreateNewCustomerPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void entercustomernameMethod() throws IOException{
		entercustomernameTextField.sendKeys(ExcelLibrary.getCellValue(excel_path, excel_sheet, 6, 0));
	}
	public void entercustomerdescriptionMethod() throws IOException{
		entercustomerdescriptionTextField.sendKeys(ExcelLibrary.getCellValue(excel_path, excel_sheet, 6, 1));
	}
	public void createcustomerMethod(){
		createcustomerButton.click();
	}
	public void cancelMethod(){
		cancelButton.click();
		//BasePage.alertAccept();
		BasePage.dismissMethod();
		
	}
	public void closeMethod(){
		closeButton.click();
	}

}
