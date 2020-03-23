package com.thealmostengineer.seleniumtutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 
 * Code covered in this file can be viewed at https://youtu.be/fg9AgEkuy9o
 * 
 * @author almostengineer
 */

public class SeleniumWithDrupal8 {
	public static void main(String args[] ) {
		
		WebDriver driver = null;
		
		try {
			System.out.println("Defining the geckodriver");
			System.setProperty("webdriver.gecko.driver", "/home/almostengineer/java-workspace/geckodriver");
	    	
			System.out.println("Opening the browser");
	    	driver = new FirefoxDriver();		// open the browser
	    	
	    	String appUrl = "http://blueprint/almostengineer/d8tutorial";
	    	System.out.println("Navigating to " + appUrl);
	    	driver.get(appUrl);	// navigate to the URL
	    	
	    	System.out.println("Logging into Drupal");
	    	driver.findElement(By.id("edit-name")).sendKeys("almostengr");
	    	
	    	WebElement passwordElement = driver.findElement(By.id("edit-pass"));
	    	
	    	passwordElement.sendKeys("almostengr");
	    	
	    	System.out.println("Submitting the form");
	    	
	    	driver.findElement(By.id("edit-submit")).click();
	    	
	    	// passwordElement.submit();
	    	
	    	/*
	    	List<WebElement> inputElements = driver.findElements(By.tagName("input"));
	    	
	    	System.out.println("Number of input elements on page " + inputElements.size());
	
	    	for (int i = 0; i < inputElements.size(); i++) {
	    		System.out.println("Element Num " + i + ": " + inputElements.get(i).getAttribute("id"));
	    	}
	    	*/
	    	
	    	/*
	    	System.out.println("Adding content via Partial link");
	    	driver.findElement(By.partialLinkText("Add content")).click();
	    	*/
	    	
	    	System.out.println("Adding content via link text");
	    	driver.findElement(By.linkText("Add content")).click();
	    	
	    	
	    	System.out.println("Filling out the add content form");
	    	driver.findElement(By.id("edit-title-0-value")).sendKeys("Third page");
	    	
//	    	System.out.println("Unclicking published");
//	    	driver.findElement(By.id("edit-status-value")).click();
	    	
	    	System.out.println("Clicking promo options");	    	
	    	driver.findElement(By.partialLinkText("Promotion options")).click();
	    	driver.findElement(By.id("edit-sticky-value")).click();
	    	
	    	System.out.println("Entering text in body");
	    	String bodyText ="Lorem Ipsum is simply dummy text of the printing and "
	    			+ "typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
	    	driver.findElement(By.id("edit-body-0-value")).sendKeys(bodyText);
	
	    	System.out.println("Clicking submit button");
	    	driver.findElement(By.id("edit-submit")).click();
	    	
	    	try {
	    		System.out.println("Waiting before proceeding");
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	    	
	    
		} // end try
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Webdriver exception occurred");
			e.printStackTrace();
		}
    	
    	System.out.println("Closing the browser");
    	// driver.close(); // closes tab
    	driver.quit(); // closes browser
	}
}
