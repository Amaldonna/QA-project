package sleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("chromedriver.chrome.driver", "/Users/amal/Desktop/Amal Doc/chromedriver");		
		
		// 2. Initialize Webdriver object through ChromeDriver class.
       		ChromeDriver browserObject = new ChromeDriver();
		// 3. Open the form page http://training.qaonlinetraining.com/testPage.php
	        browserObject.get("http://training.qaonlinetraining.com/testPage.php");
	        browserObject.findElement(By.xpath("/html/body/form/input[4]")).click();
	        browserObject.findElement(By.xpath("/html/body/form/input[5]")).click();
	
	
	}
	

}
