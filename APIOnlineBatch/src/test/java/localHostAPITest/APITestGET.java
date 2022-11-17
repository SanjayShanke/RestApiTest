package localHostAPITest;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;
public class APITestGET {
	@Test
	public void TestGet() {
		
		baseURI ="http://localhost:3000";
		
		given().get("/users/55555").then().statusCode(200).log().all();
		given().get("/subjects/04").then().statusCode(200).log().all();
		
	}

}
