package common;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	
	FileInputStream file1 = new FileInputStream(System.getProperty("user.dir")+"\\properties\\projectProperties.properties");
	Properties prop1 = new Properties();
	
	public ReadProperties() throws IOException{
		
		prop1.load(file1);
		
	}
	
	public String getBaseUri(){
		
		String flipkartUrl =prop1.getProperty("BASEURI");
		return flipkartUrl;
	
	}
	
	public String testUrlGet(){
		
		String baseUrl = prop1.getProperty("testGetURL");
		return baseUrl;
		
	}

}
