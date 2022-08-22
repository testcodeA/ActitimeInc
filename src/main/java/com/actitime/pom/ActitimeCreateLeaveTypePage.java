package com.actitime.pom;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.AutoConstant;
import com.actitime.generics.BasePage;
import com.actitime.generics.BaseTest;
import com.actitime.generics.ExcelLibrary;

public class ActitimeCreateLeaveTypePage extends BaseTest implements AutoConstant {
      @FindBy(xpath="//span[.='Create Leave Type']")
      private WebElement createleavetypeLink;
      
      @FindBy(xpath="//input[@placeholder='Leave Type Name']")
      private WebElement leavetypenameTextField;
      
      @FindBy(xpath="//em[@unselectable='on']")
      private WebElement statusDropDown;
      
      @FindBy(xpath="(//a[@class='x-menu-item'])[1]")
      private WebElement activeLink;
      
      @FindBy(xpath="(//a[@class='x-menu-item'])[2]")
      private WebElement archivedLink;
      
      @FindBy(xpath="(//input[@type='text'])[6]")
      private WebElement leavehourrateTextBox;
      
      @FindBy(xpath="(//input[@type='checkbox'])[3]")
      private WebElement processleavetypeCheckbox;
      
      @FindBy(xpath="(//span[.='Create Leave Type'])[2]")
      private WebElement createleavetypesubmitButton;
      
      @FindBy(xpath="//div[@class='greyButton cancelBtn']")
      private WebElement cancelButton;
      
      @FindBy(xpath="(//table[@class='leaveTypeInfoText'])[4]")
      private WebElement editprocessleavetypeLink;
      
      @FindBy(xpath="(//input[@name='processLeaveTimeRadio'])[3]")
      private WebElement editassickdaysRadioButton;
      
      @FindBy(xpath="//span[.='Apply']")
      private WebElement applyButton;
      
      @FindBy(xpath="(//span[.='Cancel'])[5]")
      private WebElement canceleditButton;
      
      @FindBy(xpath="//span[.='Jasmine']//../../../../../..//td[@class='leaveTypeDeleteCell last']")
      private WebElement deleteleavecreatedLink;
      
      public  ActitimeCreateLeaveTypePage(WebDriver driver){
    	  this.driver=driver;
    	  PageFactory.initElements(driver, this);
      }
      public void createleavetypeMethod(){
    	  createleavetypeLink.click();
      }
      public void nameMethod() throws IOException{
    	  leavetypenameTextField.sendKeys(ExcelLibrary.getCellValue(excel_path, excel_sheet, 16, 0));
      }
      public void statusMethod(){
    	  statusDropDown.click();
    	//  activeLink.click();
    	  archivedLink.click();
      }
      public void leavehourrateMethod() throws IOException{
    	  leavehourrateTextBox.sendKeys(ExcelLibrary.getCellValue(excel_path, excel_sheet, 16, 1));
      }
      public void processleavetypeMethod(){
    	  processleavetypeCheckbox.click();
      }
      public void createleavetypesubmitMethod(){
    	  createleavetypesubmitButton.click();
      }
      public void cancelleaveMethod(){
    	  cancelButton.click();
    	  BasePage.alertAccept();
    	 // BasePage.dismissMethod();
      }
      public void editprocessleaveMethod(){
    	  editprocessleavetypeLink.click();
      }
      public void editassickMethod(){
    	  editassickdaysRadioButton.click();
      }
      public void applyeditMethod(){
    	  applyButton.click();
      }
      public void canceleditMethod(){
    	  canceleditButton.click();
      }
      public void deleteleaveMethod(){
    	  deleteleavecreatedLink.click();
    	  BasePage.alertAccept();
    	//  BasePage.dismissMethod();
      }
}
