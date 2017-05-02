package com.testng;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class class4 {
	
	public static void main(String[] args) throws Exception {
		String downloadFilepath = "/path/to/download";
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/Drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
	     options.addArguments("--disable-extensions");
	     options.addArguments("--disable-notifications");
	     options.addArguments("--start-maximized");
	     options.addArguments("--disable-web-security");
	     options.addArguments("--no-proxy-server");
	     options.addArguments("--enable-automation");
	     options.addArguments("--disable-save-password-bubble");
		
	     Map<String, Object> prefs = new HashMap<String, Object>();
	     prefs.put("credentials_enable_service", false);
	     prefs.put("profile.password_manager_enabled", false);
	     prefs.put("profile.default_content_settings.popups", 0);
	     prefs.put("download.default_directory", downloadFilepath);
	     options.setExperimentalOption("prefs", prefs);
		WebDriver driver = new ChromeDriver(options);
		
		
		driver.get("https://www.google.com/intl/en_in/gmail/about/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/nav/div/a[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("venunilkamal");
		Thread.sleep(2000);
		driver.findElement(By.id("next")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("Passwd")).sendKeys("VENUgopal@143");
		Thread.sleep(3000);
		driver.findElement(By.id("signIn")).click();
		
		Thread.sleep(5000);
		
	}

}
