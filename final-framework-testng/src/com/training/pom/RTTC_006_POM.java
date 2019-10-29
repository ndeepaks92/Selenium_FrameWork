package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RTTC_006_POM {

	private WebDriver driver;

	public RTTC_006_POM(WebDriver driver) {
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
	
	@FindBy(xpath="//a[contains(text(),'Change your password')]")
	private WebElement ChangePasswordLink;
	public void ChangePasswordLink(){
		this.ChangePasswordLink.click();
	}
	
	@FindBy(xpath="//legend[contains(text(),'Your Password')]")
	private WebElement PageHeader;
	public String PageHeader(){
		return this.PageHeader.getText();
	}
	
	@FindBy(xpath="//input[@id='input-password']")
	private WebElement Password1;
	public void NewPassword(String NewPassword){
		this.Password1.sendKeys(NewPassword);
	}
	
	public String NewPasswordvalue(){
		return this.Password1.getAttribute("value");
	}
	
	@FindBy(xpath="//input[@id='input-confirm']")
	private WebElement Password2;
	public void ConfirmNewPassword(String NewPasswordconfirm){
		this.Password2.sendKeys(NewPasswordconfirm);
	}
	
	public String ConfirmNewPasswordvalue(){
		return this.Password2.getAttribute("value");
	}
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement ContinueButton;
	public void ContinueButton(){
		this.ContinueButton.click();
	}
	
	@FindBy(xpath="//div[@class='alert alert-success']")
	private WebElement SuccessMessage;
	public String SuccessMessage() {
		return this.SuccessMessage.getText(); 
	}
}
