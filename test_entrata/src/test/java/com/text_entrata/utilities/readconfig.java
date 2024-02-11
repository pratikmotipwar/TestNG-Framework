package com.text_entrata.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class readconfig {

	
public Properties p;
public String value;
public String value1;

	
	public String path = "G:\\Programs\\LogicalPrograms\\test_entrata\\configfile\\config.properties";
	//constructor
	//G:\Programs\LogicalPrograms\test_entrata\configfile
	
	public readconfig()  {
		
		
		
			try {
				
				FileInputStream fis = new FileInputStream(path);
				p = new Properties();
				p.load(fis);
				 value=p.getProperty("baseurl");
				 System.out.println(value);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
	}
	
	public String getBaseUrl() {
//	 value=p.getProperty("baseurl");
//	 System.out.println(value);
		
		if(value!=null)
			return value;
		else 
			throw new RuntimeException("Url not specified in confog file.");
	}
	public String getBrowser() {
		 value1=p.getProperty("browser");
			
			if(value1!=null)
				return value1;
			else 
				throw new RuntimeException("Browser not specified in confog file.");
		}
	
	

}
