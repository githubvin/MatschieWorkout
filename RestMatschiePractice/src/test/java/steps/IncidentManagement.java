package steps;

import io.cucumber.java.en.When;
import io.restassured.http.ContentType;

public class IncidentManagement extends ProjectSpecificMethods{

	
	@When("new incident is created")
	public void a_new_incident_created(){
		response = request.when().contentType(ContentType.JSON).post("incident");
		System.out.println("response: " + response.prettyPrint());
	}
	
	@When("get all incidents")
	public void get_all_incidents(){
		response = request.when().contentType(ContentType.JSON).get("incident");
		System.out.println("response: " + response.prettyPrint());
	}
	
}


