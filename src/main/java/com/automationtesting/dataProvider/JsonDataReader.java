package com.automationtesting.dataProvider;

import com.automationtesting.managers.FileReaderManager;
import com.automationtesting.testDataTypes.Customer;
import com.google.gson.Gson;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class JsonDataReader {

	
    private final String customerFilePath =
            FileReaderManager.getInstance().getConfigReader().getTestDataResourcePath() + "Customer.json";
    private List<Customer> customerList;

    public JsonDataReader(){
        customerList = getCustomerData();
    }


    private List<Customer> getCustomerData() {
        Gson gson = new Gson();
        BufferedReader bufferReader = null;
        try {
            bufferReader = new BufferedReader(new FileReader(customerFilePath));
            Customer[] customers = gson.fromJson(bufferReader, Customer[].class);
            return Arrays.asList(customers);
        }catch(FileNotFoundException e) {
            throw new RuntimeException("Json file not found at path : " + customerFilePath);
        }finally {
            try {
                if(bufferReader != null) bufferReader.close();
            }
            catch (IOException ignore) {}
        }
    }

    public final Customer getCustomerByName(final String customerName){
        return customerList.stream().filter(new Predicate<Customer>() {
			public boolean test(Customer x) {
				return x.firstName.equalsIgnoreCase(customerName);
			}
		}).findAny().get();
    }


}
