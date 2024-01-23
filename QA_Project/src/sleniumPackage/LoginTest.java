package sleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		
		System.setProperty("chromedriver.chrome.driver", "/Users/amal/Desktop/Amal Doc/chromedriver");
	       ChromeDriver browserObject=new ChromeDriver();
		
	    browserObject.get("https://admin-demo.nopcommerce.com/login");
	    
	        WebElement email =  browserObject.findElement(By.name("Email"));
	        
	    email.clear();
	    email.sendKeys("admin@yourstore.com");
	    
	       WebElement pass = browserObject.findElement(By.name("Password"));
	    pass.clear();
	       
	    pass.sendKeys("admin");
	    browserObject.findElement(By.className("login-button")).click();

		
	}

}
