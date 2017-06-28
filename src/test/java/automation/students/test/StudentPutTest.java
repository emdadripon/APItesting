package automation.students.test;
import org.junit.BeforeClass;
import org.junit.Test;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import automation.student.generic.Base;
import automation.student.model.Student;
import static org.hamcrest.Matchers.*;
import java.util.ArrayList;
import static com.jayway.restassured.RestAssured.*;

public class StudentPutTest extends Base{
	
	@Test
	public void createNewStudent(){
		
		ArrayList<String> courses = new ArrayList<>();
		courses.add("Java");
		courses.add("C++");
		courses.add("C#");
		
		Student student = new Student();
		student.setFirstName("Steve");
		student.setLastName("Don");
		student.setEmail("xyz@gmail.com");
		student.setProgramme("Computer Science");
		student.setCourses(courses);
		
		given()
		.contentType(ContentType.JSON)
		.when()
		.body(student)
		.put("/102")
		.then()
		.statusCode(500);
		
		
	}
	
	
}

