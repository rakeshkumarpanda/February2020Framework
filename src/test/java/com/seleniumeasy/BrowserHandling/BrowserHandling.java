package com.seleniumeasy.BrowserHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BrowserHandling 
{
	public WebDriver driver;
	
	@Parameters("browser")
	@BeforeTest
	public void browserLaunching(String browser)
	{
		// Browser Launching
		if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", ".\\BrowserServers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", ".\\BrowserServers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browser.equals("headless"))
		{
			System.setProperty("webdriver.chrome.driver", ".\\BrowserServers\\chromedriver.exe");
			ChromeOptions option = new ChromeOptions();
			option.setHeadless(true);
			driver = new ChromeDriver(option);
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.seleniumeasy.com/");
	}
	
	@AfterTest
	public void browserTearDown() throws InterruptedException
	{
		// Tear Down the browser
		Thread.sleep(5000);
		driver.quit();
	}

}
