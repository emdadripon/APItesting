package automation.student.generic;

import org.junit.BeforeClass;

import com.jayway.restassured.RestAssured;

public class Base {
	@BeforeClass
	public static void init(){
		RestAssured.baseURI="http://localhost";
		RestAssured.port = 9090;
		RestAssured.basePath="/student";
	}
}
