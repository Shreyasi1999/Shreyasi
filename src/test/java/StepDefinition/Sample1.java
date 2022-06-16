package StepDefinition;

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



public class Sample1 {
public WebDriver driver;
public WebElement search;
@Given("user is on the search page {string}")
public void user_is_on_the_search_page(String string) {
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.get(string);
}



@When("user enters {string} data")
public void user_enters_data(String string) {
search=driver.findElement(By.name("q"));
search.sendKeys(string);

}



@And("click on search")
public void click_on_search() throws InterruptedException {
search.sendKeys(Keys.ENTER);
Thread.sleep(3000);

}



@Then("user is navigated to the search page")
public void user_is_navigated_to_the_search_page() {
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



}