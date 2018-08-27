package qsp1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoa {
	
	static {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		System.setProperty(key, value);
				
		}

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("C:\\Users\\annayak\\Desktop\\page1.html");
		 driver.findElement(By.tagName("input")).sendKeys("Ani");
		 String s = "input[type='password']";
		 driver.findElement(By.cssSelector(s)).sendKeys("qsp");

		
	}

}
