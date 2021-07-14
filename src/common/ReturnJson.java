package common;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class ReturnJson {
	
	public JsonPath returnJson (Response res){
		
		String resString = res.asString();
		JsonPath objJson = new JsonPath(resString);
		
		return objJson;
		
	}
	
	
}
