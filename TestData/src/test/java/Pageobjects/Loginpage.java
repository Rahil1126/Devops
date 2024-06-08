package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	
	WebDriver driver;
	public Loginpage(WebDriver driver){	
		
		
		PageFactory.initElements(driver, this);
	}
/*	//Using FindBy for locating elements
	@FindBy(how=How.XPATH, using="//input[@text='uid'][@name='uid']") WebElement emailTextBox;
	@FindBy(how=How.XPATH, using="//input[@type='password'][@name='pass']") WebElement passwordTextBox;
	@FindBy(how=How.XPATH, using="//input[@type='submit'][@id='u_0_5']") WebElement signinButton;
	// Defining all the user actions (Methods) that can be performed in the Facebook home page</span>
	 
	// This method is to set Email in the email text box
	public void setEmail(String strEmail){
	emailTextBox.sendKeys(strEmail);
	}
	// This method is to set Password in the password text box
	public void setPassword(String strPassword){
	passwordTextBox.sendKeys(strPassword);}
	 
	// This method is to click on Login Button
	public void clickOnLoginButton(){
	signinButton.click();
	}*/
	
	
	@FindBy(name = "uid")
	WebElement txtusername;
	
	@FindBy(name = "password")
	WebElement textpassword;
	
	@FindBy(name = "btnLogin")
	WebElement btnLogin;
	
	@FindBy(linkText="New Customer")
	WebElement Newcust;
	
	@FindBy(name= "name")
	WebElement textbox;
	
	@FindBy(id="dob")
	WebElement dateof;
 
	
	public void setusername(String uname) {
		txtusername.sendKeys(uname);
	}
	
	
	public void setpasword(String pwd) {
		textpassword.sendKeys(pwd);
	}
	
	public void clicksubmit() {
		
		btnLogin.click();
	}
		public void addme() {
			Newcust.click();
			
		}
		
		public void text(String utext) {
			
			textbox.sendKeys(utext);
			}
		
		public void date() {
			dateof.click();
		}
	

}
