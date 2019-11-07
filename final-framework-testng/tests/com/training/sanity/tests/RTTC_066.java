package com.training.sanity.tests;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.training.pom.RTTC_066_POM;
import com.training.utility.DriverFactory;
import com.training.utility.DriverNames;

public class RTTC_066 {

	private WebDriver driver;
	private String baseUrlAdmin;
	private static Properties properties;
	private RTTC_066_POM RTTC066;

  @BeforeClass
  public void beforeClass() throws IOException {
		properties = new Properties();
		FileInputStream inStream = new FileInputStream("./resources/others.properties");
		properties.load(inStream);
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  	driver = DriverFactory.getDriver(DriverNames.CHROME);
	  	RTTC066 = new RTTC_066_POM(driver);
		baseUrlAdmin = properties.getProperty("baseURLAdmin");
		driver.get(baseUrlAdmin);
  }
  
	@DataProvider(name="inputs")
	public Object[][] getData() {
		return new Object[][] {
			{"admin", "admin@123", "Add Category", "ORNAMENTS", "ornaments for ladies", "ORNAMENTS", "ornaments for ladies", " Success: You have modified categories!x"},
		};
	}
	
  @Test(dataProvider = "inputs")
  public void f(String userName, String password, String Title_AddCategory, String CategoryName, String Description, String Meta_Tag_Title, String Meta_Tag_Description, String SuccessMessage) {
	  RTTC066.Enterusername(userName);
	  RTTC066.Enterpassword(password);
	  RTTC066.ClickLogin();
	  //Step1
	  RTTC066.ClickCatelogIcon();
	  Assert.assertTrue(RTTC066.CatelogList1());
	  Assert.assertTrue(RTTC066.CatelogList2());
	  Assert.assertTrue(RTTC066.CatelogList3());
	  //Step2
	  RTTC066.ClickCateloglist1();
	  Assert.assertTrue(RTTC066.Verify_CategoryList());
	  Assert.assertTrue(RTTC066.Verify_CategoryList_name());
	  Assert.assertTrue(RTTC066.Verify_CategoryList_Action());
	  Assert.assertTrue(RTTC066.Verify_CategoryList_Sort());
	  //Step3
	  RTTC066.ClickAddNewButton();
	  Assert.assertEquals(RTTC066.Verify_AddCategory_PageTitle(), Title_AddCategory);
	  //Step4
	  RTTC066.Enter_CategoryName(CategoryName);
	  Assert.assertEquals(RTTC066.Verify_CategoryName(),CategoryName);
	  //Step5
	  RTTC066.Enter_Description(Description);
	  Assert.assertEquals(RTTC066.Verify_DescriptionValue(), Description);
	  //Step6
	  RTTC066.Enter_Meta_Tag_Title(Meta_Tag_Title);
	  Assert.assertEquals(RTTC066.Verify_Meta_Tag_Title(), Meta_Tag_Title);
	  //Step7
	  RTTC066.Enter_Meta_Tag_Description(Meta_Tag_Description);
	  //Assert.assertEquals(RTTC064.Verify_Meta_Tag_Description(), Meta_Tag_Description);
	  //Step8
	  RTTC066.Click_DataTab();
	  RTTC066.Click_DesignTab();
	  //Step9
	  RTTC066.Click_SaveButton();
	  Assert.assertEquals(RTTC066.Verify_SuccessMessage(), SuccessMessage);
  }
}
