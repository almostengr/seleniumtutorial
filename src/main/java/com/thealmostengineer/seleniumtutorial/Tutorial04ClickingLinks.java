package com.thealmostengineer.seleniumtutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tutorial04ClickingLinks {

	public static void main(String[] args) {
    	System.setProperty("webdriver.gecko.driver", "/home/almostengineer/java-workspace/geckodriver");
    	
    	WebDriver driver = new FirefoxDriver();			// open the browser
    	driver.get("http://thealmostengineer.com");		// navigate to the URL

    	driver.findElement(By.linkText("Technology")).click(); // click Technology link 
    	
    	// Set Timezone on Ubuntu 18.04 Server
//    	driver.findElement(By.partialLinkText("Set Timezone on Ubuntu")).click(); // timezone article
    	driver.findElement(By.partialLinkText("Intelligent Key")).click(); // intellgent key article
    	
    	// gardening by xpath
    	driver.findElement(By.xpath("//a[@href='/category/gardening']")).click();  // click gardening
    	
    	driver.findElement(By.linkText("FAQ")).click(); // click FAQ
    	
    	driver.quit();
	}
}
