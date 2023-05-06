package project.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory 
{
  private static WebDriver driver;  
  // We made the driver variable as static as we can't use non static variable in static method
  
  public static WebDriver initializedriver(String browser)   
  { 
	  switch (browser)
	  {
	   case "chrome":
	    WebDriverManager.chromedriver().setup();
	    System.setProperty("webdriver.http.factory", "jdk-http-client");
	    driver = new ChromeDriver();
	    break;

	   case "firefox":
		WebDriverManager.firefoxdriver().setup();
	    System.setProperty("webdriver.gecko.driver","D:\\driver\\geckodriver.exe");
	    driver = new FirefoxDriver();
	    break;
	    
	    default:
	    throw new IllegalStateException("Invalid Browser:"+browser);
	  }
	  
	  driver.manage().window().maximize();
	  return driver;                        
  }
  
  public static WebDriver getDriver()
  {
	  return driver;
  }
}

// If returning the object, the object belongs to Webdriver class just like int, String etc.
// We can add an extra method to do null check on the driver