package com.collection.map.properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesMain {

	public static void main(String[] args) {

		Properties  prop = new Properties();
		try {
			prop.load(new FileReader("resources/config.properties")); //prop에 적재
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(prop);
		
	}

}
