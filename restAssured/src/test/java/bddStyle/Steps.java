package bddStyle;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Steps {
	
	 Response response;
	   
	    @Given("^the valid endpoint to fetch users$")
	    public void setupEndpoint()
	    {
	  RestAssured.baseURI="https://reqres.in/";
	    RestAssured.basePath="/api/users";
	    }

	    @When("^the request is send to server with page number as \"([^\"]*)\"$")
	    public void sendRequest(int pageNumber)
	    {
	 RestAssured.given().
	    queryParam("page",pageNumber).
	    when().
	    get().
	    then().
	    contentType(ContentType.JSON).
	    extract().response();  
	    }
			   
	    @Then("^validate the response of first user record having email as \"([^\"]*)\"$")
	    public void validateUserData(String emailID)
	    {
	  String userEmail = response.path("data[0].email");
	  Assert.assertEquals(userEmail, emailID);  
	    }

	}
