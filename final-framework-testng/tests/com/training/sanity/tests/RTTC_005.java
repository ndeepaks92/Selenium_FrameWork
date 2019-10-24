package com.training.sanity.tests;

import org.testng.annotations.Test;

import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class RTTC_005 {
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
	  	driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("Retail_test005@ibm.com");
	  	driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Qwerty1234");
	  	driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
  }
  
  @Test
  public void test05() throws InterruptedException {
	  	driver.findElement(By.xpath("//a[contains(text(),'Edit your account information')]")).click();
	  	
	  	String PageHeader = driver.findElement(By.xpath("//legend[contains(text(),'Your Personal Details')]")).getText();
	  	Assert.assertTrue(PageHeader.contains("Your Personal Details"));
	  	
	  	Assert.assertTrue(driver.findElement(By.xpath("//label[contains(text(),'First Name')]")).isDisplayed());
	  	Assert.assertEquals(driver.findElement(By.xpath("//input[@id='input-firstname']")).getAttribute("value"),"Retail");
	  	Assert.assertTrue(driver.findElement(By.xpath("//label[contains(text(),'Last Name')]")).isDisplayed());
	  	Assert.assertEquals(driver.findElement(By.xpath("//input[@id='input-lastname']")).getAttribute("value"),"Test005");
	  	Assert.assertTrue(driver.findElement(By.xpath("//label[contains(text(),'E-Mail')]")).isDisplayed());
	  	Assert.assertEquals(driver.findElement(By.xpath("//input[@id='input-email']")).getAttribute("value"),"Retail_test005@ibm.com");
	  	Assert.assertTrue(driver.findElement(By.xpath("//label[contains(text(),'Telephone')]")).isDisplayed());
	  	Assert.assertEquals(driver.findElement(By.xpath("//input[@id='input-telephone']")).getAttribute("value"),"1234567890");
	  	
	  	driver.findElement(By.xpath("//input[@id='input-firstname']")).clear();
	  	driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("reva");
	  	driver.findElement(By.xpath("//input[@id='input-lastname']")).clear();
	  	driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("sharma");
	  	driver.findElement(By.xpath("//input[@id='input-email']")).clear();
	  	driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("revasharma_deepak@gmail.com");
	  	driver.findElement(By.xpath("//input[@id='input-telephone']")).clear();
	  	driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("9876543210");
	  	
	  	Assert.assertEquals(driver.findElement(By.xpath("//input[@id='input-firstname']")).getAttribute("value"),"reva");
	  	Assert.assertEquals(driver.findElement(By.xpath("//input[@id='input-lastname']")).getAttribute("value"),"sharma");
	  	Assert.assertEquals(driver.findElement(By.xpath("//input[@id='input-email']")).getAttribute("value"),"revasharma_deepak@gmail.com");
	  	Assert.assertEquals(driver.findElement(By.xpath("//input[@id='input-telephone']")).getAttribute("value"),"9876543210");
	  	
	  	driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	  	
	  	Assert.assertEquals(driver.getTitle(), "My Account");
	  	
	  	Assert.assertEquals(driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText(),"Success: Your account has been successfully updated.");
	  	
	  	Thread.sleep(5000);
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
