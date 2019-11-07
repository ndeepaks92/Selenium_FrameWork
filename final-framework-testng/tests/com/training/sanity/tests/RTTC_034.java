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

import com.training.pom.RTTC_034_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RTTC_034 {

	private WebDriver driver;
	private String baseUrl;
	private static Properties properties;
	private RTTC_034_POM RTTC034;
	
	@BeforeClass
	public void beforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
	  }

	
  @BeforeMethod
  public void beforeMethod() {
	  	driver = DriverFactory.getDriver(DriverNames.CHROME);
	  	RTTC034 = new RTTC_034_POM(driver);
		baseUrl = properties.getProperty("baseURL");
		driver.get(baseUrl);
  }
  
  @Test
  public void test34() throws InterruptedException {
	  //Step1 - ETHNIC option is not available. So, clicking on another product - LACINIA CONGUE
	  RTTC034.ClickProduct1();
	  //Step2
	  Assert.assertEquals(RTTC034.ProductPageHeader(), "LACINIA CONGUE");
	  Assert.assertEquals(RTTC034.ProductPage_Code(), "lacinia congue");
	  Assert.assertEquals(RTTC034.ProductPage_Price(), "Rs.666");
	  Assert.assertEquals(RTTC034.ProductPage_Description(), "lacinia congue");
	  //Step3
	  RTTC034.ProductPage_AddToCartButton();
	  Assert.assertEquals(RTTC034.ProductPage_PopUp(), "Shopping Cart updated!");
	  //Step4
	  Thread.sleep(10000);
	  RTTC034.MovetoCartIcon();
	  Assert.assertEquals(RTTC034.CartPopUp_header(), "Shopping Cart");
	  Assert.assertEquals(RTTC034.CartPopUp_product(), "lacinia congue");
	  Assert.assertEquals(RTTC034.CartPopUp_Quantity(), "x1");
	  Assert.assertEquals(RTTC034.CartPopUp_Price(), "Rs.666");
	  Assert.assertEquals(RTTC034.CartPopUp_SubTotal(), "Rs.666");
	  Assert.assertEquals(RTTC034.CartPopUp_Total(), "Rs.666");
	  //Step5
	  RTTC034.CartPopUp_ViewCart();
	  Assert.assertTrue(RTTC034.Cart_ProductImage());
	  Assert.assertTrue(RTTC034.Cart_ProductName());
	  Assert.assertTrue(RTTC034.Cart_ProductModel());
	  Assert.assertEquals(RTTC034.Cart_productQuantity(), "1");
	  Assert.assertEquals(RTTC034.Cart_ProductPrice(), "Rs.666");
	  Assert.assertEquals(RTTC034.Cart_ProductTotal(), "Rs.666");
	  //Step6
	  RTTC034.Cart_Checkout();
	  //Assert.assertTrue(RTTC034.CheckOut_LoginPage());
	  //Step7
	  RTTC034.Checkout_GuestRadioButton();
	  Assert.assertTrue(RTTC034.Checkout_GuestRadioButton_checked());
	  //Step8
	  RTTC034.Checkout_ContinueButton();
	  Assert.assertTrue(RTTC034.GuestCheckOut_PersonalDetails());
	  Assert.assertTrue(RTTC034.GuestCheckOut_Address());
	  //Step9
	  String FirstName = "Test First";
	  String LastName = "Test Last";
	  String Email = "RTTC034test@ibm.com";
	  String TN = "9813929220";
	  RTTC034.GuestCheckOut_FirstName(FirstName);
	  RTTC034.GuestCheckOut_LastName(LastName);
	  RTTC034.GuestCheckOut_Email(Email);
	  RTTC034.GuestCheckOut_Telephone(TN);
	  Assert.assertEquals(RTTC034.GuestCheckOut_FirstNameValue(), FirstName);
	  Assert.assertEquals(RTTC034.GuestCheckOut_LastNameValue(), LastName);
	  Assert.assertEquals(RTTC034.GuestCheckOut_EmailValue(), Email);
	  Assert.assertEquals(RTTC034.GuestCheckOut_TNValue(), TN);
	  //Step10
	  String Address1 = "SA3, IBM";
	  String City = "Bangalore";
	  String Country = "India";
	  String State = "Karnataka";
	  RTTC034.GuestCheckOut_Address1(Address1);
	  RTTC034.GuestCheckOut_City(City);
	  RTTC034.GuestCheckOut_Country(Country);
	  RTTC034.GuestCheckOut_State(State);
	  Assert.assertEquals(RTTC034.GuestCheckOut_Address1Value(), Address1);
	  Assert.assertEquals(RTTC034.GuestCheckOut_CityValue(), City);
	  Assert.assertEquals(RTTC034.GuestCheckOut_CountryValue(), Country);
	  Assert.assertEquals(RTTC034.GuestCheckOut_StateValue(), State);
	  //Step11 - This radio button is selected by default. Hence, instead of clicking, we are ensuring that this is selected.
	  Assert.assertTrue(RTTC034.Guest_Deliv_Billing_AddressRadio());
	  //Step12
	  RTTC034.GuestCheckOut_Continue();
	  Assert.assertTrue(RTTC034.GuestCheckOut_FreeShipping_Radio());
	  Assert.assertTrue(RTTC034.GuestCheckOut_CommentTextbox());
	  //Step13 - Credentials are not being displayed here. Hence, did not include this validation
	  String Comment = "Test Comment";
	  RTTC034.GuestCheckOut_CommentTextbox_AddComment(Comment);
	  RTTC034.Shipping_Continue();
	  //Step14
	  RTTC034.TermsAndConditions();
	  //Step15
	  RTTC034.PaymentMethod_Continue();
	  Assert.assertTrue(RTTC034.ConfirmOrderTab());
	  //Step16
	  RTTC034.ConfirmOrderButton();
	  Assert.assertTrue(RTTC034.SuccessMessage());
	  Assert.assertEquals(RTTC034.CartMessage(), "Your shopping cart is empty!");
  }

  
  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  //Thread.sleep(3000);
	  //driver.close();
  }
  
}
