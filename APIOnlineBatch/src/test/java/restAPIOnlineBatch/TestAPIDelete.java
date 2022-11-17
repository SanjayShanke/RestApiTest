package restAPIOnlineBatch;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class TestAPIDelete {
	
	@Test
	public void TestDeleteReq() {
		
		baseURI ="https://reqres.in/";
		when().
		delete("api/users/3").
		then().
		statusCode(204).
		log().all();
		
	}

}
