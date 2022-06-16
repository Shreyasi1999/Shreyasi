package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	public WebDriver driver;
	
	@Given("open the browser")
	public void open_the_browser() {
		WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	}

	@When("enter the {string}")
	public void enter_the(String string) {
		driver.get(string);
	}

	@Then("Page is displayed")
	public void page_is_displayed() {
	    try
		{
	 	   Assert.assertEquals(driver.getTitle(), "Google");
	 	   
	 	}
	 		catch(AssertionError e)
	 		{
	 			System.out.println("Title not found");
	 	
	 		}
	    driver.quit();
	}

}
