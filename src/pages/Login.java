package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import browser.Prop;
import browser.browser;

public class Login extends browser {
	
	public Login() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@aria-label='Login']")
	public WebElement homeLoginButton;
	
	@FindBy(xpath = "//input[@type='tel']")
	public WebElement mobileInput;
	
	@FindBys({@FindBy(xpath = "//button[@aria-label='Login']")})
	public List<WebElement> loginButton;
	
	@FindBy(xpath = "//button[@aria-label='Verify OTP']")
	public WebElement verifyOtpBtn;
	
	@FindBy(xpath = "//button[@aria-label='Accept']")
	public WebElement acceptCookies;
	
	@FindBy(xpath = "//button[@aria-label='Get subscription']")
	public WebElement subscription;
	
	@FindBy(xpath = "//*[@id='__next']/div[1]/div/div[3]/div[3]/button")
	public WebElement plus;
	
	@FindBy(xpath = "//*[@id='__next']/div[1]/div/div[3]/div[3]/div[2]/div")
	public WebElement plan;
	
	
	public void explicitWait(WebElement element,long time) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
}

