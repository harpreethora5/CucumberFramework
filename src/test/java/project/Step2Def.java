package project;

import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import project.constants.EndPoint;
import project.factory.DriverFactory;
import project.pages.CartPage;
import project.pages.CheckoutPage;
import project.pages.StorePage;

public class Step2Def 
{
	private WebDriver driver;
	private String billingFirstName;
	private String billingLastName;
	private String billingcountry;
	private String billingAddress;
	private String billingcity;
	private String billingStateName;
	private String billingZip;
	private String billingEmail;
	
	@Given("I'm a guest customer")
	public void i_m_a_guest_customer() 
	
	{	
		driver = DriverFactory.getDriver();  // Why created this? // It is used to return the driver variable
		StorePage sp = new StorePage(driver);  // Why didn't we create an object in StorePage
		sp.url(EndPoint.STORE.url); // Why didn't use in store page. In Store page not able to access url method
	}
	
	@And("My Billing Details are")
	public void my_billing_details_are(List <Map<String,String>> billingdetails) 
	{
		billingFirstName = billingdetails.get(0).get("firstname");
		billingLastName = billingdetails.get(0).get("lastname");
		billingcountry = billingdetails.get(0).get("country");
		billingAddress = billingdetails.get(0).get("street address");;
		billingcity = billingdetails.get(0).get("Town/City");
		billingStateName = billingdetails.get(0).get("state");
		billingZip = billingdetails.get(0).get("Post Code");
		billingEmail = billingdetails.get(0).get("Email");
		
	}

	@And("I have a product in the cart")
	public void i_have_a_product_in_the_cart()
	{    
		 StorePage sp = new StorePage(driver); // Why creating two objects of storepage
		 sp.addtocartbutton("Blue Shoes"); // Why blue shoes written
	}

	@And("I'm on the checkout page")
	public void i_m_on_the_checkout_page() 
	{	
		CartPage cp = new CartPage(driver); // Why created an object of cartpage here
		cp.proceedtocheckout();
	}
	
	@When("I provide the billing details")
	public void i_provide_the_billing_details() 
	{
	  CheckoutPage checkoutpage = new CheckoutPage(driver);
	  checkoutpage.setbillingdetails(billingFirstName, billingLastName, billingcountry, billingAddress, billingcity, billingStateName,
			  billingZip, billingEmail);
	}

	@When("I place an order")       
	public void i_place_an_order() 
	{   
	    CheckoutPage cp1 = new CheckoutPage(driver);   // Why created an object of checkout here
	    cp1.placeorder();
	}

	@Then("The order should be placed successfully")
	public void the_order_should_be_placed_successfully() 
	{

		CheckoutPage cp2 = new CheckoutPage(driver);  // Why did we create one more object here
		Assert.assertEquals("Thank you. Your order has been received.", cp2.text());
	}
}
