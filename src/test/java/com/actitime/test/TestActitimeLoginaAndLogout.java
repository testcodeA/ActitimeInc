package com.actitime.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.actitime.generics.BaseTest;
import com.actitime.pom.ActitimeHomePage;
import com.actitime.pom.ActitimeLoginPage;

public class TestActitimeLoginaAndLogout extends BaseTest{
	@Test
	public void verifyLoginAndLogout() throws IOException {
		ActitimeLoginPage login= new ActitimeLoginPage(driver);
		login.loginMethod();
		
		
		
	}

}
