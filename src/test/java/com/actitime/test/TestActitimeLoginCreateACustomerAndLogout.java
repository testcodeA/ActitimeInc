package com.actitime.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.actitime.generics.BaseTest;
import com.actitime.pom.ActitimeCreateNewCustomerPage;
import com.actitime.pom.ActitimeHomePage;
import com.actitime.pom.ActitimeLoginPage;
import com.actitime.pom.ActitimeTasksPage;

public class TestActitimeLoginCreateACustomerAndLogout extends BaseTest {
        @Test
        public void verifyCreateCustomer() throws IOException{
        	ActitimeLoginPage login= new ActitimeLoginPage(driver);
        	login.loginMethod();
        	
        	ActitimeHomePage home= new ActitimeHomePage(driver);
        	home.tasksMethod();
        	
        	ActitimeTasksPage task= new ActitimeTasksPage(driver);
        	task.addnewMethod();
        	task.addnewcustomerMethod();
        	
        	ActitimeCreateNewCustomerPage customer= new ActitimeCreateNewCustomerPage(driver);
        	customer.entercustomernameMethod();
        	customer.entercustomerdescriptionMethod();
        	customer.createcustomerMethod();
        	//customer.cancelMethod();
      
        }
        
}
