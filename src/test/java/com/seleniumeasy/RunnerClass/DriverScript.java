package com.seleniumeasy.RunnerClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.seleniumeasy.BrowserHandling.BrowserHandling;
import com.seleniumeasy.BusinessLib.BusinessFunctionalities;

public class DriverScript extends BrowserHandling
{
	BusinessFunctionalities businessFunctionality;
	@BeforeClass
	public void initClass()
	{
		businessFunctionality = new BusinessFunctionalities(driver);
	}
	
	@Test(dataProvider = "SampleFormTestData", dataProviderClass = com.seleniumeasy.DataCollection.DataCollection.class)
	public void sampleFormTest(String firstName, String lastName, String email, String phone, String state) throws InterruptedException
	{ 
		businessFunctionality.submitForm(firstName, lastName, email, phone, state);
		System.out.println("First Commit Successful");
		System.out.println("Person2 Committed");
		System.out.println("Conflict Case");
		System.out.println("Final Commit");
	}

}
