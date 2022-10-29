package com.ToosQA.Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample {
	
	
	static WebDriver driver;
	
	@Test
	public void m1() {
		
		System.out.println("method m2");
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.youtube.com/");
		 
		 driver.close();
		}
	}
	


