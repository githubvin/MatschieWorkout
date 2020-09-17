package services;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class ChangeManagementTests extends BaseRequest{ 
	
	@Test
	public void getChangeRequest() { 
		request 
		.get("change_request") 
		.then()
		.assertThat()
		.statusCode(200); 

	}
	
	@Test
	public void createChangeRequest() { 
		
		File data = new File("./data/CR.json"); 
		
		request 
		.given()
		.contentType(ContentType.JSON)
		.body(data)
		.post("change_request")
		.then()
		.assertThat()
		.statusCode(201); 
		
	}

}
