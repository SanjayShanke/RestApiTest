package localHostAPITest;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
public class TestPostLocal {
	//
	@Test
	public void TestPostReq() {
		
		JSONObject request = new JSONObject();
		request.put("firstName", "ASIf");
		request.put("lastName", "Shaikh");	
		request.put("SubjectID", "32656");
		request.put("id", "9999");
		baseURI ="http://localhost:3000";	
		given().
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toJSONString()).
		when().
		post("/users").
		then().
		statusCode(201).
		log().all();		
	}
	
	@Test
public void TestPostReqSub() {
		
		JSONObject request = new JSONObject();
		request.put("name", "C++");
		request.put("id", "04");		
		baseURI ="http://localhost:3000";	
		given().
		contentType(ContentType.JSON).
		accept(ContentType.JSON).
		body(request.toJSONString()).
		when().
		post("/subjects").
		then().
		statusCode(201).
		log().all();
		
	}
	

}
