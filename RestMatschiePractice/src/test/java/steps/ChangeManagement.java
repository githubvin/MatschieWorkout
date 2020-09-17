package steps;

import io.cucumber.java.en.When;
import io.restassured.http.ContentType;

public class ChangeManagement extends ProjectSpecificMethods{

	@When("new change is created")
	public void a_new_change_created(){
		response = request.when().contentType(ContentType.JSON).post("change_request");
		System.out.println("response: " + response.prettyPrint());
	}
	
}


