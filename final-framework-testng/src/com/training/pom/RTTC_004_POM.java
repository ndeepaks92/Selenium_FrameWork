package com.training.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RTTC_004_POM {

	private WebDriver driver; 
	
	public RTTC_004_POM(WebDriver driver) {
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
	
	@FindBy(xpath="//i[@class='fa fa-user-o']")
		private WebElement admin1;
	
	public void MovetoAdmin(){
		Actions act = new Actions(driver);
		act.moveToElement(admin1).build().perform();
	}
	
	@FindBy(xpath="//span[contains(text(),'MY ORDERS')]")
	private WebElement MyOrders;
	
	public void ClickMyOrders(){
		this.MyOrders.click();
	}
	
	@FindBy(xpath="/html/body/div/section[2]/div/div/div/div/div/div/div/table")
	private WebElement TableOrderHistory;
	
	public Boolean TableOrderHistoryPage(){
		return this.TableOrderHistory.isDisplayed();
	}
	
	@FindBy(xpath="/html/body/div/section[2]/div/div/div/div/div/div/div/table/thead/tr/td")
	private WebElement ColumnHeader1;
	public String ColumnHeader1(){
		return this.ColumnHeader1.getText();
	}
	
	@FindBy(xpath="/html/body/div/section[2]/div/div/div/div/div/div/div/table/thead/tr/td[2]")
	private WebElement ColumnHeader2;
	public String ColumnHeader2(){
		return this.ColumnHeader2.getText();
	}
	
	@FindBy(xpath="/html/body/div/section[2]/div/div/div/div/div/div/div/table/thead/tr/td[3]")
	private WebElement ColumnHeader3;
	public String ColumnHeader3(){
		return this.ColumnHeader3.getText();
	}
	
	@FindBy(xpath="/html/body/div/section[2]/div/div/div/div/div/div/div/table/thead/tr/td[4]")
	private WebElement ColumnHeader4;
	public String ColumnHeader4(){
		return this.ColumnHeader4.getText();
	}
	
	@FindBy(xpath="/html/body/div/section[2]/div/div/div/div/div/div/div/table/thead/tr/td[5]")
	private WebElement ColumnHeader5;
	public String ColumnHeader5(){
		return this.ColumnHeader5.getText();
	}
	
	@FindBy(xpath="/html/body/div/section[2]/div/div/div/div/div/div/div/table/thead/tr/td[6]")
	private WebElement ColumnHeader6;
	public String ColumnHeader6(){
		return this.ColumnHeader6.getText();
	}
	
	@FindBy(xpath="/html/body/div/section[2]/div/div/div/div/div/div/div/table/tbody")
	private WebElement Orders;
	public List<WebElement> OrderList(){
		return Orders.findElements(By.tagName("tr"));
	}
	
	@FindBy(xpath="//i[@class='fa fa-eye']")
	private WebElement OrderEye;
	public void OrderEyeClick(){
		this.OrderEye.click();
	}

	@FindBy(xpath="/html/body/div/section[2]/div/div/div/div/div/div/div/table")
	private WebElement Table1_OrderDetail;
	public Boolean Table1_OrderDetail(){
		return this.Table1_OrderDetail.isDisplayed();
	}
	
	@FindBy(xpath="/html/body/div/section[2]/div/div/div/div/div/div/div/table/thead/tr/td")
	private WebElement Table1_Title_OrderDetail;
	public String Table1_Title(){
		return this.Table1_Title_OrderDetail.getText();
	}
	
	@FindBy(xpath="/html/body/div/section[2]/div/div/div/div/div/div/div/table[2]")
	private WebElement Table2_OrderDetail;
	public Boolean Table2_OrderDetail(){
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
	public Boolean Table3_OrderDetail(){
		return this.Table3_OrderDetail.isDisplayed();
	}
	
	@FindBy(xpath="/html/body/div/section[2]/div/div/div/div/div/div/div/div/table/tbody")
	private WebElement Table3_Data_OrderDetail;
	public Boolean Table3_Data_OrderDetail(){
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
	public Boolean Table4_OrderDetail(){
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
}
