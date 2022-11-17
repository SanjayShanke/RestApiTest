package restAPIOnlineBatch;

import java.util.HashMap;
import java.util.Map;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;

public class TestPutAPI {
	
	@Test
	
	public void TestAPiPutReq()
	{
		//Put End Point- https://reqres.in/api/users/2		
		Map<String, Object>  map = new HashMap<String, Object>();
		JSONObject request = new JSONObject();
		request.put("name", "S Patil");
		request.put("job", "Senoir QA Engineer");
		request.put("email", "Spatil@gmail.com");
		System.out.println("Ready to send- body"+request.toJSONString());
		baseURI ="https://reqres.in/api";
		given().header("Content-Type", "application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toJSONString()).
		when().
		put("/users/3").then().
		statusCode(200).
		log().all();
	}
	
}
