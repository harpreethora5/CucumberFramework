package project;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import project.constants.My_Constants;
import project.domainobjects.Billingdetails;
import project.factory.DriverFactory;
import project.pages.CartPage;
import project.pages.CheckoutPage;
import project.pages.StorePage;

public class Step3Def 
{
	private WebDriver driver;
	private Billingdetails billingdetails;
	
	@Given("I'm a customer")
	public void i_m_a_customer() 
	{
		driver = DriverFactory.getDriver();  // Why created this? // It is used to return the driver variable
		StorePage sp = new StorePage(driver);  // Why didn't we create an object in StorePage
		sp.url(My_Constants.Store); // Why didn't use in store page. In Store page not able to access url method
	}

	@Given("My Billing Details are:-")
	public void my_billing_details_are(Billingdetails billingdetails) 
	{
		this.billingdetails = billingdetails;
	}

	@Given("I have product in the cart")
	public void i_have_product_in_the_cart() 
	{
		 StorePage sp = new StorePage(driver); // Why creating two objects of storepage
		 sp.addtocartbutton("Blue Shoes"); // Why blue shoes written
	}

	@Given("I'm on checkout page")
	public void i_m_on_checkout_page() 
	{
		CartPage cp = new CartPage(driver); // Why created an object of cartpage here
		cp.proceedtocheckout();
	}

	@When("I provide billing details")
	public void i_provide_billing_details() 
	{
		CheckoutPage checkoutpage = new CheckoutPage(driver);
		checkoutpage.setbillingdetails(billingdetails);
	}

	@When("I place the order")
	public void i_place_the_order() 
	{
		CheckoutPage cp1 = new CheckoutPage(driver);   // Why created an object of checkout here
	    cp1.placeorder();
	}

	@Then("The order is placed successfully")
	public void the_order_is_placed_successfully() 
	{
		CheckoutPage cp2 = new CheckoutPage(driver);  // Why did we create one more object here
		Assert.assertEquals("Thank you. Your order has been received.", cp2.text());
	}
}
