package postRequest;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestPost {

	@Test
	public void testpost()
	{
		RequestSpecification request = RestAssured.given();
				request.header("Content-Type","application/json");
		JSONObject json = new JSONObject();
		json.put("id", "7");
		json.put("name","jay");
		json.put("address","mumbai");
		json.put("status","active");
		json.put("mobile","7654312345");
		request.body(json.toJSONString());
		Response response = request.post("http://localhost:3000/POSTS");
		int code = response.getStatusCode();
		Assert.assertEquals(code,201);	
	}
	
	
}
