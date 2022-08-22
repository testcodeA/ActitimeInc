package com.actitime.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.actitime.generics.BaseTest;
import com.actitime.pom.ActitimeHomePage;
import com.actitime.pom.ActitimeLoginPage;
import com.actitime.pom.ActitimeTasksCustomerSettings;
import com.actitime.pom.ActitimeTasksPage;

public class TestActitimeLoginDeleteACustomerAndLogout extends BaseTest {
    @Test
   public void verifyDeleteCustomer() throws IOException{
    	ActitimeLoginPage login= new ActitimeLoginPage(driver);
    	login.loginMethod();
    	
    	ActitimeHomePage home= new ActitimeHomePage(driver);
    	home.tasksMethod();
    	
    	ActitimeTasksCustomerSettings taskSettings= new ActitimeTasksCustomerSettings(driver);
    	taskSettings.editMethod();
    	taskSettings.actionsMethod();
    	taskSettings.deletecustomerMethod();
    }
}
