package com.automationtesting.managers;

import com.automationtesting.baseClass.BaseClass;
import com.automationtesting.cucumber.TestContext;
import com.automationtesting.dataProvider.ConfigFileReader;
import com.automationtesting.dataProvider.JsonDataReader;

public class Temp extends BaseClass{
	
	public static void main(String[] args) {
	
		FileReaderManager fileReaderManager = FileReaderManager.getInstance();
		ConfigFileReader f = fileReaderManager.getConfigReader();
		
	//	JsonDataReader jsonReader = fileReaderManager..getJsonReader();
		System.out.println(f.getDriverPath());
		//.getCustomerByName("f.getDriverPath();");
		//System.out.println(jsonReader.getCustomerByName("Lakshay").phoneNumber.home);

	}

}
