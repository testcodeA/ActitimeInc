package com.actitime.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.actitime.generics.BaseTest;
import com.actitime.pom.ActitimeCreateLeaveTypePage;
import com.actitime.pom.ActitimeHomePage;
import com.actitime.pom.ActitimeLoginPage;
import com.actitime.pom.ActitimeSettingsPage;

public class TestActitimeLoginCreateALeaveTypeAndLogout extends BaseTest {
        @Test
        public void verifyCreateLeave() throws IOException{
        	ActitimeLoginPage login= new ActitimeLoginPage(driver);
        	login.loginMethod();
        	
        	ActitimeHomePage home= new ActitimeHomePage(driver);
        	home.settingsMethod();
        	
        	ActitimeSettingsPage settings= new ActitimeSettingsPage(driver);
        	settings.leavetypesMethod();
        	
        	ActitimeCreateLeaveTypePage leavetype= new ActitimeCreateLeaveTypePage(driver);
        	leavetype.createleavetypeMethod();
        	leavetype.nameMethod();
        	leavetype.statusMethod();
        	leavetype.processleavetypeMethod();
        	leavetype.leavehourrateMethod();
        	leavetype.createleavetypesubmitMethod();
        	//leavetype.cancelleaveMethod();
        	leavetype.deleteleaveMethod();
        }
}
