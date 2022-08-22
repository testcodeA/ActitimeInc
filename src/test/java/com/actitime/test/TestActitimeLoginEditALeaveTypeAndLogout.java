package com.actitime.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.actitime.generics.BaseTest;
import com.actitime.pom.ActitimeCreateLeaveTypePage;
import com.actitime.pom.ActitimeHomePage;
import com.actitime.pom.ActitimeLoginPage;
import com.actitime.pom.ActitimeSettingsPage;

public class TestActitimeLoginEditALeaveTypeAndLogout extends BaseTest {
	
	@Test
	public void verifyeditleave() throws IOException{
		ActitimeLoginPage login= new ActitimeLoginPage(driver);
		login.loginMethod();
		
		ActitimeHomePage home= new ActitimeHomePage(driver);
		home.settingsMethod();
		
		ActitimeSettingsPage settings= new ActitimeSettingsPage(driver);
		settings.leavetypesMethod();
		
		ActitimeCreateLeaveTypePage editLeave= new ActitimeCreateLeaveTypePage(driver);
       editLeave.editprocessleaveMethod();
       editLeave.editassickMethod();
       editLeave.canceleditMethod();
	}

}
