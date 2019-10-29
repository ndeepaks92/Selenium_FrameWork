package com.training.sanity.tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.training.pom.RTTC_004_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RTTC_004 {
	
	private WebDriver driver;
	private String baseUrl;
	private static Properties properties;
	private RTTC_004_POM RTTC004;
	
	@BeforeClass
	public void beforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	  }

	
  @BeforeMethod
  public void beforeMethod() {
	  	driver = DriverFactory.getDriver(DriverNames.CHROME);
	  	RTTC004 = new RTTC_004_POM(driver);
		baseUrl = properties.getProperty("baseURL");
		driver.get(baseUrl);
  }
  
  @Test
  public void test04() throws InterruptedException {
	  
		RTTC004.ClickLoginRegisterButton();
		RTTC004.sendUserName("Retail_test004@ibm.com");
		RTTC004.sendPassword("Qwerty123");
		RTTC004.ClickLoginButton();
	  	RTTC004.MovetoAdmin();
	  	RTTC004.ClickMyOrders();
	  	
	  	Boolean Table = RTTC004.TableOrderHistoryPage();
	  	
	  	if(Table==true){
	  		System.out.println("Order table is present");
	  	}
	  	
	  	Assert.assertTrue(RTTC004.ColumnHeader1().contains("Order ID"));
	  	Assert.assertTrue(RTTC004.ColumnHeader2().contains("Customer"));
	  	Assert.assertTrue(RTTC004.ColumnHeader3().contains("No. of Products"));
	  	Assert.assertTrue(RTTC004.ColumnHeader4().contains("Status"));
	  	Assert.assertTrue(RTTC004.ColumnHeader5().contains("Total"));
	  	Assert.assertTrue(RTTC004.ColumnHeader6().contains("Date Added"));
	  	
	  	
	  	int NumberOfOrders = RTTC004.OrderList().size();
	  	
	  	for(int row=0;row<NumberOfOrders;row++){
	  		System.out.println("Order List is displayed and Number of Orders is "+NumberOfOrders);
	  	}	  	 
	  	
	  	Thread.sleep(5000);
	  	
	  	RTTC004.OrderEyeClick();
	  	
	  	Boolean Table1 = RTTC004.Table1_OrderDetail();
	  	 	
	  	if(Table1==true){
	  		System.out.println("'Order Details' table is present in Order information page.");
	  	}
	  	
	  	Assert.assertTrue(RTTC004.Table1_Title().contains("Order Details"));
	  		  	
	  	Boolean Table2 = RTTC004.Table2_OrderDetail();
	  	
	  	if(Table2==true){
	  		System.out.println("Payment and Shipping Address table is present in Order information page.");
	  	}
	  	
	  	Assert.assertTrue(RTTC004.Table2_Title1().contains("Payment Address"));
	  	Assert.assertTrue(RTTC004.Table2_Title2().contains("Shipping Address"));
	  	
	  	Boolean Table3 = RTTC004.Table3_OrderDetail();
	  	Boolean Table3_Data = RTTC004.Table3_Data_OrderDetail();
	  	
	  	if(Table3==true&&Table3_Data==true){
	  		System.out.println("Product Information table is present in Order information page. Product data is present in this table");
	  	}
	  	
	  	Assert.assertTrue(RTTC004.Table3_header1().contains("Product Name"));
	  	Assert.assertTrue(RTTC004.Table3_header2().contains("Model"));
	  	Assert.assertTrue(RTTC004.Table3_header3().contains("Quantity"));
	  	Assert.assertTrue(RTTC004.Table3_header4().contains("Price"));
	  	Assert.assertTrue(RTTC004.Table3_header5().contains("Total"));
	  	
	  	Boolean Table4 = RTTC004.Table4_OrderDetail();
	  	
	  	if(Table4==true){
	  		System.out.println("Order History table is present in Order information page.");
	  	}
	  	
	  	Assert.assertTrue(RTTC004.Table4_header1().contains("Date Added"));
	  	Assert.assertTrue(RTTC004.Table4_header2().contains("Status"));
	  	Assert.assertTrue(RTTC004.Table4_header3().contains("Comment"));
	  	
	  	Thread.sleep(5000);
	  	
  }

  
  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
