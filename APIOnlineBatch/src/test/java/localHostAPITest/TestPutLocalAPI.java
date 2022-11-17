package localHostAPITest;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import java.util.HashMap;
import java.util.Map;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;

public class TestPutLocalAPI {

@Test
	public void TestAPiPutReq()
	{		
		Map<String, Object>  map = new HashMap<String, Object>();
		JSONObject request = new JSONObject();
		request.put("firstName", "Govind");
		request.put("lastName", "Sharf");	
		request.put("SubjectID", "78458");		
		System.out.println("Ready to send- body"+request.toJSONString());
		baseURI ="http://localhost:3000";
		given().header("Content-Type", "application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toJSONString()).
		when().
		put("/users/55555").then().
		statusCode(200).
		log().all();
	}
	
}
