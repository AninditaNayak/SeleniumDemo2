package qsp1;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	@BeforeSuite
    public void start()
	{
		Reporter.log("Start",true);
		
	}
	
    @AfterSuite
    public void end()
    {
    	Reporter.log("End",true);
    }
    
    @BeforeTest
    public void openDB()
	{
		Reporter.log("OpenDB",true);
		
	}
    
    @AfterTest
    public void closeDB()
	{
		Reporter.log("CloseDB",true);
		
	}
    
    @BeforeClass
    
    public void openApp()
	{
		Reporter.log("OpenApp",true);
		
	}
    
    @AfterClass
    public void closeApp()
	{
		Reporter.log("CloseApp",true);
		
	}
    
    @BeforeMethod
    public void login()
	{
		Reporter.log("Login",true);
		
	}
    
    @AfterMethod
    
    public void logout()
	{
		Reporter.log("Logout",true);
		
	}

   
    
  
     
}
