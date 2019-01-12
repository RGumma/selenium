package restassured;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static org.hamcrest.CoreMatchers.equalTo;

import static com.jayway.restassured.RestAssured.given;

public class Googleapiplaceadd {

	public static void main(String[] args) {
		
		
		RestAssured.baseURI="https://maps.googleapis.com";
		Response res=given().
		
		param("Key", "AIzaSyB7WVZajEGu4AVus1sIBKn9WoHGXEW1DHg").
		
		body("{"+
 " \"location\": {"+
   " \"lat\": -33.8669710,"+
    "\"lng\": 151.1958750"+
  "},"+
  "\"accuracy\": 50,"+
  "\"name\": \"Google Shoes!\","+
  "\"phone_number\": \"(02) 9374 4000\","+
  "\"address\": \"48 Pirrama Road, Pyrmont, NSW 2009, Australia\","+

  "\"types\": [\"shoe_store\"],"+
 " \"website\": \"http://www.google.com.au/\","+
  "\"language\": \"en-AU\""+
"}").
		
	when().
	post("/maps/api/place/add/json");
	//then().assertThat().statusCode(200).and().contentType(ContentType.JSON).
	
	String resstr=res.getBody().asString();
	
	System.out.println(resstr);
	
	
  
	
	 
	
	
	
	
		
		
		
		

	}

}
