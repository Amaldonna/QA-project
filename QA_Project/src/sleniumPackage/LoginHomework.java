package sleniumPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginHomework {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
	
		System.setProperty("chromedriver.chrome.driver", "/Users/amal/Desktop/Amal Doc/chromedriver");			
		ChromeDriver driver = new ChromeDriver();
			   
			driver.manage().window().maximize();
			driver.get("https://www.linkedin.com/home");
			   
			WebElement email = driver.findElement(By.xpath("//*[@id=\"session_key\"]"));
				  email.sendKeys("bel_amal1@hotmail.com");
			
		 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS) ;
					 
		    WebElement pass =driver.findElement(By.name("session_password"));
				  pass.sendKeys("amal243011");
				  //driver.close();
	
	}	

}
