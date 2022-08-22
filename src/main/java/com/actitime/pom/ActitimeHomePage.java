package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.AutoConstant;
import com.actitime.generics.BasePage;

public class ActitimeHomePage extends BasePage implements AutoConstant{
	@FindBy(xpath="(//div[@class='svgNavigationContainer'])[1]")
	private WebElement timetrackLink;
	
	@FindBy(xpath="(//div[@class='svgNavigationContainer'])[2]")
	private WebElement tasksLink;
	
	@FindBy(xpath="(//div[@class='svgNavigationContainer'])[3]")
	private WebElement reportsLink;
	
	@FindBy(xpath="(//div[@class='svgNavigationContainer'])[4]")
	private WebElement usersLink;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[1]")
	private WebElement calendarsDropDown;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[2]")
	private WebElement settingsDropDown;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[3]")
	private WebElement integrationsDropDown;
	
	@FindBy(xpath="(//div[@class='menu_icon'])[4]")
	private WebElement demodataloadedDropDown;
	
	@FindBy(xpath="//div[@class='popup_menu_icon tips_icon_light_on']")
	private WebElement tooltipsLink;
	
	@FindBy(xpath="//a[.='Logout']")
	private WebElement logoutLink;
	
	public ActitimeHomePage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void timeTrackMethod(){
		timetrackLink.click();
	}
	public void tasksMethod(){
		tasksLink.click();
	}
	public void reportsMethod(){
		reportsLink.click();
	}
	public void usersMethod(){
		usersLink.click();
	}
	public void calendarMethod(){
		calendarsDropDown.click();
	}
	public void settingsMethod(){
		settingsDropDown.click();
	}
	public void integrationsMethod(){
		integrationsDropDown.click();
	}
	public void demodataMethod(){
		demodataloadedDropDown.click();
	}
	public void tooltipsMethod(){
		tooltipsLink.click();
	}
	public void logoutMethod(){
		logoutLink.click();
	}
	

}
