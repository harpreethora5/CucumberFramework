package project;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import project.constants.EndPoint;
import project.domainobjects.Product;
import project.factory.DriverFactory;
import project.pages.CartPage;
import project.pages.StorePage;

public class Step1Def 
{
	private WebDriver driver;
	
	@Given("I am on the store page")
	public void i_am_on_the_store_page() 
	{
		driver = DriverFactory.getDriver(); 
		StorePage sp = new StorePage(driver); // Why didn't we create an object in StorePage
		sp.url(EndPoint.STORE.url);  // Why didn't use in store page. In Store page not able to access url method
	}

	@When("I add a {product} to the cart")
	public void i_add_to_the_cart(Product product)
	{
        StorePage sp = new StorePage(driver);
        sp.addtocartbutton(product.getName());  // Why creating two objects of storepage                             
	}

	
	  @Then("I should see {int} {product} in the cart") 
	  public void i_should_see_in_the_cart(int qty, Product product) 
	  { 
	      CartPage cartpage = new CartPage(driver);      // Why didn't write in Cartpage
	      Assert.assertEquals(product.getName(), cartpage.getName()); 
	      Assert.assertEquals(qty, cartpage.getqty()); 
	  }
}
