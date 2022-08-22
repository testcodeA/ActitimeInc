package com.actitime.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.AutoConstant;
import com.actitime.generics.BasePage;
import com.actitime.generics.ExcelLibrary;

public class ActitimeEditTypeOfWork extends BasePage implements AutoConstant{
        @FindBy(xpath="(//input[@type='text'])[4]")
        private WebElement nameTextField;
        
        @FindBy(xpath="//select[@name='active']")
        private WebElement statusDropDown;
        
        @FindBy(xpath="(//input[@name='billable'])[1]")
        private WebElement categorybillableRadioButton;
        
        @FindBy(xpath="(//input[@name='billable'])[2]")
        private WebElement categorynon_billableRadioButton;
        
        @FindBy(xpath="//input[@id='billingRate_input']")
        private WebElement billingrateTextField;
        
        @FindBy(xpath="//input[@type='submit']")
        private WebElement createtypeofworkSubmitButton;
        
        @FindBy(xpath="(//input[@type='button'])[1]")
        private WebElement cancelButton;
        
        @FindBy(xpath="//input[@value='Delete This Type of Work']")
        private WebElement deletethistypeofworkLink;
        
        @FindBy(xpath="//div[@id='FormModifiedDivButton']")
        private WebElement savemodificationsButton;
        
        public ActitimeEditTypeOfWork(WebDriver driver){
     	   this.driver=driver;
     	   PageFactory.initElements(driver, this);
        }
        public void nameMethod() throws IOException{
     	   nameTextField.sendKeys(ExcelLibrary.getCellValue(excel_path, excel_sheet, 13, 0));
     	   
        }
        public void archivedstatusMethod(){
     	   statusDropDown.click();
     	   BasePage.selectByVisibleText(statusDropDown,"archived");
        }
        public void activestatusMethod(){
        	statusDropDown.click();
     	   BasePage.selectByVisibleText(statusDropDown, "active");
        }
        public void categorybillableMethod(){
     	   categorybillableRadioButton.click();
        }
        public void categorynonbillableMethod(){
     	   categorynon_billableRadioButton.click();
        }
        public void billingrateMethod(){
     	   billingrateTextField.sendKeys("9");;
        }
        public void submitcreatetypeofworkMethod(){
     	   createtypeofworkSubmitButton.click();
        }
        public void cancelcreatetypeofworkMethod(){
     	   cancelButton.click();
     	   //BasePage.alertAccept();
     	   BasePage.dismissMethod();
        }
        public void savemodificationMethod(){
        	savemodificationsButton.click();
        }
        public void deletethistypeofworkMethod(){
        	deletethistypeofworkLink.click();
        	//BasePage.alertAccept();
        	BasePage.dismissMethod();
        }
}
