package services;

import static org.hamcrest.Matchers.containsString;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class IncidentTests extends BaseRequest{
	
	
	@Test
	public void getIncidents(){
		request
			.get("incident")
			.then()
			.assertThat()
			.statusCode(200)
			.body(containsString("number"),containsString("sys_id"));		
	}
	
	@Test
	public void createIncident(){
		request
		.given()
		.contentType(ContentType.JSON)
			.body(new File("./data/incident1.json"))
			.post("incident")
			.then()
			.assertThat()
			.statusCode(201)
			.body(containsString("number"),containsString("sys_id"));		
	}
}
