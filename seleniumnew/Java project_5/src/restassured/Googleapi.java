package restassured;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;
import static org.hamcrest.CoreMatchers.equalTo;
import static com.jayway.restassured.RestAssured.given;



public class Googleapi {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://maps.googleapis.com/";

		Response response = given().

				param("location", "-33.8670,151.1957").
				param("radius", "500").
				param("key", "AIzaSyAnAuXjpn_LP0efLFUJatHAULzRf-PPL8Y").
				when().get("/maps/api/place/nearbysearch/json");
		String responseStr = response.getBody().asString();
		
		  System.out.println(responseStr);
		
		 JsonPath js = new JsonPath(responseStr);
		 
		 String placeid= js.get("results[0].place_id");
		 
		 System.out.println(placeid);
				
		 response.then().assertThat().contentType(ContentType.JSON).and().statusCode(200).and().
				body("results[0].geometry.location.lat", equalTo("-33.8688197")).and()
				.body("results[0].place_id", equalTo("ChIJP3Sa8ziYEmsRUKgyFmh9AQM"));
		       
				
      
      
		

	}

}
