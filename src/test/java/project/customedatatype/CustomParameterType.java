package project.customedatatype;

import io.cucumber.java.ParameterType;
import project.domainobjects.Product;

public class CustomParameterType 
{
  @ParameterType(".*")
  public Product product(String name)
  {
	return new Product(name.replace("\"", ""));
	  
  }
}
