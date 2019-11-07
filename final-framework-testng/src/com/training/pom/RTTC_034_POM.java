package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RTTC_034_POM {

	private WebDriver driver; 
	
	public RTTC_034_POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@alt='lacinia congue']")
	private WebElement Product1;
	public void ClickProduct1() {
		this.Product1.click();
	}
	
	@FindBy(xpath="//h1[contains(text(),'lacinia congue')]")
	private WebElement ProductPageHeader;
	public String ProductPageHeader() {
		return this.ProductPageHeader.getText();
	}
	
	@FindBy(xpath="//dd[contains(text(),'lacinia congue')]")
	private WebElement ProductPage_Code;
	public String ProductPage_Code() {
		return this.ProductPage_Code.getText();
	}
	
	@FindBy(xpath="//div[@class='price']//span[@class='price-regular'][contains(text(),'666')]")
	private WebElement ProductPage_Price;
	public String ProductPage_Price() {
		return this.ProductPage_Price.getText();
	}
	
	@FindBy(xpath="//span[contains(text(),'lacinia congue')]")
	private WebElement ProductPage_Description;
	public String ProductPage_Description() {
		return this.ProductPage_Description.getText();
	}
	
	@FindBy(xpath="//button[@id='button-cart']")
	private WebElement ProductPage_AddToCartButton;
	public void ProductPage_AddToCartButton() {
		this.ProductPage_AddToCartButton.click();
	}
	
	@FindBy(xpath="//ul[@class='noty_cont noty_layout_topRight']//h3[1]")
	private WebElement ProductPage_PopUp;
	public String ProductPage_PopUp() {
		return this.ProductPage_PopUp.getText();
	}
	
	
	@FindBy(xpath="//body[@class='product-product-892 tb_width_1200 tb_lang_ltr tb_page_product_product head_glob_intro_glob_cont_glob_foot_glob_ar_head_glob_ar_intro_sys_prod_prod__def_ar_cont_prod_glob_ar_col_l_glob_ar_foot_glob_en-gb_733d2 no_touch']/ul[@class='noty_cont noty_layout_topRight']/li/div[@id='noty_alert_1572427782754']/div[@class='noty_message']/div[@class='noty_close btn btn-default btn-sm tb_no_text']/*[1]")
	private WebElement ProductPage_PopUpClose;
	public void ProductPage_PopUpClose() {
		this.ProductPage_PopUpClose.click();
	}
	
	@FindBy(xpath="//i[@class='tb_icon ico-linea-ecommerce-bag']")
	private WebElement Cart_Icon;
	public void MovetoCartIcon(){
	Actions act = new Actions(driver);
	act.moveToElement(Cart_Icon).build().perform();
	}
	
	@FindBy(xpath="//h3[contains(text(),'Shopping Cart')]")
	private WebElement CartPopUp_header;
	public String CartPopUp_header() {
		return this.CartPopUp_header.getText();
	}
	
	@FindBy(xpath="//td[@class='name']//a[contains(text(),'lacinia congue')]")
	private WebElement CartPopUp_product;
	public String CartPopUp_product() {
		return this.CartPopUp_product.getText();
	}
	
	@FindBy(xpath="//td[@class='quantity']")
	private WebElement CartPopUp_Quantity;
	public String CartPopUp_Quantity() {
		return this.CartPopUp_Quantity.getText();
	}
	
	@FindBy(xpath="//td[@class='total']")
	private WebElement CartPopUp_Price;
	public String CartPopUp_Price() {
		return this.CartPopUp_Price.getText();
	}
	
	@FindBy(xpath="//div[@class='mini-cart-total cart-total']//tr[1]//td[2]")
	private WebElement CartPopUp_SubTotal;
	public String CartPopUp_SubTotal() {
		return this.CartPopUp_SubTotal.getText();
	}
	
	@FindBy(xpath="//tr[2]//td[2]")
	private WebElement CartPopUp_Total;
	public String CartPopUp_Total() {
		return this.CartPopUp_Total.getText();
	}
	
	@FindBy(xpath="//a[contains(text(),'View Cart')]")
	private WebElement CartPopUp_ViewCart;
	public void CartPopUp_ViewCart() {
		this.CartPopUp_ViewCart.click();
	}
	
	@FindBy(xpath="//div[@class='cart-info tb_min_w_500']//img")
	private WebElement Cart_ProductImage;
	public boolean Cart_ProductImage() {
		return this.Cart_ProductImage.isDisplayed();
	}
	
	@FindBy(xpath="//div[@class='cart-info tb_min_w_500']//a[contains(text(),'lacinia congue')]")
	private WebElement Cart_ProductName;
	public boolean Cart_ProductName() {
		return this.Cart_ProductName.isDisplayed();
	}
	
	@FindBy(xpath="//td[contains(text(),'lacinia congue')]")
	private WebElement Cart_ProductModel;
	public boolean Cart_ProductModel() {
		return this.Cart_ProductModel.isDisplayed();
	}
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/section[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/input[1]")
	private WebElement Cart_productQuantity;
	public String Cart_productQuantity() {
		return this.Cart_productQuantity.getAttribute("value");
	}
	
	@FindBy(xpath="//td[@class='price'][contains(text(),'Rs.666')]")
	private WebElement Cart_ProductPrice;
	public String Cart_ProductPrice() {
		return this.Cart_ProductPrice.getText();
	}
	
	@FindBy(xpath="//div[@class='cart-info tb_min_w_500']//td[@class='total'][contains(text(),'Rs.666')]")
	private WebElement Cart_ProductTotal;
	public String Cart_ProductTotal() {
		return this.Cart_ProductTotal.getText();
	}
	
	@FindBy(xpath="//a[@class='btn btn-primary']")
	private WebElement Cart_Checkout;
	public void Cart_Checkout() {
		this.Cart_Checkout.click();
	}
	
	@FindBy(xpath="//p[contains(text(),'Checkout Options:')]")
	private WebElement CheckOut_Options;
	@FindBy(xpath="//legend[contains(text(),'Returning Customer')]")
	private WebElement CheckOut_ReturningCustomer;
	@FindBy(xpath="//div[@class='form-group']//div[1]//label[1]//input[1]")
	private WebElement CheckOut_RegisterRadio;
	@FindBy(xpath="//div[@id='collapse-checkout-option']//div[2]//label[1]//input[1]")
	private WebElement CheckOut_GuestRadio;
	public boolean CheckOut_LoginPage() {
		return this.CheckOut_Options.isDisplayed();
	}
	
	@FindBy(xpath="//div[@id='collapse-checkout-option']//div[2]//label[1]//input[1]")
	private WebElement Checkout_GuestRadioButton;
	public void Checkout_GuestRadioButton() {
		this.Checkout_GuestRadioButton.click();
	}
	public boolean Checkout_GuestRadioButton_checked() {
		return this.Checkout_GuestRadioButton.isSelected();
	}
	
	@FindBy(xpath="//input[@id='button-account']")
	private WebElement Checkout_ContinueButton;
	public void Checkout_ContinueButton() {
		this.Checkout_ContinueButton.click();
	}
	
	@FindBy(xpath="//legend[contains(text(),'Your Personal Details')]")
	private WebElement GuestCheckOut_PersonalDetails;
	public boolean GuestCheckOut_PersonalDetails() {
		return this.GuestCheckOut_PersonalDetails.isDisplayed();
	}
	
	@FindBy(xpath="//legend[contains(text(),'Your Address')]")
	private WebElement GuestCheckOut_Address;
	public boolean GuestCheckOut_Address() {
		return this.GuestCheckOut_Address.isDisplayed();
	}

	@FindBy(xpath="//input[@id='input-payment-firstname']")
	private WebElement GuestCheckOut_FirstName;
	public void GuestCheckOut_FirstName(String FirstName) {
		this.GuestCheckOut_FirstName.sendKeys(FirstName);
	}
	public String GuestCheckOut_FirstNameValue() {
		return this.GuestCheckOut_FirstName.getAttribute("value");
	}
	
	@FindBy(xpath="//input[@id='input-payment-lastname']")
	private WebElement GuestCheckOut_LastName;
	public void GuestCheckOut_LastName(String LastName) {
		this.GuestCheckOut_LastName.sendKeys(LastName);
	}
	public String GuestCheckOut_LastNameValue() {
		return this.GuestCheckOut_LastName.getAttribute("value");
	}
	
	@FindBy(xpath="//input[@id='input-payment-email']")
	private WebElement GuestCheckOut_Email;
	public void GuestCheckOut_Email(String Email) {
		this.GuestCheckOut_Email.sendKeys(Email);
	}
	public String GuestCheckOut_EmailValue() {
		return this.GuestCheckOut_Email.getAttribute("value");
	}
	
	@FindBy(xpath="//input[@id='input-payment-telephone']")
	private WebElement GuestCheckOut_Telephone;
	public void GuestCheckOut_Telephone(String TN) {
		this.GuestCheckOut_Telephone.sendKeys(TN);
	}
	public String GuestCheckOut_TNValue() {
		return this.GuestCheckOut_Telephone.getAttribute("value");
	}
	
	@FindBy(xpath="//input[@id='input-payment-address-1']")
	private WebElement GuestCheckOut_Address1;
	public void GuestCheckOut_Address1(String Add1) {
		this.GuestCheckOut_Address1.sendKeys(Add1);
	}
	public String GuestCheckOut_Address1Value() {
		return this.GuestCheckOut_Address1.getAttribute("value");
	}
	
	@FindBy(xpath="//input[@id='input-payment-city']")
	private WebElement GuestCheckOut_City;
	public void GuestCheckOut_City(String City) {
		this.GuestCheckOut_City.sendKeys(City);
	}
	public String GuestCheckOut_CityValue() {
		return this.GuestCheckOut_City.getAttribute("value");
	}
	
	@FindBy(xpath="//select[@id='input-payment-country']")
	private WebElement GuestCheckOut_Country;
	public void GuestCheckOut_Country(String Country) {
		Select Cntry = new Select(GuestCheckOut_Country);
		Cntry.selectByVisibleText(Country);;
	}
	public String GuestCheckOut_CountryValue() {
		Select Cntry = new Select(GuestCheckOut_Country);
		return Cntry.getFirstSelectedOption().getText();
		
	}
	
	@FindBy(xpath="//select[@id='input-payment-zone']")
	private WebElement GuestCheckOut_State;
	public void GuestCheckOut_State(String State) {
		Select Ste = new Select(GuestCheckOut_State);
		Ste.selectByVisibleText(State);
	}
	public String GuestCheckOut_StateValue() {
		Select Ste = new Select(GuestCheckOut_State);
		return Ste.getFirstSelectedOption().getText();
		
	}
	
	@FindBy(xpath="//input[@name='shipping_address']")
	private WebElement Deliv_Billing_Address_Radio;
	public boolean Guest_Deliv_Billing_AddressRadio() {
		return this.Deliv_Billing_Address_Radio.isSelected();
	}
	public void Guest_Deliv_Billing_AddressRadioClick() {
		this.Deliv_Billing_Address_Radio.click();
	}
	
	@FindBy(xpath="//input[@id='button-guest']")
	private WebElement GuestCheckOut_Continue;
	public void GuestCheckOut_Continue() {
		this.GuestCheckOut_Continue.click();
	}
	
	@FindBy(xpath="//input[@name='shipping_method']")
	private WebElement GuestCheckOut_FreeShipping_Radio;
	public boolean GuestCheckOut_FreeShipping_Radio() {
		return this.GuestCheckOut_FreeShipping_Radio.isSelected();
	}
	
	@FindBy(xpath="//textarea[@name='comment']")
	private WebElement GuestCheckOut_CommentTextbox;
	public boolean GuestCheckOut_CommentTextbox() {
		return this.GuestCheckOut_CommentTextbox.isDisplayed();
	}
	public void GuestCheckOut_CommentTextbox_AddComment(String Comment){
		this.GuestCheckOut_CommentTextbox.sendKeys(Comment);
	}
	
	@FindBy(xpath="//input[@id='button-shipping-method']")
	private WebElement Shipping_Continue;
	public void Shipping_Continue() {
		this.Shipping_Continue.click();
	}
	
	@FindBy(xpath="//input[@name='agree']")
	private WebElement TermsAndConditions;
	public void TermsAndConditions() {
		this.TermsAndConditions.click();
	}
	
	@FindBy(xpath="//input[@id='button-payment-method']")
	private WebElement PaymentMethod_Continue;
	public void PaymentMethod_Continue() {
		this.PaymentMethod_Continue.click();
	}
	
	@FindBy(xpath="//div[@id='collapse-checkout-confirm'][@aria-expanded='true']")
	private WebElement ConfirmOrderTab;
	public boolean ConfirmOrderTab() {
		return this.ConfirmOrderTab.isDisplayed();
	}
	
	@FindBy(xpath="//input[@id='button-confirm']")
	private WebElement ConfirmOrderButton;
	public void ConfirmOrderButton() {
		this.ConfirmOrderButton.click();
	}
	
	@FindBy(xpath="//p[contains(text(),'Your order has been successfully processed!')]")
	private WebElement SuccessMessage;
	public boolean SuccessMessage() {
		return this.SuccessMessage.isDisplayed();
	}
	
	@FindBy(xpath="//h3[@class='heading']//span[@class='tb_items'][contains(text(),'0')]")
	private WebElement Cart_Final;
	public void MovetoCartFinal(){
	Actions act1 = new Actions(driver);
	act1.moveToElement(Cart_Final).build().perform();
	}
	
	@FindBy(xpath="//div[@class='empty']")
	private WebElement CartMessage;
	public String CartMessage() {
		return this.CartMessage.getText();
	}
	
	
	
}
