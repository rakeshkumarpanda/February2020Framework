package com.seleniumeasy.CommonFunctions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class CommonFunctionalities 
{
	public void clickElement(WebDriver driver, WebElement element, String elementName)
	{
		try
		{
			if(element.isDisplayed())
			{
				if(element.isEnabled())
				{
					element.click();
					Reporter.log(elementName+" is clicked");
				}
			}
		}
		catch(StaleElementReferenceException e)
		{
			driver.navigate().refresh();
			clickElement(driver, element, elementName);
		}
		catch (Exception e) {
			Reporter.log(elementName+" is not displying on UI");
		}
	}
	public void enterText(WebDriver driver, WebElement element, String text, String elementName)
	{
		try
		{
			if(element.isDisplayed())
			{
				if(element.isEnabled())
				{
					element.sendKeys(text);
					Reporter.log(elementName+" is entered with "+text);
				}
			}
		}
		catch(StaleElementReferenceException e)
		{
			driver.navigate().refresh();
			clickElement(driver, element, elementName);
		}
		catch (Exception e) {
			Reporter.log(elementName+" is not displying on UI");
		}
	}
	public void selectElement(WebDriver driver, WebElement element, String text, String elementName)
	{
		try
		{
			if(element.isDisplayed())
			{
				if(element.isEnabled())
				{
					Select sel = new Select(element);
					sel.selectByVisibleText(text);
					Reporter.log(elementName+" is selected "+text);
				}
			}
		}
		catch(StaleElementReferenceException e)
		{
			driver.navigate().refresh();
			clickElement(driver, element, elementName);
		}
		catch (Exception e) {
			Reporter.log(elementName+" is not displying on UI");
		}
	}
	public void scrollPage(WebDriver driver, WebElement element, String elementName)
	{
		try
		{
			if(element.isDisplayed())
			{
				if(element.isEnabled())
				{
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("arguments[0].scrollIntoView()", element);
					Reporter.log("Page is scrolled down until "+elementName);
				}
			}
		}
		catch(StaleElementReferenceException e)
		{
			driver.navigate().refresh();
			clickElement(driver, element, elementName);
		}
		catch (Exception e) {
			Reporter.log(elementName+" is not displying on UI");
		}
	}

}
