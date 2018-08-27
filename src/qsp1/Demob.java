package qsp1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demob {
	
	static {
		String key="webdriver.chrome.driver";
		String value="./driver/chromedriver.exe";
		System.setProperty(key, value);
	}
		

	public static void main(String[] args) throws IOException {
				
		WebDriver driver=new ChromeDriver();
		//driver.get("C:\\Users\\annayak\\Desktop\\page3.html");
		//driver.findElement(By.xpath("/html/body/input")).sendKeys("abcde");
		//driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("ani");
		driver.get("http://demo.guru99.com/V4/");
		TakesScreenshot t =(TakesScreenshot) driver;
		
		File srcFile = t.getScreenshotAs(OutputType.FILE);
		File destFile =new File("C:\\D Drive Data\\test.png");
		FileUtils.copyFile(srcFile, destFile);
		
				
		
	}

}
