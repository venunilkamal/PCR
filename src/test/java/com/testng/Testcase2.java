package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testcase2 {
	
	public static WebDriver driver;
	@Parameters("Browser")
	@BeforeTest
	public void beforetestcase1(String  Browser){
		
		if (Browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./src/test/resources/Drivers/geckodriver.exe");
			driver = new FirefoxDriver();	
			
		}
		
		if (Browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/Drivers/chromedriver.exe");
			driver = new ChromeDriver();	
		}
		
		if (Browser.equalsIgnoreCase("IE")) {
			System.out.println("IE started");
			System.setProperty("webdriver.ie.driver", "./src/test/resources/Drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();	
		}
		
	}
	@Test
	public void testcase1()
	{
		
		driver.get("https://google.co.in");
		System.out.println("executed testcase1");
	}
	
	@Test
	public void testcase2()
	{
		driver.findElement(By.name("q")).sendKeys("everyone");
		driver.findElement(By.name("btnG")).click();
		System.out.println("executed testcase2");
	}
	
	@AfterTest
	public void endtest(){
		driver.quit();
	}

}
