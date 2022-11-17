package localHostAPITest;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
public class TestAPIPatch {	
	@Test
	public void  TestPatch()
	 {	
		JSONObject request = new JSONObject();
		request.put("lastName", "Devgan");	
		System.out.println("Ready to send- body"+request.toJSONString());
		baseURI ="http://localhost:3000";
		given().header("Content-Type", "application/json").
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toJSONString()).
		when().
		patch("/users/55555").then().
		statusCode(200).
		log().all();	
		
	 }

}
