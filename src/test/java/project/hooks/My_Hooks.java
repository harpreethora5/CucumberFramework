package project.hooks;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import project.factory.DriverFactory;

public class My_Hooks 
{
  private WebDriver driver;
  
  @Before
  public void before()
  {
	 System.out.println("inside before hook");
	 driver =  DriverFactory.initializedriver(System.getProperty("browser","chrome")); // As it is static
  }
  
  @After
  public void after()
  {
      System.out.println("inside after hook");
	  driver.quit();
  }
}

