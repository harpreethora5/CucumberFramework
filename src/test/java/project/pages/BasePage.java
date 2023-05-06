package project.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import project.utils.ConfigLoader;

public class BasePage
{
   protected WebDriver driver;
   protected WebDriverWait wait;
   
   
   public BasePage(WebDriver driver) 
   {
	this.driver = driver;
	wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	PageFactory.initElements(driver, this); // Why did we use this
  }

   
  public void url(String endPoint) // Why do we write this method and when to pass argument inside the method
  {
	  driver.get(ConfigLoader.getInstance().getBaseUrl()+endPoint);  
  }
  
}

// PageFactory is a class
// initElements is a method
// initElements(SearchContext, Class)
// searchContext is The driver that will be used to look up the elements
// this is the class