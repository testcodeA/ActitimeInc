package com.actitime.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.actitime.generics.BaseTest;
import com.actitime.pom.ActitimeHomePage;
import com.actitime.pom.ActitimeLoginPage;
import com.actitime.pom.ActitimeTasksCustomerSettings;

public class TestActitimeLogintoActitimeEditACustomerAndLogout extends BaseTest{
       
	@Test
	public void verifyCustomerEdit() throws IOException, InterruptedException{
		ActitimeLoginPage login= new ActitimeLoginPage(driver);
		login.loginMethod();
		
		ActitimeHomePage home= new ActitimeHomePage(driver);
		home.tasksMethod();
		
		ActitimeTasksCustomerSettings customerSettings= new ActitimeTasksCustomerSettings(driver);
		customerSettings.editMethod();
		customerSettings.sendMessageMethod();
	}
}
