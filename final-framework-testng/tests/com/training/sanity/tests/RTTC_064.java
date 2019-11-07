package com.training.sanity.tests;

import org.testng.annotations.Test;

import com.training.dataproviders.LoginDataProviders;
import com.training.dataproviders.RTTC_064_data;
import com.training.pom.RTTC_035_POM;
import com.training.pom.RTTC_064_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class RTTC_064 {

	private WebDriver driver;
	private String baseUrlAdmin;
	private static Properties properties;
	private RTTC_064_POM RTTC064;

  @BeforeClass
  public void beforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  	driver = DriverFactory.getDriver(DriverNames.CHROME);
	  	RTTC064 = new RTTC_064_POM(driver);
		baseUrlAdmin = properties.getProperty("baseURLAdmin");
		driver.get(baseUrlAdmin);
  }
  
  @Test(dataProvider = "excel-inputs", dataProviderClass = RTTC_064_data.class)
  public void f(String userName, String password, String Title_AddCategory, String CategoryName, String Description, String Meta_Tag_Title, String Meta_Tag_Description, String SuccessMessage) {
	  RTTC064.Enterusername(userName);
	  RTTC064.Enterpassword(password);
	  RTTC064.ClickLogin();
	  //Step1
	  RTTC064.ClickCatelogIcon();
	  Assert.assertTrue(RTTC064.CatelogList1());
	  Assert.assertTrue(RTTC064.CatelogList2());
	  Assert.assertTrue(RTTC064.CatelogList3());
	  //Step2
	  RTTC064.ClickCateloglist1();
	  Assert.assertTrue(RTTC064.Verify_CategoryList());
	  Assert.assertTrue(RTTC064.Verify_CategoryList_name());
	  Assert.assertTrue(RTTC064.Verify_CategoryList_Action());
	  Assert.assertTrue(RTTC064.Verify_CategoryList_Sort());
	  //Step3
	  RTTC064.ClickAddNewButton();
	  Assert.assertEquals(RTTC064.Verify_AddCategory_PageTitle(), Title_AddCategory);
	  //Step4
	  RTTC064.Enter_CategoryName(CategoryName);
	  Assert.assertEquals(RTTC064.Verify_CategoryName(),CategoryName);
	  //Step5
	  RTTC064.Enter_Description(Description);
	  Assert.assertEquals(RTTC064.Verify_DescriptionValue(), Description);
	  //Step6
	  RTTC064.Enter_Meta_Tag_Title(Meta_Tag_Title);
	  Assert.assertEquals(RTTC064.Verify_Meta_Tag_Title(), Meta_Tag_Title);
	  //Step7
	  RTTC064.Enter_Meta_Tag_Description(Meta_Tag_Description);
	  //Assert.assertEquals(RTTC064.Verify_Meta_Tag_Description(), Meta_Tag_Description);
	  //Step8
	  RTTC064.Click_DataTab();
	  RTTC064.Click_DesignTab();
	  //Step9
	  RTTC064.Click_SaveButton();
	  Assert.assertEquals(RTTC064.Verify_SuccessMessage(), SuccessMessage);
  }
  
  
  @AfterClass
  public void afterClass() {
  }

}
