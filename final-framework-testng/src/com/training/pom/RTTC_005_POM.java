package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RTTC_005_POM {

	private WebDriver driver; 
	
	public RTTC_005_POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//i[@class='fa fa-user-o']")
	private WebElement LoginRegisterbutton;
	
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@id='input-password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement LoginButton;
	
	public void ClickLoginRegisterButton() {
		this.LoginRegisterbutton.click(); 
	}
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void ClickLoginButton() {
		this.LoginButton.click(); 
	}
	
	@FindBy(xpath="//a[contains(text(),'Edit your account information')]")
	private WebElement EditAccountInfo;
	public void ClickEditAccountInfo(){
		this.EditAccountInfo.click();
	}
	
	@FindBy(xpath="//legend[contains(text(),'Your Personal Details')]")
	private WebElement PageHeader;
	public String PageHeader(){
		return this.PageHeader.getText();
	}
	
	@FindBy(xpath="//label[contains(text(),'First Name')]")
	private WebElement Label_FN;
	public void Label_FN(){
		this.Label_FN.isDisplayed();
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
	private WebElement LabelValue_FN;
	public String LabelValue_FN(){
		return this.LabelValue_FN.getAttribute("value");
	}
	
	public void Label_FN_NewValue(String NewFirstName){
		this.LabelValue_FN.clear();
		this.LabelValue_FN.sendKeys(NewFirstName);
	}
	
	
	@FindBy(xpath="//label[contains(text(),'Last Name')]")
	private WebElement Label_LN;
	public void Label_LN(){
		this.Label_LN.isDisplayed();
	}
	
	@FindBy(xpath="//input[@id='input-lastname']")
	private WebElement LabelValue_LN;
	public String LabelValue_LN(){
		return this.LabelValue_LN.getAttribute("value");
	}
	
	public void Label_LN_NewValue(String NewLastName){
		this.LabelValue_LN.clear();
		this.LabelValue_LN.sendKeys(NewLastName);
	}
	
	@FindBy(xpath="//label[contains(text(),'E-Mail')]")
	private WebElement Label_Email;
	public void Label_Email(){
		this.Label_Email.isDisplayed();
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement LabelValue_Email;
	public String LabelValue_Email(){
		return this.LabelValue_Email.getAttribute("value");
	}
	
	public void Label_Email_NewValue(String NewEmail){
		this.LabelValue_Email.clear();
		this.LabelValue_Email.sendKeys(NewEmail);
	}
	
	@FindBy(xpath="//label[contains(text(),'Telephone')]")
	private WebElement Label_TN;
	public void Label_TN(){
		this.Label_TN.isDisplayed();
	}
	
	@FindBy(xpath="//input[@id='input-telephone']")
	private WebElement LabelValue_TN;
	public String LabelValue_TN(){
		return this.LabelValue_TN.getAttribute("value");
	}
	
	public void Label_TN_NewValue(String NewEmail){
		this.LabelValue_TN.clear();
		this.LabelValue_TN.sendKeys(NewEmail);
	}
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement ContinueButton;
	public void ClickContinueButton() {
		this.ContinueButton.click(); 
	}
	
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement SuccessMessage;
	public String SuccessMessage() {
		return this.SuccessMessage.getText(); 
	}
	
}
