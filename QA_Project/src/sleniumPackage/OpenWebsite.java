package sleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWebsite {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		// 2. Initialize Webdriver object through ChromeDriver class. 
		System.setProperty("webdriver.chrome.driver", "/Users/amal/Desktop/Amal Doc/chromedriver" );
       ChromeDriver browserObject = new ChromeDriver();
	// 3. Open the http://www.amazon.com/ link using get method.
       
        browserObject.get("http://www.training.qaonlinetraining.com/testPage.php");
        browserObject.findElement(By.name("name")).sendKeys("Amal");
        browserObject.findElement(By.name("email")).sendKeys("amal@gmail.com");
        browserObject.findElement(By.name("website")).sendKeys("www.itlearn.com");
        browserObject.findElement(By.name("comment")).sendKeys("This is a good try");
        browserObject.findElement(By.name("submit")).click();
     
	// browserObject.close();

}
}
