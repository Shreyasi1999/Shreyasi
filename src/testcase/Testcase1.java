package testcase;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import browser.Prop;
import browser.browser;
import pages.Login;

public class Testcase1 {
	Login login;
	
	@BeforeTest
	public void beforeTest() throws Exception {
		browser.setDriver();
		browser.getUrl();
		login = new Login();
	}
	
	@Test
	public void login() throws Exception {
    	login.homeLoginButton.click();
    	Thread.sleep(3000);
    	login.mobileInput.sendKeys(Prop.getProperty("mobile"));
    	List<WebElement> d =login.loginButton; 
    	d.get(1).click();
    	Thread.sleep(30000);
    	login.verifyOtpBtn.click();
    	Thread.sleep(5000);
    	login.acceptCookies.click();
    	login.subscription.click();
    	
    	login.explicitWait(login.plus, 5000);
    	
    	if(login.plus.isDisplayed()) {
    		login.plus.click();
    	}else {
    		System.out.println("Not clicked");
    	}
    	
         login.plan.click();
    }
	
	@AfterTest
	public void afterTest() {
		browser.closeBrowser();
	}
	
}
