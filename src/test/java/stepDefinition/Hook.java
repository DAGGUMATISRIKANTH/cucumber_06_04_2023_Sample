package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook {

	@Before("@SmokeTest")
	public void beforeValidation() 
	{
	System.out.println("smoke test cases");	
	}
	
	
  @After("@SmokeTest")
	public void afterValidation() 
	{
	System.out.println("passed smoke test cases ");	
	}
  @Before("@RegTest")
	public void BeforeValidation() 
	{
	System.out.println("Reg test cases");	
	}
	
	
@After("@RegTest")
	public void AfterValidation() 
	{
	System.out.println("passed Reg test cases ");	
	}
}
