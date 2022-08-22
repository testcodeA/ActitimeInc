package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.AutoConstant;
import com.actitime.generics.BasePage;

public class ActitimeTasksPage extends BasePage implements AutoConstant{
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addnewButton;
	
	@FindBy(xpath="//div[@class='item createNewCustomer']")
	private WebElement newcustomerButton;
	
	@FindBy(xpath="//div[@class='item createNewProject']")
	private WebElement newprojectButton;
	
	@FindBy(xpath="//div[@class='item createNewTasks']")
	private WebElement newtasksButton;
	
	@FindBy(xpath="//div[@class='item importTasks']")
	private WebElement importtasksfromcsvButton;
	
	public ActitimeTasksPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void addnewMethod(){
		addnewButton.click();
	}
	public void addnewcustomerMethod(){
		newcustomerButton.click();
	}
	public void newprojectMethod(){
		newprojectButton.click();
	}
	public void newtasksMethod(){
		newtasksButton.click();
	}
	public void importstasksfromcsvMethod(){
		importtasksfromcsvButton.click();
	}

}
