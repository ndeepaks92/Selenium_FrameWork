package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.training.pom.RTTC_036_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RTTC_036 {

	private WebDriver driver;
	private String baseUrl;
	private static Properties properties;
	private RTTC_036_POM RTTC036;
	
	@BeforeClass
	public void beforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	  }

	
  @BeforeMethod
  public void beforeMethod() {
	  	driver = DriverFactory.getDriver(DriverNames.CHROME);
	  	RTTC036 = new RTTC_036_POM(driver);
		baseUrl = properties.getProperty("baseURL");
		driver.get(baseUrl);
  }
  
  @Test
  public void test36() {
	  RTTC036.ClickLoginRegisterButton();
	  RTTC036.sendUserName("RTTC036@ibm.com");
	  RTTC036.sendPassword("Qwerty123");
	  RTTC036.ClickLoginButton();
	  //Step1
	  RTTC036.MovetoAdmin();
	  Assert.assertTrue(RTTC036.VerifyMyAccount());
	  Assert.assertTrue(RTTC036.VerifyMyOrders());
	  Assert.assertTrue(RTTC036.VerifyLogOut());
	  //Step2
	  RTTC036.ClickMyOrders();
	  Assert.assertTrue(RTTC036.VerifyOrderHistory_Table());
	  Assert.assertTrue(RTTC036.verify_Column1_Value1());
	  Assert.assertTrue(RTTC036.Verify_Column2_Value1());
	  Assert.assertTrue(RTTC036.Verify_Column3_Value1());
	  Assert.assertTrue(RTTC036.Verify_Column4_Value1());
	  Assert.assertTrue(RTTC036.Verify_Column5_Value1());
	  //Step3
	  RTTC036.Click_ViewIcon();
	  Assert.assertTrue(RTTC036.Table1_OrderDetail());
	  Assert.assertTrue(RTTC036.Table1_Title().contains("Order Details"));
	  Assert.assertTrue(RTTC036.Table2_OrderDetail());
	  Assert.assertTrue(RTTC036.Table2_Title1().contains("Payment Address"));
	  Assert.assertTrue(RTTC036.Table2_Title2().contains("Shipping Address"));
	  Assert.assertTrue(RTTC036.Table3_OrderDetail());
	  Assert.assertTrue(RTTC036.Table3_Data_OrderDetail());
	  Assert.assertTrue(RTTC036.Table3_header1().contains("Product Name"));
	  Assert.assertTrue(RTTC036.Table3_header2().contains("Model"));
	  Assert.assertTrue(RTTC036.Table3_header3().contains("Quantity"));
	  Assert.assertTrue(RTTC036.Table3_header4().contains("Price"));
	  Assert.assertTrue(RTTC036.Table3_header5().contains("Total"));
	  Assert.assertTrue(RTTC036.Table4_OrderDetail());
	  Assert.assertTrue(RTTC036.Table4_header1().contains("Date Added"));
	  Assert.assertTrue(RTTC036.Table4_header2().contains("Status"));
	  Assert.assertTrue(RTTC036.Table4_header3().contains("Comment"));
	  //Step4
	  RTTC036.Click_ReturnButton();
	  Assert.assertTrue(RTTC036.Return_FirstName().contains("RTTC036"));
	  Assert.assertTrue(RTTC036.Return_lastName().contains("RTTC036 Last"));
	  Assert.assertTrue(RTTC036.Return_Email().contains("RTTC036@ibm.com"));
	  Assert.assertTrue(RTTC036.Return_Telephone().contains("6327328787"));
	  Assert.assertTrue(RTTC036.Return_OrderID().contains("126"));
	  Assert.assertTrue(RTTC036.Return_OrderDate().contains("2019-11-05"));
	  
	  Assert.assertTrue(RTTC036.Return_ProductName().contains("Donec suscipit"));
	  Assert.assertTrue(RTTC036.Return_ProductCode().contains("Donec suscipit"));
	  Assert.assertTrue(RTTC036.Return_Quantity().contains("1"));
	  //Step5
	  RTTC036.Select_Return_ReasonForVisit();
	  Assert.assertTrue(RTTC036.Verify_Return_ReasonForVisit());
	  //Step6
	  RTTC036.Select_Return_ProductOpened();
	  Assert.assertTrue(RTTC036.Verify_Return_ProductOpened());
	  //Step7
	  RTTC036.Enter_Return_TextBox("product is faulty");
	  Assert.assertEquals(RTTC036.Verify_Return_TextBox(), "product is faulty");
	  //Step8
	  RTTC036.Click_Return_SubmitButton();
	  Assert.assertEquals(RTTC036.Verify_FinalSuccessMessage1(), "Thank you for submitting your return request. Your request has been sent to the relevant department for processing.");
	  Assert.assertEquals(RTTC036.Verify_FinalSuccessMessage2(), "You will be notified via e-mail as to the status of your request.");
	  
  }
  
  
  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.close();
  }
}
