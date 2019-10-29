package com.training.sanity.tests;

import org.testng.annotations.Test;

import com.training.pom.RTTC_006_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RTTC_006 {
	
	private WebDriver driver;
	private String baseUrl;
	private static Properties properties;
	private RTTC_006_POM RTTC006;
	
	
	  @BeforeClass
	  public void beforeClass() throws IOException {
			properties = new Properties();
			FileInputStream inStream = new FileInputStream("./resources/others.properties");
			properties.load(inStream);
	  }

  @BeforeMethod
  public void beforeMethod() {
	  	driver = DriverFactory.getDriver(DriverNames.CHROME);
	  	RTTC006 = new RTTC_006_POM(driver);
		baseUrl = properties.getProperty("baseURL");
		driver.get(baseUrl);
		
		RTTC006.ClickLoginRegisterButton();
		RTTC006.sendUserName("Retail_test006@ibm.com");
		RTTC006.sendPassword("Qwerty12345");
		RTTC006.ClickLoginButton();
  }
  
  @Test
  public void Test06() throws InterruptedException {
	  	RTTC006.ChangePasswordLink();
	   	Assert.assertTrue(RTTC006.PageHeader().contains("Your Password"));
	  	
	   	RTTC006.NewPassword("reva123");
	   	RTTC006.ConfirmNewPassword("reva123");   	
	   	
	   	Thread.sleep(2000);
	  
	   	Assert.assertEquals(RTTC006.NewPasswordvalue(),"reva123");
	   	Assert.assertEquals(RTTC006.ConfirmNewPasswordvalue(),"reva123");
	  
	   	RTTC006.ContinueButton();
	  
	   	Assert.assertEquals(RTTC006.SuccessMessage(),"Success: Your password has been successfully updated.");
	  
	   	Thread.sleep(2000);
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }
  

}
