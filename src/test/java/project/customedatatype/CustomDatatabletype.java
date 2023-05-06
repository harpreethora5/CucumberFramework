package project.customedatatype;

import java.util.Map;

import io.cucumber.java.DataTableType;
import project.domainobjects.Billingdetails;

public class CustomDatatabletype 
{
  @DataTableType
  public Billingdetails billing(Map<String, String> entry)
  {
	return new Billingdetails(entry.get("first_name"),entry.get("last_name"), entry.get("country_name"), entry.get("street_address"), 
			entry.get("town_name"), entry.get("state_name"), entry.get("Post_Code"),entry.get("Email_address"));
  } // Please explain
}
