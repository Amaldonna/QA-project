package sleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglSerch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// 2. Initialize Webdriver object through ChromeDriver class. 
			System.setProperty("webdriver.chrome.driver", "/Users/amal/Desktop/Amal Doc/chromedriver" );
	       ChromeDriver browserObject = new ChromeDriver();
		// 3. Open the http://www.amazon.com/ link using get method.
	       
	        browserObject.get("http://www.google.com");
	       browserObject.findElement(By.name("q")).sendKeys("The best elearn");
	       browserObject.findElement(By.name("btnK")).submit();
	}	       
}
