package com.training.sanity.tests;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RTTC_004 {
	
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
	  	driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("Retail_test004@ibm.com");
	  	driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Qwerty123");
	  	driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	  	
	  	WebElement admin1 = driver.findElement(By.xpath("//i[@class='fa fa-user-o']"));
	  	Actions act = new Actions(driver);
	  	act.moveToElement(admin1).build().perform();
	  	
	  	driver.findElement(By.xpath("//span[contains(text(),'MY ORDERS')]")).click();
  }
  

  @Test(description="Test Step to validate the Order History page")
  public void test04_Step1() throws InterruptedException {

	  	
	  	Boolean Table = driver.findElement(By.xpath("/html/body/div/section[2]/div/div/div/div/div/div/div/table")).isDisplayed();
	  	
	  	if(Table==true){
	  		System.out.println("Order table is present");
	  	}
	  	
	  	String Columnheader1 = driver.findElement(By.xpath("/html/body/div/section[2]/div/div/div/div/div/div/div/table/thead/tr/td")).getText();
	  	Assert.assertTrue(Columnheader1.contains("Order ID"));
	  	
	  	String Columnheader2 = driver.findElement(By.xpath("/html/body/div/section[2]/div/div/div/div/div/div/div/table/thead/tr/td[2]")).getText();
	  	Assert.assertTrue(Columnheader2.contains("Customer"));
	  	
	  	String Columnheader3 = driver.findElement(By.xpath("/html/body/div/section[2]/div/div/div/div/div/div/div/table/thead/tr/td[3]")).getText();
	  	Assert.assertTrue(Columnheader3.contains("No. of Products"));
	  	
	  	String Columnheader4 = driver.findElement(By.xpath("/html/body/div/section[2]/div/div/div/div/div/div/div/table/thead/tr/td[4]")).getText();
	  	Assert.assertTrue(Columnheader4.contains("Status"));
	  	
	  	String Columnheader5 = driver.findElement(By.xpath("/html/body/div/section[2]/div/div/div/div/div/div/div/table/thead/tr/td[5]")).getText();
	  	Assert.assertTrue(Columnheader5.contains("Total"));
	  	
	  	String Columnheader6 = driver.findElement(By.xpath("/html/body/div/section[2]/div/div/div/div/div/div/div/table/thead/tr/td[6]")).getText();
	  	Assert.assertTrue(Columnheader6.contains("Date Added"));
	  	
	  	WebElement Orders = driver.findElement(By.xpath("/html/body/div/section[2]/div/div/div/div/div/div/div/table/tbody"));
	  	
	  	List<WebElement> OrderList = Orders.findElements(By.tagName("tr"));
	  	
	  	int NumberOfOrders = OrderList.size(); 
	  	
	  	for(int row=0;row<NumberOfOrders;row++){
	  		System.out.println("Order List is displayed and Number of Orders is "+NumberOfOrders);
	  	}	  	 
	  	
	  	Thread.sleep(5000);
	  	
  }
  
  @Test(description="Test Step to validate the Order Information page")
  public void test04_Step2() throws InterruptedException {
	  
	  	driver.findElement(By.xpath("//i[@class='fa fa-eye']")).click();
	  	
	  	Boolean Table1 = driver.findElement(By.xpath("/html/body/div/section[2]/div/div/div/div/div/div/div/table")).isDisplayed();
	  	
	  	if(Table1==true){
	  		System.out.println("'Order Details' table is present in Order information page.");
	  	}
	  	
	  	String Table1_title = driver.findElement(By.xpath("/html/body/div/section[2]/div/div/div/div/div/div/div/table/thead/tr/td")).getText();
	  	Assert.assertTrue(Table1_title.contains("Order Details"));
	  		  	
	  	Boolean Table2 = driver.findElement(By.xpath("/html/body/div/section[2]/div/div/div/div/div/div/div/table[2]")).isDisplayed();
	  	
	  	if(Table2==true){
	  		System.out.println("Payment and Shipping Address table is present in Order information page.");
	  	}
	  	
	  	String Table2_title1 = driver.findElement(By.xpath("/html/body/div/section[2]/div/div/div/div/div/div/div/table[2]/thead/tr/td")).getText();
	  	Assert.assertTrue(Table2_title1.contains("Payment Address"));
	  	String Table2_title2 = driver.findElement(By.xpath("/html/body/div/section[2]/div/div/div/div/div/div/div/table[2]/thead/tr/td[2]")).getText();
	  	Assert.assertTrue(Table2_title2.contains("Shipping Address"));
	  	
	  	Boolean Table3 = driver.findElement(By.xpath("/html/body/div/section[2]/div/div/div/div/div/div/div/div/table")).isDisplayed();
	  	Boolean Table3_Data = driver.findElement(By.xpath("/html/body/div/section[2]/div/div/div/div/div/div/div/div/table/tbody")).isDisplayed();
	  	
	  	
	  	if(Table3==true&&Table3_Data==true){
	  		System.out.println("Product Information table is present in Order information page. Product data is present in this table");
	  	}
	  	
	  	String Table3_header1 = driver.findElement(By.xpath("/html/body/div/section[2]/div/div/div/div/div/div/div/div/table/thead/tr/td")).getText();
	  	Assert.assertTrue(Table3_header1.contains("Product Name"));
	  	String Table3_header2 = driver.findElement(By.xpath("/html/body/div/section[2]/div/div/div/div/div/div/div/div/table/thead/tr/td[2]")).getText();
	  	Assert.assertTrue(Table3_header2.contains("Model"));
	  	String Table3_header3 = driver.findElement(By.xpath("/html/body/div/section[2]/div/div/div/div/div/div/div/div/table/thead/tr/td[3]")).getText();
	  	Assert.assertTrue(Table3_header3.contains("Quantity"));
	  	String Table3_header4 = driver.findElement(By.xpath("/html/body/div/section[2]/div/div/div/div/div/div/div/div/table/thead/tr/td[4]")).getText();
	  	Assert.assertTrue(Table3_header4.contains("Price"));
	  	String Table3_header5 = driver.findElement(By.xpath("/html/body/div/section[2]/div/div/div/div/div/div/div/div/table/thead/tr/td[5]")).getText();
	  	Assert.assertTrue(Table3_header5.contains("Total"));
	  	
	  	Boolean Table4 = driver.findElement(By.xpath("/html/body/div/section[2]/div/div/div/div/div/div//div/table[3]")).isDisplayed();
	  	
	  	if(Table4==true){
	  		System.out.println("Order History table is present in Order information page.");
	  	}
	  	
	  	String Table4_header1 = driver.findElement(By.xpath("/html/body/div/section[2]/div/div/div/div/div/div//div/table[3]/thead/tr/td")).getText();
	  	Assert.assertTrue(Table4_header1.contains("Date Added"));
	  	String Table4_header2 = driver.findElement(By.xpath("/html/body/div/section[2]/div/div/div/div/div/div//div/table[3]/thead/tr/td[2]")).getText();
	  	Assert.assertTrue(Table4_header2.contains("Status"));
	  	String Table4_header3 = driver.findElement(By.xpath("/html/body/div/section[2]/div/div/div/div/div/div//div/table[3]/thead/tr/td[3]")).getText();
	  	Assert.assertTrue(Table4_header3.contains("Comment"));
	  	
	  	Thread.sleep(5000);
	  	
  }
  
  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
