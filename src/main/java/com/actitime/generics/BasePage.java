package com.actitime.generics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage implements AutoConstant{
	public static WebDriver driver;
	public static void selectByVisibleText(WebElement element, String text){
		Select sel= new Select(element);
		sel.selectByVisibleText(text);
	}
	public static void selectByIndex(WebElement element,int index){
		Select sel= new Select(element);
		sel.selectByIndex(index);
	}
   public static void selectByValue(WebElement element,String value){
	   Select sel= new Select(element);
	   sel.selectByValue(value);
   }
   public static void alertAccept(){
	 Alert alt= driver.switchTo().alert(); 
	   alt.accept();
   }
   public static void dismissMethod(){
	   Alert alt= driver.switchTo().alert();
	   alt.dismiss();
   }
   public static void javascriptExecutor(WebElement element){
	   JavascriptExecutor js= (JavascriptExecutor)driver;
	   js.executeScript("arguments[0].click()",element);
	   
   }
   
}
