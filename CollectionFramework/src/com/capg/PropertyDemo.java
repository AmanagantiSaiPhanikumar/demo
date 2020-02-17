package com.capg;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertyDemo {

	public static void main(String[] args) throws FileNotFoundException {
FileReader fd = new FileReader("data.properties");
		
		Properties prop=new Properties();
		
		try {
			prop.load(fd);
			String username=prop.getProperty("username");
			String password=prop.getProperty("password");
			String city=prop.getProperty("city.name");
			prop.setProperty("state", "telangana");
			System.out.println(username);
			System.out.println(password);
			System.out.println(city);
			System.out.println(prop);
			
			Enumeration e=prop.keys();
			while (e.hasMoreElements()) {
				String key = (String) e.nextElement();
				System.out.println(key+"  "+prop.getProperty(key));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
