package com.seleniumeasy.BusinessLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.seleniumeasy.CommonFunctions.CommonFunctionalities;
import com.seleniumeasy.ObjectRepository.FormPageElements;
import com.seleniumeasy.ObjectRepository.HomePageElements;
import com.seleniumeasy.ObjectRepository.LandingPageElements;

public class BusinessFunctionalities extends CommonFunctionalities
{
	private WebDriver driver;
	LandingPageElements landingPageElements;
	HomePageElements homePageElements;
	FormPageElements formPageElements;
	public BusinessFunctionalities(WebDriver driver)
	{
		this.driver=driver;
		landingPageElements = PageFactory.initElements(this.driver, LandingPageElements.class);
		homePageElements = PageFactory.initElements(this.driver, HomePageElements.class);
		formPageElements = PageFactory.initElements(this.driver, FormPageElements.class);
	}
	
	
	
	public void submitForm(String firstName, String lastName, String email, String phone, String state) throws InterruptedException
	{
		// Landing Page Element Actions
//		driver.findElement(By.linkText("Demo Website!")).click();
//		landingPageElements.getDemowebsiteLink().click();
		clickElement(driver, landingPageElements.getDemowebsiteLink(), "Demo Website Link");

		// Home Page Element Actions
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//li[@class='dropdown']/a[contains(text(),'Input Forms')]")).click();
//		driver.findElement(By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Input Form Submit')]")).click();
//		homePageElements.getInputFormTab().click();
//		homePageElements.getInputFormSubmitLink().click();
		clickElement(driver, homePageElements.getInputFormTab(), "Input Form Tab");
		clickElement(driver, homePageElements.getInputFormSubmitLink(), "Input Form Submit Link");
		
		
		//Form Page Element Actions
//		driver.findElement(By.name("first_name")).sendKeys(firstName);
//		formPageElements.getFirstNameField().sendKeys(firstName);
		enterText(driver, formPageElements.getFirstNameField(), firstName, "First Name Field");
//		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lastName);
//		formPageElements.getLastNameField().sendKeys(lastName);
		enterText(driver, formPageElements.getLastNameField(), lastName, "Last Name Field");
//		driver.findElement(By.xpath("//label[contains(text(),'E-Mail')]/following-sibling::div//input"))
//				.sendKeys(email);
//		formPageElements.getEmailField().sendKeys(email);
		enterText(driver, formPageElements.getEmailField(), email, "Email Field");
//		driver.findElement(By.xpath("//label[contains(text(),'Phone')]/following-sibling::div//input")).sendKeys(phone);
		formPageElements.getPhoneField().sendKeys(phone);
		enterText(driver, formPageElements.getPhoneField(), phone, "Phone number Field");
//		WebElement stateDropdown = driver.findElement(By.name("state"));
//		Select sel = new Select(formPageElements.getStateDropdown());
//		sel.selectByVisibleText(state);
		selectElement(driver, formPageElements.getStateDropdown(), state, "State Dropdown");

//		WebElement yesRadioButton = driver.findElement(By.xpath("//input[@value='yes']"));
//		WebElement yesRadioButton = formPageElements.getYesRadioButton();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView()", yesRadioButton);
//		yesRadioButton.click();
		scrollPage(driver, formPageElements.getYesRadioButton(), "Yes Radio Button");
		clickElement(driver, formPageElements.getYesRadioButton(), "Yes Radio Button");
//		driver.findElement(By.xpath("//a[contains(text(),'Selenium Easy')]")).click();
//		formPageElements.getSeleniumEasyLink().click();
		clickElement(driver, formPageElements.getSeleniumEasyLink(), "Selenium Easy Link");
	}

}
