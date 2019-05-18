package com.thealmostengineer.seleniumtutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class Tutorial01Setup 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.gecko.driver", "/home/almostengineer/java-workspace/geckodriver");
    	
    	WebDriver driver = new FirefoxDriver();		// open the browser
    	driver.get("http://thealmostengineer.com");	// navigate to the URL
    
//    	driver.quit();
    }
}
