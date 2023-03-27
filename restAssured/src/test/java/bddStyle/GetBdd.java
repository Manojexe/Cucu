package bddStyle;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetBdd {
	@Test
	public void getAllEmployess() {

		RestAssured.given().baseUri("http://universities.hipolabs.com/search?country=South+Africa").get().prettyPrint();

	}

}
