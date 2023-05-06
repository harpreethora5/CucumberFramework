package project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class StorePage extends BasePage
{
    @FindBy(css="a[title='View cart']") private WebElement viewcart;
    
    @FindBy(css="a[aria-label='Add “Blue Shoes” to your cart']") private WebElement Blueshoes;
    
    
	public StorePage(WebDriver driver) 
	{
		super(driver);
	}
	
	public void addtocartbutton(String productname)
	{
	     wait.until(ExpectedConditions.elementToBeClickable(Blueshoes)).click();
	     wait.until(ExpectedConditions.elementToBeClickable(viewcart)).click(); 
	}

}

// When to add argument in the method