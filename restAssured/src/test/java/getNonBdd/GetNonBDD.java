package getNonBdd;



import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetNonBDD {
	@Test
	public void getAllEmployess() {

		RestAssured.baseURI = "https://reqres.in/api/users?page=2";
		RequestSpecification requestSpecification = RestAssured.given();
		Response response = requestSpecification.request(Method.GET);
		System.out.println(response.asString());
		System.out.println(response.statusCode());

	}

}
