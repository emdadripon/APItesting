package automation.students.test;

import org.junit.BeforeClass;
import org.junit.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.response.Response;

import automation.student.generic.Base;

import static org.hamcrest.Matchers.*;
import static com.jayway.restassured.RestAssured.*;
public class StudentGetTest extends Base{

	@Test
	public void getAllStudentInformation(){
	/**
	 * given()
	 * set cookies,add auth,adding parameters,setting header info
	 * .when()
	 * GET,POST,PUT,DELETE..etc
	 * .then()
	 * Validate status code,extract response, extract headers, cookies,extract the response info
	 */
		
		Response response = given()
		.when()
		.get("/list");
		//System.out.println(response.body().prettyPrint());
		
		//Validate the status code
		given()
		.when()
		.get("/list")
		.then()
		.statusCode(200);
		
	}
		@Test
		public void getStudentInfo(){
			Response response = given()
			.when()
			.get("/1");
			//System.out.println(response.body().prettyPrint());
		}
		
		@Test
		public void getStudentFromFA(){
			Response response = given()
			.when()
			.get("/list?programme=Financial Analysis&limit=2");
			
			//System.out.println(response.prettyPeek());
			
			Response responseTwo = given()
			.param("programme", "Financial Analysis")
			.param("limit", 2)
			.when()
			.get("/list");
			System.out.println(responseTwo.prettyPeek());
		}
		
	}

