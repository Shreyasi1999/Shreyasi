package StepDefinition;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src//test//resources//Features",
glue= {"StepDefinition","MyHooks"},strict=true,monochrome=false,
plugin= {"pretty","html:target/htmlreports","json:target/jsonreports/jsonreports.json"},
tags = "@Smoke or @Regression")
public class TestRunner extends AbstractTestNGCucumberTests{
	@BeforeClass
	public void first()
	{
		
	}
	@AfterClass
	public void last()
	{
		
	}
}


/*import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features",
glue= {"StepDefinition"},strict=true,monochrome=false,
plugin= {"junit:target/junitreports/junitreports.xml"})
public class TestRunner {
}*/
