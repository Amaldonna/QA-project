package sleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumProject {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("chromedriver.chrome.driver", "/Users/amal/Desktop/Amal Doc/chromedriver");			
		ChromeDriver driver = new ChromeDriver();
		
	    driver.get("http://training.qaonlinetraining.com/testPage.php");
	        
	        WebElement Name =driver.findElement(By.name("name"));
			  Name.sendKeys("Amal");
			
			WebElement Email=driver.findElement(By.name("email"));
			  Email.sendKeys("bel_amal1@hotmail.com");
			  
	        WebElement checkboxFemale = driver.findElement(By.xpath("/html/body/form/input[4]"));

	        WebElement checkboxBoat = driver.findElement(By.xpath("//input[@value='boat']"));
	    		
	        WebElement checkboxCar = driver.findElement(By.xpath("//input[@value='car']")); 
	          	            
	         Thread.sleep(9000);
	         checkboxFemale.click();
	         
	         Thread.sleep(9000);
	         checkboxBoat.click();
	         
	         Thread.sleep(9000);
	         checkboxCar.click();
	     
	         Select countrySelect = new Select(driver.findElement(By.name("country")));
	         
	            countrySelect.selectByVisibleText("Ethiopia");      
	            Thread.sleep(9000);
	            
	            Select skillSelect = new Select(driver.findElement(By.name("skill")));
	            
	            skillSelect.selectByVisibleText("Management");
	            	            
	            driver.findElement(By.name("submit")).click();
	          
	            //driver.close();
	}
}