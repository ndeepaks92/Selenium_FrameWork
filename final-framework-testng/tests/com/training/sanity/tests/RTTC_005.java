package com.training.sanity.tests;

import org.testng.annotations.Test;

import com.training.pom.RTTC_005_POM;
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

public class RTTC_005 {
	private WebDriver driver;
	private String baseUrl;
	private static Properties properties;
	private RTTC_005_POM RTTC005;
	
	  @BeforeClass
	  public void beforeClass() throws IOException {
			properties = new Properties();
			FileInputStream inStream = new FileInputStream("./resources/others.properties");
			properties.load(inStream);
	  }

  @BeforeMethod
  public void beforeMethod() {
	  	driver = DriverFactory.getDriver(DriverNames.CHROME);
	  	RTTC005 = new RTTC_005_POM(driver);
		baseUrl = properties.getProperty("baseURL");
		driver.get(baseUrl);
		
		RTTC005.ClickLoginRegisterButton();
		RTTC005.sendUserName("Retail_test005@ibm.com");
		RTTC005.sendPassword("Qwerty1234");
		RTTC005.ClickLoginButton();

  }
  
  @Test
  public void test05() throws InterruptedException {
	  	RTTC005.ClickEditAccountInfo();
	  	
	  	Assert.assertTrue(RTTC005.PageHeader().contains("Your Personal Details"));
	  	
	  	RTTC005.Label_FN();
	  	RTTC005.Label_LN();
	  	RTTC005.Label_Email();
	  	RTTC005.LabelValue_TN();
	  	Assert.assertEquals(RTTC005.LabelValue_FN(),"Retail");
	  	Assert.assertEquals(RTTC005.LabelValue_LN(),"Test005");
	  	Assert.assertEquals(RTTC005.LabelValue_Email(),"Retail_test005@ibm.com");
	  	Assert.assertEquals(RTTC005.LabelValue_TN(),"1234567890");
	  	
	  	RTTC005.Label_FN_NewValue("reva");
	  	RTTC005.Label_LN_NewValue("sharma");
	  	RTTC005.Label_Email_NewValue("revasharma_deepak@gmail.com");
	  	RTTC005.Label_TN_NewValue("9876543210");
	  	
	  	Assert.assertEquals(RTTC005.LabelValue_FN(),"reva");
	  	Assert.assertEquals(RTTC005.LabelValue_LN(),"sharma");
	  	Assert.assertEquals(RTTC005.LabelValue_Email(),"revasharma_deepak@gmail.com");
	  	Assert.assertEquals(RTTC005.LabelValue_TN(),"9876543210");
	  	
	  	RTTC005.ClickContinueButton();
	  	
	  	Assert.assertEquals(driver.getTitle(), "My Account");
	  	
	  	Assert.assertEquals(RTTC005.SuccessMessage(),"Success: Your account has been successfully updated.");
	  	
	  	Thread.sleep(5000);
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
