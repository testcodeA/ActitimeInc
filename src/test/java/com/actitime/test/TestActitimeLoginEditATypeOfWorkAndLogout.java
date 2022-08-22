package com.actitime.test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.actitime.generics.BaseTest;
import com.actitime.pom.ActitimeEditTypeOfWork;
import com.actitime.pom.ActitimeHomePage;
import com.actitime.pom.ActitimeLoginPage;
import com.actitime.pom.ActitimeSettingsPage;
import com.actitime.pom.ActitimeTypesOfWorkPage;

public class TestActitimeLoginEditATypeOfWorkAndLogout extends BaseTest{
	@Test
	public void verifyEditTypeOfWork() throws IOException, InterruptedException{
      ActitimeLoginPage login= new ActitimeLoginPage(driver);
      login.loginMethod();
      
      ActitimeHomePage home= new ActitimeHomePage(driver);
      home.settingsMethod();
      
      ActitimeSettingsPage settings= new ActitimeSettingsPage(driver);
      settings.typesofworkMethod();
      
      ActitimeTypesOfWorkPage typesOFWork = new ActitimeTypesOfWorkPage(driver);
      typesOFWork.nameMethod();
      
      ActitimeEditTypeOfWork editTypeWork= new ActitimeEditTypeOfWork(driver);
      editTypeWork.billingrateMethod();
      editTypeWork.deletethistypeofworkMethod(); 
      Thread.sleep(4000);
      editTypeWork.savemodificationMethod();
      
	}
}
