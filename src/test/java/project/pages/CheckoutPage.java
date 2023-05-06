package project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage extends BasePage
{
	public CheckoutPage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(id="billing_first_name") private WebElement fname;
	
	@FindBy(id="billing_last_name") private WebElement lname;
	
	@FindBy(id="billing_country") private WebElement countryname;
   
    @FindBy(id="billing_address_1") private WebElement streetaddress;
    
    @FindBy(id="billing_city") private WebElement TownCity;
    
    @FindBy(id="billing_state") private WebElement state;
    
    @FindBy(id="billing_postcode") private WebElement Zipcode;
    
    @FindBy(id="billing_email") private WebElement emailaddress;
    
    @FindBy(id="place_order") private WebElement placeorder;
    
    @FindBy(xpath="//p[@class='woocommerce-notice woocommerce-notice--success woocommerce-thankyou-order-received']") private WebElement text;
        
    
    public CheckoutPage first_name(String ftname) // Doubt
    {
    	WebElement e = wait.until(ExpectedConditions.visibilityOf(fname));
    	e.clear();
    	e.sendKeys(ftname); // Doubt
    	return this; // this returns an object of CheckoutPage class
    }
    
    public CheckoutPage last_name(String ltname)
    {
    	WebElement e = wait.until(ExpectedConditions.visibilityOf(lname));
    	e.clear();
    	e.sendKeys(ltname);
    	return this;
    }
    
    public CheckoutPage country_name(String cname)
    {
    	Select select = new Select(wait.until(ExpectedConditions.visibilityOf(countryname)));
    	select.selectByVisibleText(cname);
    	return this;
    }
    
    public CheckoutPage address_name(String aname)
    {
    	WebElement e = wait.until(ExpectedConditions.visibilityOf(streetaddress));
    	e.clear();
    	e.sendKeys(aname);
    	return this;
    }
    
    public CheckoutPage town_name(String tname)
    {
    	WebElement e = wait.until(ExpectedConditions.visibilityOf(TownCity));
    	e.clear();
    	e.sendKeys(tname);
    	return this;
    }
    
    public CheckoutPage state_name(String sname)
    {
    	Select select = new Select(wait.until(ExpectedConditions.visibilityOf(state)));
    	select.selectByVisibleText(sname);
    	return this;
    }
    
    public CheckoutPage post_code(String pcode)
    {
    	WebElement e = wait.until(ExpectedConditions.visibilityOf(Zipcode));
    	e.clear();
    	e.sendKeys(pcode);
    	return this;
    }
    
    public CheckoutPage email_name(String ename)
    {
    	WebElement e = wait.until(ExpectedConditions.visibilityOf(emailaddress));
    	e.clear();
    	e.sendKeys(ename);
    	return this;
    }
    
    
    
	
	
	  public CheckoutPage setbillingdetails(String ftname, String ltname, String
	  cname, String aname, String tname, String sname, String pcode, String ename)
	  { return
	  first_name(ftname).last_name(ltname).country_name(cname).address_name(aname).
	  town_name(tname).state_name(sname). post_code(pcode).email_name(ename); }
	 
	  
    // Doubt (Add/Remove for Step2Def)
	 
	
	/*
	 * public CheckoutPage setbillingdetails(Billingdetails billingdetails) { return
	 * first_name(billingdetails.getBillingFirstName()).
	 * last_name(billingdetails.getBillinglastname()).
	 * country_name(billingdetails.getBillingcountry()).
	 * address_name(billingdetails.getBillingstreetaddress()).
	 * town_name(billingdetails.getBillingtown()).
	 * state_name(billingdetails.getBillingstate()).
	 * post_code(billingdetails.getBillingpostcode()).
	 * email_name(billingdetails.getBillingEmail()); }
	 */
	 
		// Doubt (Add/Remove for Step3Def)
    
    public void placeorder()
    {
    	wait.until(ExpectedConditions.elementToBeClickable(placeorder)).click();
    }
    
    public String text()
    {
    	return wait.until(ExpectedConditions.visibilityOf(text)).getText();
    }
	
	}
