package qsp1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoAB extends BaseTest {
	final int i=3;
	
	@Test(invocationCount=i)
	
	public void createCustomer()
	{
	Reporter.log("CreateCustomer",true);	
	}

@Test
	
	public void deleteCustomer()
	{
	Reporter.log("DeleteCustomer",true);	
	}
}
