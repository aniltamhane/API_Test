package testCases;

import java.io.IOException;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import utilities.Utils;
import common.APIResponce;
import common.ReadProperties;
import common.ReturnJson;

public class TestGetResponse {

	APIResponce objRes;
	ReadProperties objProp;
	ReturnJson objReturn;
	String key;
	Utils objUtils;
	String type;
	String link;
	String activity;
	Integer participants;
	Float price;
	Float accessibility;
	
	@Test(priority =1)
	public void testGet() throws IOException, ParseException,ClassCastException{
	
		objRes = new APIResponce();
		objReturn = new ReturnJson();
		objProp = new ReadProperties();
			
		RestAssured.baseURI = objProp.getBaseUri();	
		Response getResponce = objRes.forGetMethod(objProp.testUrlGet());
	
		activity = objReturn.returnJson(getResponce).get("activity");
		type = objReturn.returnJson(getResponce).get("type");
		participants = objReturn.returnJson(getResponce).get("participants");
		
		try{
				price = objReturn.returnJson(getResponce).get("price");
				accessibility = objReturn.returnJson(getResponce).get("accessibility");
				
		}
		catch (ClassCastException e){
			
			e.getMessage();

		}
		
		
		link = objReturn.returnJson(getResponce).get("link");
		key = objReturn.returnJson(getResponce).get("key");
						
				
	}
	
	@Test(priority =2)
	public void verifyActivity() {
		
		if(key.equals("Learn Morse code")){
			
			System.out.println("Verify Activity PASS");
		}
		
		else{
			System.out.println("FAIL. Actual value of activity is : " + activity);
		}
		
	
	}
	
	@Test(priority =3)
	public void verifyType() {
		
		if(key.equals("education")){
			
			System.out.println("VerifyType PASS");
		}
		
		else{
			System.out.println("FAIL. Actual value of type is : " + type);
		}
		
	
	}
		
	@Test(priority =4)
	public void verifyParticipants() {
		
		if(participants.equals(1)){
			
			System.out.println("VerifyParticipants PASS");
		}
		
		else{
			System.out.println("FAIL. Actual value of participants is : " + participants);
		}
		
	
	}
	
	@Test(priority =5)
	public void verifyPrice() {
		
		if(price==null){
			
			System.out.println("Price is NULL");
			
		}
		
		else {
			
			if(price==1){
			
			System.out.println("verifyPrice PASS");
			}
		
		else {
				System.out.println("FAIL. Actual value of Price is : " + price);
			}
		}
				
	
	}
	
	@Test(priority =6)
	public void verifyLink() {
		
		if(key.equals("https://en.wikipedia.org/wiki/Morse_code")){
			
			System.out.println("VerifyLink PASS");
		}
		
		else{
			System.out.println("FAIL. Actual value of Link is : " + link);
		}
		
	
	}
	
	@Test(priority =7)
	public void verifyKey() {
		
		if(key.equals("3646173")){
			
			System.out.println("VerifyKey PASS");
		}
		
		else{
			System.out.println("FAIL. Actual value of Key is : " + key);
		}
		
	
	}	
	
	@Test(priority =8)
	public void verifyAccessibility() {
		
		
		if(accessibility==null){
			
			System.out.println("Accessibility is NULL");
			
		}
		
		else {
					
			if(accessibility==1){
				
				System.out.println("VerifyAccessibility PASS");
			}
			
			else{
				System.out.println("FAIL. Actual value of Accessibility is : " + accessibility);
			}
		
		}		
			
	}	
			
}
