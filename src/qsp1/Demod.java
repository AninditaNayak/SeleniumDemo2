package qsp1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demod {
	
	static {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		System.setProperty(key, value);
	}

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.vtiger.com/");
		String v = driver.findElement(By.id("username")).getAttribute("value");
		System.out.println(v);
		if(v.length()==0) {
	    System.out.println("Pass: Text box is blank");	
		}
		else {
			System.out.println("Fail: Text box is not  blank");
			
		}
		
      driver.close();
	}

}
