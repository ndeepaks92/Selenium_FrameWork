package com.training.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RTTC_035_POM {

	private WebDriver driver; 
	
	public RTTC_035_POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='input-username']")
	private WebElement username;
	public void Enterusername(String username) {
		this.username.sendKeys(username);
	}
	
	@FindBy(xpath="//input[@id='input-password']")
	private WebElement password;
	public void Enterpassword(String password) {
		this.password.sendKeys(password);
	}
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
	private WebElement Loginbutton;
	public void ClickLogin() {
		this.Loginbutton.click();
	}
	
	@FindBy(xpath="//i[@class='fa fa-tags fw']")
	private WebElement CatelogIcon;
	public void ClickCatelogIcon() {
		this.CatelogIcon.click();
	}
	
	@FindBy(xpath="//a[contains(text(),'Categories')]")
	private WebElement CatelogList1;
	public boolean CatelogList1() {
		return this.CatelogList1.isDisplayed();
	}
	
	@FindBy(xpath="//li[@id='menu-catalog']//ul//li//a[contains(text(),'Products')]")
	private WebElement CatelogList2;
	public boolean CatelogList2() {
		return this.CatelogList2.isDisplayed();
	}
	public void ClickCateloglist2() {
		this.CatelogList2.click();
	}
	
	@FindBy(xpath="//li[@id='menu-catalog']//ul//li//a[contains(text(),'Recurring Profiles')]")
	private WebElement CatelogList3;
	public boolean CatelogList3() {
		return this.CatelogList3.isDisplayed();
	}
	
	@FindBy(xpath="//body//tbody//tr[1]")
	private WebElement ProductTable_Row1;
	public boolean ProductTable_Row1() {
		return this.ProductTable_Row1.isDisplayed();
	}
	
	@FindBy(xpath="//div[@class='pull-right']//a[@class='btn btn-primary']")
	private WebElement Product_Addnew;
	public void ClickAddNewButton() {
		this.Product_Addnew.click();
	}

	
	@FindBy(xpath="//h3[@class='panel-title']")
	private WebElement AddProductPage;
	public String VerifyAddProductPage() {
		return this.AddProductPage.getText();
	}
	
	@FindBy(xpath="//input[@id='input-name1']")
	private WebElement ProductName;
	public void ProductName(String ProductName) {
		this.ProductName.sendKeys(ProductName);
	}
	public String VerifyProductName() {
		return this.ProductName.getAttribute("value");
	}
	
	@FindBy(xpath="//input[@id='input-meta-title1']")
	private WebElement MetaTagTitle;
	public void MetaTagTitle(String MetaTagTitle) {
		this.MetaTagTitle.sendKeys(MetaTagTitle);
	}
	public String VerifyMetaTagTitle() {
		return this.MetaTagTitle.getAttribute("value");
	}
	
	@FindBy(xpath="//a[contains(text(),'Data')]")
	private WebElement DataTab;
	public void ClickDataTab() {
		this.DataTab.click();
	}
	@FindBy(xpath="//input[@id='input-model']")
	private WebElement Modelfield;
	public boolean VerifyModelfieldDisplay() {
		return this.Modelfield.isDisplayed();
	}
	public void FillModelfield(String Model) {
		this.Modelfield.sendKeys(Model);
	}
	public String VerifyModelfield() {
		return this.Modelfield.getAttribute("value");
	}
	
	@FindBy(xpath="//input[@id='input-price']")
	private WebElement Pricefield;
	public void FillPricefield(String Price){
		this.Pricefield.sendKeys(Price);
	}
	public String VerifyPricefield() {
		return this.Pricefield.getAttribute("value");
	}
	
	@FindBy(xpath="//input[@id='input-quantity']")
	private WebElement Quantityfield;
	
	public void ClearQuantityfield(){
		this.Quantityfield.clear();
	}
	
	public void FillQuantityfield(String Quantity){
		this.Quantityfield.sendKeys(Quantity);
	}
	public String VerifyQuantityfield() {
		return this.Quantityfield.getAttribute("value");
	}
	
	@FindBy(xpath="//a[contains(text(),'Links')]")
	private WebElement LinksTab;
	public void ClickLinksTab() {
		this.LinksTab.click();
	}
	
	@FindBy(xpath="//input[@id='input-manufacturer']")
	private WebElement Manufacturerfield;
	public boolean VerifyManufacturerfieldDisplay() {
		return this.Manufacturerfield.isDisplayed();
	}
	
	@FindBy(xpath="//input[@id='input-category']")
	private WebElement CategoriesBox;
	public void ClickCategoriesBox() {
		this.CategoriesBox.click();
	}
	@FindBy(xpath="//a[contains(text(),'Accessories')]")
	private WebElement CategoriesBox_Option1;
	public boolean VerifyCategoriesBox_Option1() {
		return this.CategoriesBox_Option1.isDisplayed();
	}
	@FindBy(xpath="//a[contains(text(),'Ear Rings')]")
	private WebElement CategoriesBox_Option2;
	public boolean VerifyCategoriesBox_Option2() {
		return this.CategoriesBox_Option2.isDisplayed();
	}
	@FindBy(xpath="//div[@class='panel-body']//div[2]//div[1]//ul[1]//li[3]//a[1]")
	private WebElement CategoriesBox_Option3;
	public boolean VerifyCategoriesBox_Option3() {
		return this.CategoriesBox_Option3.isDisplayed();
	}
	
	public void SelectCategoriesBox_EarRings() {
		this.CategoriesBox_Option2.click();
	}
	
	@FindBy(xpath="//div[@id='product-category']/div/node()[2]")
	public String CategoriesTextBox;
	public String CategoriesTextBox() {
		return this.CategoriesTextBox;
	}
	
	@FindBy(xpath="//a[contains(text(),'Discount')]")
	private WebElement DiscountTab;
	public void ClickDiscountTab() {
		this.DiscountTab.click();
	}
	
	@FindBy(xpath="//table[@id='discount']")
	private WebElement DiscountTable;
	public boolean VerifyDiscountTable() {
		return this.DiscountTable.isDisplayed();
	}
	
	@FindBy(xpath="//table[@id='discount']//button[@class='btn btn-primary']")
	private WebElement AddDiscountButton;
	public void ClickAddDiscountButton() {
		this.AddDiscountButton.click();
	}
	

	@FindBy(xpath="//select[@name='product_discount[0][customer_group_id]']")
	private WebElement DiscountTable_CustGroup;
	public boolean VerifyDiscountTable_CustGroup() {
		return this.DiscountTable_CustGroup.isDisplayed();
	}
	
	@FindBy(xpath="//td[@class='text-right']//input[@placeholder='Quantity']")
	private WebElement DiscountTable_Quantity;
	public boolean VerifyDiscountTable_Quantity() {
		return this.DiscountTable_Quantity.isDisplayed();
	}
	public void FillDiscountTable_Quantity(String Discount_Quantity){
		this.DiscountTable_Quantity.sendKeys(Discount_Quantity);
	}
	public String VerifyDiscountTable_QuantityValue(){
		return this.DiscountTable_Quantity.getAttribute("value");
	}
	
	@FindBy(xpath="//input[@placeholder='Priority']")
	private WebElement DiscountTable_Priority;
	public boolean VerifyDiscountTable_Priority() {
		return this.DiscountTable_Priority.isDisplayed();
	}
	
	@FindBy(xpath="//td[@class='text-right']//input[@placeholder='Price']")
	private WebElement DiscountTable_Price;
	public boolean VerifyDiscountTable_Price() {
		return this.DiscountTable_Price.isDisplayed();
	}
	public void FillDiscountTable_Price(String Discount_Price){
		this.DiscountTable_Price.sendKeys(Discount_Price);
	}
	public String VerifyDiscountTable_PriceValue(){
		return this.DiscountTable_Price.getAttribute("value");
	}
	
	
	@FindBy(xpath="//input[@placeholder='Date Start']")
	private WebElement DiscountTable_StartDate;
	public boolean VerifyDiscountTable_StartDate() {
		return this.DiscountTable_StartDate.isDisplayed();
	}
	public void FillDiscountTable_StartDate(String Discount_StartDate){
		this.DiscountTable_StartDate.sendKeys(Discount_StartDate);
	}
	public String VerifyDiscountTable_StartDateValue(){
		return this.DiscountTable_StartDate.getAttribute("value");
	}
	
	
	@FindBy(xpath="//input[@placeholder='Date End']")
	private WebElement DiscountTable_EndDate;
	public boolean VerifyDiscountTable_EndDate() {
		return this.DiscountTable_EndDate.isDisplayed();
	}
	public void FillDiscountTable_EndDate(String Discount_EndDate){
		this.DiscountTable_EndDate.sendKeys(Discount_EndDate);
	}
	public String VerifyDiscountTable_EndDateValue(){
		return this.DiscountTable_EndDate.getAttribute("value");
	}
	
	@FindBy(xpath="//ul[@class='nav nav-tabs']//a[contains(text(),'Reward Points')]")
	private WebElement RewardPointsTab;
	public void ClickRewardPointsTab() {
		this.RewardPointsTab.click();
	}
	
	@FindBy(xpath="//span[contains(text(),'Points')]")
	private WebElement RewardPointsTab_PointsLabel;
	public boolean VerifyRewardPointsTab_PointsLabel() {
		return this.RewardPointsTab_PointsLabel.isDisplayed();
	}
	
	@FindBy(xpath="//input[@id='input-points']")
	private WebElement RewardPointsTab_PointsField;
	public void FillRewardPointsTab_PointsField(String RewardPoints) {
		this.RewardPointsTab_PointsField.sendKeys(RewardPoints);;
	}
	public String VerifyRewardPointsTab_PointsFieldValue(){
		return this.RewardPointsTab_PointsField.getAttribute("value");
	}
	
	@FindBy(xpath="//ul[@class='nav nav-tabs']//a[contains(text(),'Attribute')]")
	private WebElement AttributeTab;
	public void ClickAttributeTab() {
		this.AttributeTab.click();
	}
	
	@FindBy(xpath="//tr[@id='attribute-row1']")
	private WebElement AttributeTab_Row1;
	public boolean AttributeTab_Row1() {
		try{
			this.AttributeTab_Row1.isDisplayed();
			return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	
	@FindBy(xpath="//ul[@class='nav nav-tabs']//a[contains(text(),'Option')]")
	private WebElement OptionTab;
	public void ClickOptionTab() {
		this.OptionTab.click();
	}
	
	@FindBy(xpath="//input[@id='input-option']")
	private WebElement OptionsTab_OptionsfieldValue;
	public String VerifyOptionsTab_OptionsfieldValue(){
		return this.OptionsTab_OptionsfieldValue.getAttribute("value");
	}
	
	@FindBy(xpath="//ul[@class='nav nav-tabs']//a[contains(text(),'Recurring')]")
	private WebElement RecurringTab;
	public void ClickRecurringTab() {
		this.RecurringTab.click();
	}
	
	@FindBy(xpath="//tr[@id='recurring-row1']")
	private WebElement RecurringTab_Row1;
	public boolean RecurringTab_Row1() {
		try{
			this.RecurringTab_Row1.isDisplayed();
			return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	
	@FindBy(xpath="//a[contains(text(),'Special')]")
	private WebElement SpecialTab;
	public void ClickSpecialTab() {
		this.SpecialTab.click();
	}
	
	@FindBy(xpath="//tr[@id='special-row1']")
	private WebElement SpecialTab_Row1;
	public boolean SpecialTab_Row1() {
		try{
			this.SpecialTab_Row1.isDisplayed();
			return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Image')]")
	private WebElement ImageTab;
	public void ClickImageTab() {
		this.ImageTab.click();
	}
	
	@FindBy(xpath="//tr[@id='image-row0']")
	private WebElement ImageTab_Row1;
	public boolean ImageTab_Row1() {
		try{
			this.ImageTab_Row1.isDisplayed();
			return true;
		}catch(NoSuchElementException e){
			return false;
		}
	}
	
	@FindBy(xpath="//a[contains(text(),'Design')]")
	private WebElement DesignTab;
	public void ClickDesignTab() {
		this.DesignTab.click();
	}
	
	@FindBy(xpath="//select[@name='product_layout[0]']")
	private WebElement DesignTab_DDL;
	public String DesignTab_DDLValue() {
		return this.DesignTab_DDL.getAttribute("value");
	}
	
	
	@FindBy(xpath="//i[@class='fa fa-save']")
	private WebElement SaveButton;
	public void ClickSaveButton() {
		this.SaveButton.click();
	}
	

}









































