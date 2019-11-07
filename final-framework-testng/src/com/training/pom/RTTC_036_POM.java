package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RTTC_036_POM {

	private WebDriver driver; 
	
	public RTTC_036_POM(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//i[@class='fa fa-user-o']")
	private WebElement LoginRegisterbutton;
	public void ClickLoginRegisterButton() {
		this.LoginRegisterbutton.click(); 
	}

	@FindBy(xpath="//input[@id='input-email']")
	private WebElement userName;
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	@FindBy(xpath="//input[@id='input-password']")
	private WebElement password;
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement LoginButton;
	public void ClickLoginButton() {
		this.LoginButton.click(); 
	}
	
	@FindBy(xpath="//i[@class='fa fa-user-o']")
	private WebElement admin1;

	public void MovetoAdmin(){
	Actions act = new Actions(driver);
	act.moveToElement(admin1).build().perform();
	}
	
	
	@FindBy(xpath="//span[contains(text(),'MY ACCOUNT')]")
	private WebElement MyAccount;
	public boolean VerifyMyAccount() {
		return this.MyAccount.isDisplayed();
	}
	
	@FindBy(xpath="//span[contains(text(),'LOGOUT')]")
	private WebElement LogOut;
	public boolean VerifyLogOut() {
		return this.LogOut.isDisplayed();
	}
	
	@FindBy(xpath="//span[contains(text(),'MY ORDERS')]")
	private WebElement MyOrders;
	public boolean VerifyMyOrders() {
		return this.MyOrders.isDisplayed();
	}
	public void ClickMyOrders(){
		this.MyOrders.click();
	}
	
	@FindBy(xpath="/html/body/div/section[2]/div/div/div/div/div/div/div/table")
	private WebElement OrderHistory_Table;
	public boolean VerifyOrderHistory_Table(){
		return this.OrderHistory_Table.isDisplayed();
	}
	
	@FindBy(xpath="/html/body/div/section[2]/div/div/div/div/div/div/div/table/tbody/tr/td")
	private WebElement Column1_Value1;
	public boolean verify_Column1_Value1(){
		return this.Column1_Value1.isDisplayed();
	}
	
	@FindBy(xpath="/html/body/div/section[2]/div/div/div/div/div/div/div/table/tbody/tr/td[2]")
	private WebElement Column2_Value1;
	public boolean Verify_Column2_Value1(){
		return this.Column2_Value1.isDisplayed();
	}
	
	@FindBy(xpath="/html/body/div/section[2]/div/div/div/div/div/div/div/table/tbody/tr/td[3]")
	private WebElement Column3_Value1;
	public boolean Verify_Column3_Value1(){
		return this.Column3_Value1.isDisplayed();
	}
	
	@FindBy(xpath="/html/body/div/section[2]/div/div/div/div/div/div/div/table/tbody/tr/td[4]")
	private WebElement Column4_Value1;
	public boolean Verify_Column4_Value1(){
		return this.Column4_Value1.isDisplayed();
	}
	
	@FindBy(xpath="/html/body/div/section[2]/div/div/div/div/div/div/div/table/tbody/tr/td[5]")
	private WebElement Column5_Value1;
	public boolean Verify_Column5_Value1(){
		return this.Column5_Value1.isDisplayed();
	}
	
	@FindBy(xpath="/html/body/div/section[2]/div/div/div/div/div/div/div/table/tbody/tr/td[6]")
	private WebElement Column6_Value1;
	public boolean Verify_Column6_Value1(){
		return this.Column6_Value1.isDisplayed();
	}
	
	@FindBy(xpath="//i[@class='fa fa-eye']")
	private WebElement ViewIcon;
	public void Click_ViewIcon(){
		this.ViewIcon.click();
	}
	
	@FindBy(xpath="/html/body/div/section[2]/div/div/div/div/div/div/div/table")
	private WebElement Table1_OrderDetail;
	public boolean Table1_OrderDetail(){
		return this.Table1_OrderDetail.isDisplayed();
	}
	
	@FindBy(xpath="/html/body/div/section[2]/div/div/div/div/div/div/div/table/thead/tr/td")
	private WebElement Table1_Title_OrderDetail;
	public String Table1_Title(){
		return this.Table1_Title_OrderDetail.getText();
	}
	
	@FindBy(xpath="/html/body/div/section[2]/div/div/div/div/div/div/div/table[2]")
	private WebElement Table2_OrderDetail;
	public boolean Table2_OrderDetail(){
		return this.Table2_OrderDetail.isDisplayed();
	}
	
	@FindBy(xpath="/html/body/div/section[2]/div/div/div/div/div/div/div/table[2]/thead/tr/td")
	private WebElement Table2_Title1_OrderDetail;
	public String Table2_Title1(){
		return this.Table2_Title1_OrderDetail.getText();
	}
	
	@FindBy(xpath="/html/body/div/section[2]/div/div/div/div/div/div/div/table[2]/thead/tr/td[2]")
	private WebElement Table2_Title2_OrderDetail;
	public String Table2_Title2(){
		return this.Table2_Title2_OrderDetail.getText();
	}
	
	@FindBy(xpath="/html/body/div/section[2]/div/div/div/div/div/div/div/div/table")
	private WebElement Table3_OrderDetail;
	public boolean Table3_OrderDetail(){
		return this.Table3_OrderDetail.isDisplayed();
	}
	
	@FindBy(xpath="/html/body/div/section[2]/div/div/div/div/div/div/div/div/table/tbody")
	private WebElement Table3_Data_OrderDetail;
	public boolean Table3_Data_OrderDetail(){
		return this.Table3_Data_OrderDetail.isDisplayed();
	}
	
	@FindBy(xpath="/html/body/div/section[2]/div/div/div/div/div/div/div/div/table/thead/tr/td")
	private WebElement Table3_header1;
	public String Table3_header1(){
		return this.Table3_header1.getText();
	}
	
	@FindBy(xpath="/html/body/div/section[2]/div/div/div/div/div/div/div/div/table/thead/tr/td[2]")
	private WebElement Table3_header2;
	public String Table3_header2(){
		return this.Table3_header2.getText();
	}
	
	@FindBy(xpath="/html/body/div/section[2]/div/div/div/div/div/div/div/div/table/thead/tr/td[3]")
	private WebElement Table3_header3;
	public String Table3_header3(){
		return this.Table3_header3.getText();
	}
	
	@FindBy(xpath="/html/body/div/section[2]/div/div/div/div/div/div/div/div/table/thead/tr/td[4]")
	private WebElement Table3_header4;
	public String Table3_header4(){
		return this.Table3_header4.getText();
	}
	
	@FindBy(xpath="/html/body/div/section[2]/div/div/div/div/div/div/div/div/table/thead/tr/td[5]")
	private WebElement Table3_header5;
	public String Table3_header5(){
		return this.Table3_header5.getText();
	}
	
	@FindBy(xpath="/html/body/div/section[2]/div/div/div/div/div/div//div/table[3]")
	private WebElement Table4_OrderDetail;
	public boolean Table4_OrderDetail(){
		return this.Table4_OrderDetail.isDisplayed();
	}
	
	@FindBy(xpath="/html/body/div/section[2]/div/div/div/div/div/div//div/table[3]/thead/tr/td")
	private WebElement Table4_header1;
	public String Table4_header1(){
		return this.Table4_header1.getText();
	}

	@FindBy(xpath="/html/body/div/section[2]/div/div/div/div/div/div//div/table[3]/thead/tr/td[2]")
	private WebElement Table4_header2;
	public String Table4_header2(){
		return this.Table4_header2.getText();
	}
	
	@FindBy(xpath="/html/body/div/section[2]/div/div/div/div/div/div//div/table[3]/thead/tr/td[3]")
	private WebElement Table4_header3;
	public String Table4_header3(){
		return this.Table4_header3.getText();
	}
	
	@FindBy(xpath="//a[2]//i[1]")
	private WebElement ReturnButton;
	public void Click_ReturnButton(){
		this.ReturnButton.click();
	}
	@FindBy(xpath="//input[@id='input-firstname']")
	private WebElement Return_FirstName;
	public String Return_FirstName(){
		return this.Return_FirstName.getAttribute("value");
	}
	
	@FindBy(xpath="//input[@id='input-lastname']")
	private WebElement Return_lastName;
	public String Return_lastName(){
		return this.Return_lastName.getAttribute("value");
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement Return_Email;
	public String Return_Email(){
		return this.Return_Email.getAttribute("value");
	}
	
	@FindBy(xpath="//input[@id='input-telephone']")
	private WebElement Return_Telephone;
	public String Return_Telephone(){
		return this.Return_Telephone.getAttribute("value");
	}
	
	@FindBy(xpath="//input[@id='input-order-id']")
	private WebElement Return_OrderID;
	public String Return_OrderID(){
		return this.Return_OrderID.getAttribute("value");
	}
	
	@FindBy(xpath="//input[@id='input-date-ordered']")
	private WebElement Return_OrderDate;
	public String Return_OrderDate(){
		return this.Return_OrderDate.getAttribute("value");
	}
	
	@FindBy(xpath="//input[@id='input-product']")
	private WebElement Return_ProductName;
	public String Return_ProductName(){
		return this.Return_ProductName.getAttribute("value");
	}
	
	@FindBy(xpath="//input[@id='input-model']")
	private WebElement Return_ProductCode;
	public String Return_ProductCode(){
		return this.Return_ProductCode.getAttribute("value");
	}
	
	@FindBy(xpath="//input[@id='input-quantity']")
	private WebElement Return_Quantity;
	public String Return_Quantity(){
		return this.Return_Quantity.getAttribute("value");
	}
	
	@FindBy(xpath="//div[@class='col-sm-10']//div[1]//label[1]//input[1]")
	private WebElement Return_ReasonForVisit;
	public void Select_Return_ReasonForVisit(){
		this.Return_ReasonForVisit.click();
	}
	public boolean Verify_Return_ReasonForVisit(){
		return this.Return_ReasonForVisit.isSelected();
	}
	
	@FindBy(xpath="//input[@name='opened'][@value='1']")
	private WebElement Return_ProductOpened;
	public void Select_Return_ProductOpened(){
		this.Return_ProductOpened.click();
	}
	public boolean Verify_Return_ProductOpened(){
		return this.Return_ProductOpened.isSelected();
	}
	
	@FindBy(xpath="//textarea[@id='input-comment']")
	private WebElement Return_TextBox;
	
	public void Enter_Return_TextBox(String Text){
		this.Return_TextBox.sendKeys(Text);;
	}
	public String Verify_Return_TextBox(){
		return this.Return_TextBox.getAttribute("value");
	}
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement Return_SubmitButton;
	public void Click_Return_SubmitButton(){
		this.Return_SubmitButton.click();
	}
	
	@FindBy(xpath="//p[contains(text(),'Thank you for submitting your return request. Your')]")
	private WebElement FinalSuccessMessage1;
	public String Verify_FinalSuccessMessage1(){
		return this.FinalSuccessMessage1.getText();
	}
	
	@FindBy(xpath="//p[contains(text(),'You will be notified via e-mail as to the status o')]")
	private WebElement FinalSuccessMessage2;
	public String Verify_FinalSuccessMessage2(){
		return this.FinalSuccessMessage2.getText();
	}
}
