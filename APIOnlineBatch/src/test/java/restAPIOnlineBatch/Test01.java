package restAPIOnlineBatch;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class Test01 {

	@Test	
	public void TestgetAPI()
	{
		// Get Response 	
		Response response = get("https://reqres.in/api/users?page=2");
		response.getStatusCode();
		response.getTime();
		response.getStatusLine();
		response.contentType();	
		System.out.println("Captured Status Code is:- "+response.getStatusCode());
		System.out.println("Captured Time is:- "+response.getTime());
		System.out.println("Captured Status Line:- "+response.getStatusLine());
		System.out.println("Captured content Type is :-  "+response.contentType());		
		// Validation	
		int StatusCode = response.getStatusCode();	
		Assert.assertEquals(StatusCode, 200);
		Assert.assertEquals(StatusCode, 200,"Test Case Passed");		
	}
	
	@Test	
	public void TestgetAPI01()
	{
		// Single line code 		
		given().
		get("https://reqres.in/api/users?page=2").
		then().
		statusCode(200)
		.body("data[3].id", equalTo(10))
		.body("data[3].first_name", equalTo("Byron"))
		.body("data[3].email", equalTo("byron.fields@reqres.in"))
		.body("data[3].last_name", equalTo("Fields"))
		.body("data[5].id", equalTo(12))
		.body("data[5].first_name", equalTo("Rachel"))
		.body("data[5].email", equalTo("rachel.howell@reqres.in"))
		.body("data[5].last_name", equalTo("Howell"))
		
		.body("data[2].id", equalTo(9))
		.body("data[2].first_name", equalTo("Tobias"))
		.body("data[2].email", equalTo("tobias.funke@reqres.in"))
		.body("data[2].last_name", equalTo("Funke"))
		
		.log().all();
		
	}
	
}
