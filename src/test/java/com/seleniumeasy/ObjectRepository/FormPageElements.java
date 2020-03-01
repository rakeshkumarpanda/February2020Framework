package com.seleniumeasy.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormPageElements 
{
	@FindBy(name = "first_name")
	private WebElement firstNameField;
	@FindBy(xpath = "//input[@placeholder='Last Name']")
	private WebElement lastNameField;
	@FindBy(xpath = "//label[contains(text(),'E-Mail')]/following-sibling::div//input")
	private WebElement emailField;
	@FindBy(xpath = "//label[contains(text(),'Phone')]/following-sibling::div//input")
	private WebElement phoneField;
	@FindBy(name = "state")
	private WebElement stateDropdown;
	@FindBy(xpath = "//input[@value='yes']")
	private WebElement yesRadioButton;
	@FindBy(xpath = "//a[contains(text(),'Selenium Easy')]")
	private WebElement seleniumEasyLink;
	public WebElement getFirstNameField() {
		return firstNameField;
	}
	public WebElement getLastNameField() {
		return lastNameField;
	}
	public WebElement getEmailField() {
		return emailField;
	}
	public WebElement getPhoneField() {
		return phoneField;
	}
	public WebElement getStateDropdown() {
		return stateDropdown;
	}
	public WebElement getYesRadioButton() {
		return yesRadioButton;
	}
	public WebElement getSeleniumEasyLink() {
		return seleniumEasyLink;
	}

}
