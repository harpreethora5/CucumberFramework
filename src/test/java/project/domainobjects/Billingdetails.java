package project.domainobjects;

public class Billingdetails 
{
	private String billingFirstName;
	private String billinglastname;
	private String billingcountry;
	private String billingstreetaddress;
	private String billingtown;
	private String billingstate;
	private String billingpostcode;
	private String billingEmail;
		
  public Billingdetails(String billingFirstName, String billinglastname, String billingcountry, String billingstreetaddress, 
		  String billingtown, String billingstate, String billingpostcode, String billingEmail) 
  {
		super();
		this.billingFirstName = billingFirstName;
		this.billinglastname = billinglastname;
		this.billingcountry = billingcountry;
		this.billingstreetaddress = billingstreetaddress;
		this.billingtown = billingtown;
		this.billingstate = billingstate;
		this.billingpostcode = billingpostcode;
		this.billingEmail = billingEmail;
	}

   public String getBillingFirstName() 
   {
	 return billingFirstName;
   }
  
	public void setBillingFirstName(String billingFirstName) 
	{
		this.billingFirstName = billingFirstName;
	}
	
	public String getBillinglastname() 
	{
		return billinglastname;
	}
	
	public void setBillinglastname(String billinglastname) {
		this.billinglastname = billinglastname;
	}
	
	public String getBillingcountry() 
	{
		return billingcountry;
	}
	
	public void setBillingcountry(String billingcountry) 
	{
		this.billingcountry = billingcountry;
	}
	
	public String getBillingstreetaddress() 
	{
		return billingstreetaddress;
	}
	
	public void setBillingstreetaddress(String billingstreetaddress) 
	{
		this.billingstreetaddress = billingstreetaddress;
	}
	
	public String getBillingtown() {
		return billingtown;
	}

	public void setBillingtown(String billingtown) {
		this.billingtown = billingtown;
	}
	
	public String getBillingstate() 
	{
		return billingstate;
	}
	
	public void setBillingstate(String billingstate) 
	{
		this.billingstate = billingstate;
	}
	
	public String getBillingpostcode() 
	{
		return billingpostcode;
	}
	
	public void setBillingpostcode(String billingpostcode) 
	{
		this.billingpostcode = billingpostcode;
	}
	
	public String getBillingEmail() 
	{
		return billingEmail;
	}
	
	public void setBillingEmail(String billingEmail) 
	{
		this.billingEmail = billingEmail;
	}
}
