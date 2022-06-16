package MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {
	@Before()
	public void initialize()
	{
		System.out.println("Launching Browser...");
	}
	
  /*@Before("@Smoke")
	public void initialize1()
	{
		System.out.println("Launching Browser...");
	}*/
  /*@Before(order=2)
	public void open()
	{
		System.out.println("Launching Application...");
	}*/
	
	@BeforeStep
	public void before()
	{
		System.out.println("Before step...");
	}
	@AfterStep
	public void after()
	{
		System.out.println("After step...");
	}
	
	@After
	public void down()
	{
		System.out.println("Shutting Down...");
	}
}
