package com.seleniumeasy.ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPageElements 
{
	@FindBy(linkText = "Demo Website!")
	private WebElement demowebsiteLink;

	public WebElement getDemowebsiteLink() {
		return demowebsiteLink;
	}

}
