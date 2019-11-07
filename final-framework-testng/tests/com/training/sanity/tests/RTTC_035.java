package com.training.sanity.tests;

import org.testng.annotations.Test;

import com.training.pom.RTTC_035_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class RTTC_035 {
	
	private WebDriver driver;
	private String baseUrlAdmin;
	private static Properties properties;
	private RTTC_035_POM RTTC035;
	
  @BeforeClass
  public void beforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
  }
	  
  @BeforeMethod
  public void beforeMethod() {
	  	driver = DriverFactory.getDriver(DriverNames.CHROME);
	  	RTTC035 = new RTTC_035_POM(driver);
		baseUrlAdmin = properties.getProperty("baseURLAdmin");
		driver.get(baseUrlAdmin);
  }

  @Test
  public void f() throws InterruptedException {
	  //Precondition
	  RTTC035.Enterusername("admin");
	  RTTC035.Enterpassword("admin@123");
	  RTTC035.ClickLogin();
	  //Step1
	  RTTC035.ClickCatelogIcon();
	  Assert.assertTrue(RTTC035.CatelogList1());
	  Assert.assertTrue(RTTC035.CatelogList2());
	  Assert.assertTrue(RTTC035.CatelogList3());
	  //Step2
	  RTTC035.ClickCateloglist2();
	  Assert.assertTrue(RTTC035.ProductTable_Row1());
	  //Step3
	  RTTC035.ClickAddNewButton();
	  Assert.assertEquals(RTTC035.VerifyAddProductPage(), "Add Product");
	  //Step4
	  String ProductName = "Finger Ring";
	  RTTC035.ProductName(ProductName);
	  Assert.assertEquals(RTTC035.VerifyProductName(), ProductName);
	  //Step5
	  String MetaTagTitle = "Finger Ring for ladies";
	  RTTC035.MetaTagTitle(MetaTagTitle);
	  Assert.assertEquals(RTTC035.VerifyMetaTagTitle(), MetaTagTitle);
	  //Step6
	  RTTC035.ClickDataTab();
	  Assert.assertTrue(RTTC035.VerifyModelfieldDisplay());
	  //Step7
	  String Model = "SKU-012";
	  RTTC035.FillModelfield(Model);
	  Assert.assertEquals(RTTC035.VerifyModelfield(), Model);
	  //Step8
	  String Price = "500";
	  RTTC035.FillPricefield(Price);
	  Assert.assertEquals(RTTC035.VerifyPricefield(), Price);
	  //Step9
	  String Quantity = "50";
	  RTTC035.ClearQuantityfield();
	  RTTC035.FillQuantityfield(Quantity);
	  Assert.assertEquals(RTTC035.VerifyQuantityfield(), Quantity);
	  //Step10
	  RTTC035.ClickLinksTab();
	  Assert.assertTrue(RTTC035.VerifyManufacturerfieldDisplay());
	  //Step11
	  RTTC035.ClickCategoriesBox();
	  Assert.assertTrue(RTTC035.VerifyCategoriesBox_Option1());
	  Assert.assertTrue(RTTC035.VerifyCategoriesBox_Option2());
	  Assert.assertTrue(RTTC035.VerifyCategoriesBox_Option3());
	  //Step12
	  RTTC035.SelectCategoriesBox_EarRings();
	  //Assert.assertEquals(RTTC035.CategoriesTextBox, "Ear Rings");
	  //Step13
	  RTTC035.ClickDiscountTab();
	  Assert.assertTrue(RTTC035.VerifyDiscountTable());
	  //Step14
	  RTTC035.ClickAddDiscountButton();
	  Assert.assertTrue(RTTC035.VerifyDiscountTable_CustGroup());
	  Assert.assertTrue(RTTC035.VerifyDiscountTable_Quantity());
	  Assert.assertTrue(RTTC035.VerifyDiscountTable_Priority());
	  Assert.assertTrue(RTTC035.VerifyDiscountTable_Price());
	  Assert.assertTrue(RTTC035.VerifyDiscountTable_StartDate());
	  Assert.assertTrue(RTTC035.VerifyDiscountTable_EndDate());
	  //Step15
	  String Discount_Quantity = "1";
	  RTTC035.FillDiscountTable_Quantity(Discount_Quantity);
	  Assert.assertEquals(RTTC035.VerifyDiscountTable_QuantityValue(), Discount_Quantity);
	  //Step16
	  String Discount_Price = "50";
	  RTTC035.FillDiscountTable_Price(Discount_Price);
	  Assert.assertEquals(RTTC035.VerifyDiscountTable_PriceValue(), Discount_Price);
	  //Step17
	  String Discount_StartDate = "2019-11-04";
	  RTTC035.FillDiscountTable_StartDate(Discount_StartDate);
	  Assert.assertEquals(RTTC035.VerifyDiscountTable_StartDateValue(), Discount_StartDate);
	  //Step18
	  String Discount_EndDate = "2019-12-05";
	  RTTC035.FillDiscountTable_EndDate(Discount_EndDate);
	  Assert.assertEquals(RTTC035.VerifyDiscountTable_EndDateValue(), Discount_EndDate);
	  //Step19
	  RTTC035.ClickRewardPointsTab();
	  Assert.assertTrue(RTTC035.VerifyRewardPointsTab_PointsLabel());
	  //Step20
	  String Reward_Points = "20";
	  RTTC035.FillRewardPointsTab_PointsField(Reward_Points);
	  Assert.assertEquals(RTTC035.VerifyRewardPointsTab_PointsFieldValue(), Reward_Points);
	  //Step21
	  RTTC035.ClickAttributeTab();
	  Assert.assertFalse(RTTC035.AttributeTab_Row1());
	  RTTC035.ClickOptionTab();
	  Assert.assertEquals(RTTC035.VerifyOptionsTab_OptionsfieldValue(), "");
	  RTTC035.ClickRecurringTab();
	  Assert.assertFalse(RTTC035.RecurringTab_Row1());
	  RTTC035.ClickSpecialTab();
	  Assert.assertFalse(RTTC035.SpecialTab_Row1());
	  RTTC035.ClickImageTab();
	  Assert.assertFalse(RTTC035.ImageTab_Row1());
	  RTTC035.ClickImageTab();
	  Assert.assertEquals(RTTC035.DesignTab_DDLValue(), "");
	  //Step22
	  RTTC035.ClickSaveButton();
	  //Assert.assertEquals(RTTC065.VerifySuccessMessage(), "Success: You have modified products!×");
	  Thread.sleep(4000);
  }

  @AfterMethod
  public void afterClass() {
	  driver.close();
  }

}























