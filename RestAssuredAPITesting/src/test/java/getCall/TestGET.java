package getCall;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestGET {
	@Test //testing GET method with positive scenario
	public void testResponseCode()
	{
		Response resp =RestAssured.get("http://localhost:3000/POSTS/");
		int code=resp.getStatusCode();
		System.out.println("status code is"+code);
		Assert.assertEquals(code,200);
		
	}

}
