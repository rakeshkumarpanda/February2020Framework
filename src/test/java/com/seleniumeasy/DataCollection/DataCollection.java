package com.seleniumeasy.DataCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.DataProvider;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class DataCollection 
{
	String excelPath = "./TestData/TestDataSheet.xlsx";
	Fillo fillo;
	Connection connection;
	
	public DataCollection() throws FilloException
	{
		fillo = new Fillo();
		connection = fillo.getConnection(excelPath);
	}
	
	@DataProvider(name = "SampleFormTestData")
	public Iterator<String[]> dataCollectionSampleFormTest() throws FilloException
	{
		List<String[]> lst = new ArrayList<String[]>();
		String query = "select firstname, lastname, email, phone, state from sheet1 where flag='Y' and scenario='SubmitForm'";
		try {
			Recordset rs = connection.executeQuery(query);
			if(rs!=null)
			{
				while(rs.next())
				{
					String[] str = new String[5];
					str[0] = rs.getField("firstname");
					str[1] = rs.getField("lastname");
					str[2] = rs.getField("email");
					str[3] = rs.getField("phone");
					str[4] = rs.getField("state");
					lst.add(str);
				}
			}	
		}catch(Exception e) {
			e.printStackTrace();
		}
		return lst.iterator();	
	}
}
