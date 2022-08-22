package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.AutoConstant;
import com.actitime.generics.BasePage;

public class ActitimeTypesOfWorkPage extends BasePage implements AutoConstant {
	@FindBy(xpath="//div[@id='createBillingTypeDiv']")
	private WebElement createtypeofworkButton;
	
	@FindBy(xpath="//a[.='Mahant']")
	private WebElement typeofworknameLink;
	
	public ActitimeTypesOfWorkPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void createtypeofworkMethod(){
		createtypeofworkButton.click();
	}
	public void nameMethod(){
		typeofworknameLink.click();
	}

}
