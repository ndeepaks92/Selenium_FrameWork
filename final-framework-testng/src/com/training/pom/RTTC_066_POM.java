package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RTTC_066_POM {

private WebDriver driver; 
	
	public RTTC_066_POM(WebDriver driver) {
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
	public void ClickCateloglist1() {
		this.CatelogList1.click();
	}
	
	@FindBy(xpath="//li[@id='menu-catalog']//ul//li//a[contains(text(),'Products')]")
	private WebElement CatelogList2;
	public boolean CatelogList2() {
		return this.CatelogList2.isDisplayed();
	}
	
	@FindBy(xpath="//li[@id='menu-catalog']//ul//li//a[contains(text(),'Recurring Profiles')]")
	private WebElement CatelogList3;
	public boolean CatelogList3() {
		return this.CatelogList3.isDisplayed();
	}
	
	@FindBy(xpath="//div[@class='panel-body']")
	private WebElement CategoryList;
	public boolean Verify_CategoryList() {
		return this.CategoryList.isDisplayed();
	}
	//a[contains(text(),'Category Name')]
	@FindBy(xpath="//div[@class='panel-body']")
	private WebElement CategoryList_name;
	public boolean Verify_CategoryList_name() {
		return this.CategoryList_name.isDisplayed();
	}
	//a[contains(text(),'Sort Order')]
	@FindBy(xpath="//div[@class='panel-body']")
	private WebElement CategoryList_Sort;
	public boolean Verify_CategoryList_Sort() {
		return this.CategoryList_Sort.isDisplayed();
	}
	//a[contains(text(),'Action')]
	@FindBy(xpath="//div[@class='panel-body']")
	private WebElement CategoryList_Action;
	public boolean Verify_CategoryList_Action() {
		return this.CategoryList_Action.isDisplayed();
	}
	
	@FindBy(xpath="//div[@class='pull-right']//a[@class='btn btn-primary']")
	private WebElement AddNewButton;
	public void ClickAddNewButton() {
		this.AddNewButton.click();
	}
	
	@FindBy(xpath="//h3[@class='panel-title']")
	private WebElement AddCategory_PageTitle;
	public String Verify_AddCategory_PageTitle() {
		return this.AddCategory_PageTitle.getText();
	}
	
	@FindBy(xpath="//input[@id='input-name1']")
	private WebElement CategoryName;
	public void Enter_CategoryName(String CategName) {
		this.CategoryName.sendKeys(CategName);
	}
	public String Verify_CategoryName() {
		return this.CategoryName.getAttribute("value");
	}
	
	
	@FindBy(xpath="//div[@class='note-editable panel-body']")
	private WebElement Description;
	public void Enter_Description(String Description) {
		this.Description.sendKeys(Description);
	}
	@FindBy(xpath="//div[@class='note-editable panel-body']/p")
	private WebElement DescriptionValue;
	public String Verify_DescriptionValue() {
		return this.DescriptionValue.getText();
	}
	
	@FindBy(xpath="//input[@id='input-meta-title1']")
	private WebElement Meta_Tag_Title;
	public void Enter_Meta_Tag_Title(String Meta_Tag_Title) {
		this.Meta_Tag_Title.sendKeys(Meta_Tag_Title);
	}
	public String Verify_Meta_Tag_Title() {
		return this.Meta_Tag_Title.getAttribute("value");
	}
	
	@FindBy(xpath="//textarea[@id='input-meta-description1']")
	private WebElement Meta_Tag_Description;
	public void Enter_Meta_Tag_Description(String Meta_Tag_Description) {
		this.Meta_Tag_Description.sendKeys(Meta_Tag_Description);
	}
	public String Verify_Meta_Tag_Description() {
		return this.Meta_Tag_Description.getAttribute("innerText");
	}
	
	@FindBy(xpath="//a[contains(text(),'Data')]")
	private WebElement DataTab;
	public void Click_DataTab() {
		this.DataTab.click();
	}
	
	
	@FindBy(xpath="//a[contains(text(),'Design')]")
	private WebElement DesignTab;
	public void Click_DesignTab() {
		this.DesignTab.click();
	}
	
	@FindBy(xpath="//button[@class='btn btn-primary']")
	private WebElement SaveButton;
	public void Click_SaveButton() {
		this.SaveButton.click();
	}
	
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement SuccessMessage;
	public String Verify_SuccessMessage() {
		return this.SuccessMessage.getText();
	}
}
