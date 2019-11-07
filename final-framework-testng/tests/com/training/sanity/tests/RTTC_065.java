package com.training.sanity.tests;

import org.testng.annotations.Test;

import com.training.dataproviders.RTTC_065_data;
import com.training.pom.RTTC_065_POM;
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
import org.testng.annotations.AfterClass;

public class RTTC_065 {

	private WebDriver driver;
	private String baseUrl;
	private String baseUrlAdmin;
	private static Properties properties;
	private RTTC_065_POM RTTC065;

  @BeforeClass
  public void beforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  	driver = DriverFactory.getDriver(DriverNames.CHROME);
	  	RTTC065 = new RTTC_065_POM(driver);
	  	baseUrl = properties.getProperty("baseURL");
		baseUrlAdmin = properties.getProperty("baseURLAdmin");
		driver.get(baseUrlAdmin);
  }
  
  @Test(dataProvider = "db-inputs", dataProviderClass = RTTC_065_data.class)
  public void f(String userName, String password, String ProductName, String MetaTagTitle, String Model, String Price, String Quantity, String Category) throws InterruptedException {
	  RTTC065.Enterusername(userName);
	  RTTC065.Enterpassword(password);
	  RTTC065.ClickLogin();
	  //Step1
	  RTTC065.ClickCatelogIcon();
	  Assert.assertTrue(RTTC065.CatelogList1());
	  Assert.assertTrue(RTTC065.CatelogList2());
	  Assert.assertTrue(RTTC065.CatelogList3());
	  //Step2
	  RTTC065.ClickCateloglist2();
	  Assert.assertTrue(RTTC065.ProductTable_Row1());
	  //Step3
	  RTTC065.ClickAddNewButton();
	  Assert.assertEquals(RTTC065.VerifyAddProductPage(), "Add Product");
	  //Step4
	  RTTC065.ProductName(ProductName);
	  Assert.assertEquals(RTTC065.VerifyProductName(), ProductName);
	  //Step5
	  RTTC065.MetaTagTitle(MetaTagTitle);
	  Assert.assertEquals(RTTC065.VerifyMetaTagTitle(), MetaTagTitle);
	  //Step6
	  RTTC065.ClickDataTab();
	  Assert.assertTrue(RTTC065.VerifyModelfieldDisplay());
	  //Step7
	  RTTC065.FillModelfield(Model);
	  Assert.assertEquals(RTTC065.VerifyModelfield(), Model);
	  //Step8
	  RTTC065.FillPricefield(Price);
	  Assert.assertEquals(RTTC065.VerifyPricefield(), Price);
	  //Step9
	  RTTC065.ClearQuantityfield();
	  RTTC065.FillQuantityfield(Quantity);
	  Assert.assertEquals(RTTC065.VerifyQuantityfield(), Quantity);
	  //Step10
	  RTTC065.ClickLinksTab();
	  Assert.assertTrue(RTTC065.VerifyManufacturerfieldDisplay());
	  //Step11
	  RTTC065.ClickCategoriesBox();
	  Assert.assertTrue(RTTC065.VerifyCategoriesBox_Option1());
	  Assert.assertTrue(RTTC065.VerifyCategoriesBox_Option2());
	  Assert.assertTrue(RTTC065.VerifyCategoriesBox_Option3());
	  //Step12
	  RTTC065.SelectCategoriesBox_EarRings();
	  //Step13
	  RTTC065.ClickRewardPointsTab();
	  Assert.assertEquals(RTTC065.VerifyRewardPointsTab_PointsFieldValue(), "");
	  RTTC065.ClickAttributeTab();
	  Assert.assertFalse(RTTC065.AttributeTab_Row1());
	  RTTC065.ClickOptionTab();
	  Assert.assertEquals(RTTC065.VerifyOptionsTab_OptionsfieldValue(), "");
	  RTTC065.ClickRecurringTab();
	  Assert.assertFalse(RTTC065.RecurringTab_Row1());
	  RTTC065.ClickSpecialTab();
	  Assert.assertFalse(RTTC065.SpecialTab_Row1());
	  RTTC065.ClickImageTab();
	  Assert.assertFalse(RTTC065.ImageTab_Row1());
	  RTTC065.ClickImageTab();
	  Assert.assertEquals(RTTC065.DesignTab_DDLValue(), "");
	  //Step14
	  RTTC065.ClickSaveButton();
	  //Assert.assertEquals(RTTC065.VerifySuccessMessage(), "Success: You have modified products!×");
	  Thread.sleep(4000);
	  //Step15
	  RTTC065.ClickLogOutButton();
	  Assert.assertEquals(RTTC065.LoginPageTitle(), "Please enter your login details.");
	  //Step16
	  driver.get(baseUrl);
	  Assert.assertTrue(RTTC065.verify_Homebutton());
	  //Step17
	  RTTC065.ClickSearchButton();
	  RTTC065.EnterSearchField(MetaTagTitle);
	  RTTC065.ClickSearchButton();
	  Assert.assertTrue(RTTC065.VerifyProduct());
	  Thread.sleep(4000);
  }
  
  
  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
