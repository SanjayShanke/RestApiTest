package localHostAPITest;
import static io.restassured.RestAssured.baseURI;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;


public class TestAPIDelete {
	@Test
	public void TestDeleteReq() {
		
		baseURI ="http://localhost:3000";
		
		when().
		delete("/users/55555").
		then().
		statusCode(200).
		log().all();
		
	}

}
