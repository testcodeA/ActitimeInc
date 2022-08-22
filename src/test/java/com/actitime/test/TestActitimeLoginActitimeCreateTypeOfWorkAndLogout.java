package com.actitime.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.actitime.generics.BaseTest;
import com.actitime.pom.ActitimeCreateNewTypeofWork;
import com.actitime.pom.ActitimeHomePage;
import com.actitime.pom.ActitimeLoginPage;
import com.actitime.pom.ActitimeSettingsPage;
import com.actitime.pom.ActitimeTypesOfWorkPage;

public class TestActitimeLoginActitimeCreateTypeOfWorkAndLogout extends BaseTest{
  @Test
  public void verifyCreateTypeOfWork() throws IOException{
	  ActitimeLoginPage login= new ActitimeLoginPage(driver);
	  login.loginMethod();
	  
	  ActitimeHomePage home= new ActitimeHomePage(driver);
	  home.settingsMethod();
	  
	  ActitimeSettingsPage settings= new ActitimeSettingsPage(driver);
	  settings.typesofworkMethod();
	  
	  ActitimeTypesOfWorkPage work= new ActitimeTypesOfWorkPage(driver);
	  work.createtypeofworkMethod();
	  
	  ActitimeCreateNewTypeofWork newWork= new  ActitimeCreateNewTypeofWork(driver);
	  newWork.nameMethod();
	  newWork.archivedstatusMethod();
	  newWork.billingrateMethod();
	  newWork.categorynonbillableMethod();
	  newWork.cancelcreatetypeofworkMethod();
  }
}
