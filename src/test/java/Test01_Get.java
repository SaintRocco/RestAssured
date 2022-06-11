import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test01_Get {
	
	@Test
	void test_01() {
		Response res = RestAssured.get("https://reqres.in/api/users?page=2");
		
		System.out.println(res.getBody().asString());
		System.out.println("STATUS CODE: " + res.getStatusCode());
		System.out.println(res.asString());
		System.out.println(res.getStatusLine());
		System.out.println(res.getHeader("content-type"));
		System.out.println(res.getTime());
		
		int statusCode = res.getStatusCode();
		
		Assert.assertEquals(statusCode, 201);
	}
}
