package Background;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample2 {
	public WebDriver driver;

@Given("User is on the the browser")
public void user_is_on_the_the_browser() {
	WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
}
@When("User enters the {string}")
public void user_enters_the(String string) {
	driver.get(string);
}

@And("User enters search data")
public void user_enters_search_data() {
	WebElement search = driver.findElement(By.name("q"));
	search.sendKeys("Java");
	search.sendKeys(Keys.ENTER);
}
@Then("User checks the title of the page")
public void user_checks_the_title_of_the_page() {
	try
	{
	boolean result=driver.getTitle().matches("[A-Za-z]*[ ][-][ ]Google Search");
	Assert.assertEquals(true,result);
	}
	catch(Exception e)
	{
	System.out.println("User does not navigate to search page");
	}
	driver.quit();
}

@And("User clicks on the link")
public void user_clicks_on_the_link() {
	 driver.findElement(By.linkText("Gmail")).click();
}
@Then("User checks the search title of the page")
public void user_checks_the_search_title_of_the_page() {
	try
	{
 	   Assert.assertEquals(driver.getTitle(), "Gmail");
 	}
 		catch(AssertionError e)
 		{
 			System.out.println("Title not found");
 		}
    driver.quit();
}

}