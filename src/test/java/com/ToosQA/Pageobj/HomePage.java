package com.ToosQA.Pageobj;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class HomePage {
	

	WebDriver driver;
	HomePage h=new HomePage();
	
	/*
	 * public HomePage(WebDriver driver) {
	 * 
	 * this.driver=driver; }
	 */
	
	 public void launchDriver() {
		 System.out.println("Launchin Chrome");
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
			 driver=new ChromeDriver();
			 driver.manage().window().maximize();
			 
			 driver.get("https://www.toolsqa.com/");
			
	 }
	
	WebElement tutorialsElmt=driver.findElement(By.className("navbar__tutorial-menu--text"));
  
	public void select_From_Navbar(String Home) {
	
	 // identify elements in menu with findElements
    List<WebElement> p = driver.findElements(By.xpath("//*[@class=\"row align-items-center flex-grow-1\" and @class=\"row align-items-center flex-grow-1\"]"));
    	
    //iterate through list
    for( WebElement i: p){
       String eleName=i.getText();
       if(eleName.equalsIgnoreCase(Home)) 
       {
    	i.click();
       }
     
    }
  }
	
	
	
	
	
	
	
	
}
	

