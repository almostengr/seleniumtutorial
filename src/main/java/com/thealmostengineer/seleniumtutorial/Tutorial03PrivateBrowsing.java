package com.thealmostengineer.seleniumtutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Tutorial03PrivateBrowsing {

	public static void main(String[] args) {
    	System.setProperty("webdriver.gecko.driver", "/home/almostengineer/java-workspace/geckodriver");
    	
    	FirefoxOptions firefoxOptions = new FirefoxOptions();		// set up options for the browser
    	firefoxOptions.addArguments("-private-window");				// add command line argument to open private window
    	
    	WebDriver driver = new FirefoxDriver(firefoxOptions);			// open the browser
    	driver.get("http://thealmostengineer.com");		// navigate to the URL
	}
}
