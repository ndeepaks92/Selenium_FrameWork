package com.training.sanity.tests;

import org.testng.annotations.Test;

import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class RTTC_006 {
	
	private WebDriver driver;
	private String baseUrl;
	private static Properties properties;
	
	
	  @BeforeClass
	  public void beforeClass() throws IOException {
			properties = new Properties();
			FileInputStream inStream = new FileInputStream("./resources/others.properties");
			properties.load(inStream);
	  }

  @BeforeMethod
  public void beforeMethod() {
	  	driver = DriverFactory.getDriver(DriverNames.CHROME);
		baseUrl = properties.getProperty("baseURL");
		driver.get(baseUrl);
		
	  	driver.findElement(By.xpath("//i[@class='fa fa-user-o']")).click();
	  	driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("Retail_test006@ibm.com");
	  	driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Qwerty12345");
	  	driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
  }
  
  @Test
  public void Test06() throws InterruptedException {
	  driver.findElement(By.xpath("//a[contains(text(),'Change your password')]")).click();
	  String PageHeader = driver.findElement(By.xpath("//legend[contains(text(),'Your Password')]")).getText();
	  	Assert.assertTrue(PageHeader.contains("Your Password"));
	  	
	  driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("reva123");
	  driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("reva123");
	  
	  Assert.assertEquals(driver.findElement(By.xpath("//input[@id='input-password']")).getAttribute("value"),"reva123");
	  Assert.assertEquals(driver.findElement(By.xpath("//input[@id='input-confirm']")).getAttribute("value"),"reva123");
	  
	  driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	  
	  Assert.assertEquals(driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText(),"Success: Your password has been successfully updated.");
	  
	  Thread.sleep(5000);
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }
  

}
