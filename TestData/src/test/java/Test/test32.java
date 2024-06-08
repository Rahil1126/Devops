package Test;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import Pageobjects.Loginpage;



public class test32 extends TestBase1 {
	
	/*@Test
	public void init() throws Exception{
	//driver.get("<a href="https://www.facebook.com">https://www.facebook.com</a>");
	Loginpage loginpage = PageFactory.initElements(driver, Loginpage.class);
	loginpage.setEmail("your-username");
	loginpage.setPassword("your-password");
	loginpage.clickOnLoginButton();
	HomePage homepage = PageFactory.initElements(driver, HomePage.class);
	homepage.clickOnProfileDropdown();
//	homepage.verifyLoggedInUserNameText();
	homepage.clickOnLogoutLink();
	}*/
	
	
	@Test
	public void Testclass1() {
		
		
		driver.get(baseurl);
		
		Loginpage lp = new Loginpage(driver);
		
		lp.setusername(username);
		lp.setpasword(password);
		
		lp.clicksubmit();
		
		
		lp.addme();
		
	  
	//	lp.text(utext);
	//	lp.date();
		
		
		
	
	}
	

}
