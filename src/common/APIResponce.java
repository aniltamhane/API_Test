package common;


import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class APIResponce {
	
	public Response forGetMethod(String testURI){
		
	
		Response getRes = given()
							.when().get(testURI)
							.then().assertThat().statusCode(200).extract().response();
		
		return getRes;
	}
	
	public Response forPostMethod(String testJson, String url){
		
		
		Response getRes = given().contentType(ContentType.JSON).body(testJson)
							.when().post(url)
							.then().assertThat().statusCode(200).extract().response();
		
		
		return getRes;
	} 

}
