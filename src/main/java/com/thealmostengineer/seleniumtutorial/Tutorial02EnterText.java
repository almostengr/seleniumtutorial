package com.thealmostengineer.seleniumtutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tutorial02EnterText {

	public static void main(String[] args) {
    	System.setProperty("webdriver.gecko.driver", "/home/almostengineer/java-workspace/geckodriver");
    	
    	WebDriver driver = new FirefoxDriver();			// open the browser
    	driver.get("http://thealmostengineer.com");		// navigate to the URL
    	
    	driver.findElement(By.name("search_block_form")).sendKeys("garden");	// enter the text in search box
    	driver.findElement(By.name("search_block_form")).submit();				// submit the form
	}
}
