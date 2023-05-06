package project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends BasePage
{
  public CartPage(WebDriver driver) 
   {
		super(driver);
   }

  @FindBy(xpath="//a[normalize-space()='Blue Shoes']") private WebElement productname;
  
  @FindBy(xpath="//input[@type='number']") private WebElement productqty;
  
  @FindBy(xpath = "//a[normalize-space()='Proceed to checkout']") private WebElement checkout;
  
  public String getName()
  {
	  return wait.until(ExpectedConditions.visibilityOf(productname)).getText();
  }
  
  public int getqty()
  {
	  return Integer.parseInt(wait.until(ExpectedConditions.visibilityOf(productqty)).getAttribute("value"));
  }
  
  public void proceedtocheckout()
  {
	  wait.until(ExpectedConditions.elementToBeClickable(checkout)).click();
  }
}

