package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.AutoConstant;
import com.actitime.generics.BasePage;

public class ActitimeSettingsPage extends BasePage implements AutoConstant {
	@FindBy(xpath="//div[.='Turn Features On / Off']")
	private WebElement turnfeatureonandoffLink;
    
	
	@FindBy(xpath="//div[.='Manage system settings & configure actiTIME']")
	private WebElement generalsettingsLink;
	
	@FindBy(xpath="//a[.='Workflow Settings']")
	private WebElement workflowsettingsLink;
	
	@FindBy(xpath="//a[.='Types of Work']")
	private WebElement typesofworkLink;
	
	@FindBy(xpath="//a[.='Leave Types']")
	private WebElement leavetypesLink;
	
	@FindBy(xpath="//a[.='Custom Fields for Tasks']")
	private WebElement customefieldsfortasksLink;
	
	@FindBy(xpath="//a[.='Work Statuses']")
	private WebElement workstatusesLink;
	
	@FindBy(xpath="//a[.='Notifications']")
	private WebElement notificationsLink;
	
	@FindBy(xpath="//a[.='Logo Settings']")
	private WebElement logosettingsLink;
	
	@FindBy(xpath="//div[.='Manage subscription and billing information']")
	private WebElement licensesLink;
	
	public ActitimeSettingsPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void turnfeatureonandoffsettingsMethod(){
		turnfeatureonandoffLink.click();
	}
	public void generalsettingsMethod(){
		generalsettingsLink.click();
	}
	public void workflowMethod(){
		workflowsettingsLink.click();
	}
	public void typesofworkMethod(){
		typesofworkLink.click();
	}
	public void leavetypesMethod(){
		leavetypesLink.click();
	}
	public void customerfieldsfortaskMethod(){
		customefieldsfortasksLink.click();
	}
	public void workstatusMethod(){
	workstatusesLink.click();
	}
	public void notificationsMethod(){
		notificationsLink.click();
	}
	public void logosettingsMethod(){
	logosettingsLink.click();
	}
	public void licensesMethod(){
		licensesLink.click();
	}
	
	
}
