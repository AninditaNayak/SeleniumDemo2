package qsp1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Democ {

	static {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		System.setProperty(key, value);
	}
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com/");
		//String tag = driver.findElement(By.id("hplogo")).getTagName();
		
		driver.get("https://demo.actitime.com");
		//String tag = driver.findElement(By.x("hplogo")).getTagName();
		String tag = driver.findElement(By.xpath("//img[@width='98']")).getTagName();
		if(tag.equals("img"))
		{
			System.out.println("Pass: Logo is an image");
		}
		else {
			System.out.println("Fail: Logo is not an image");
		}
		
     driver.close();
	}

}
