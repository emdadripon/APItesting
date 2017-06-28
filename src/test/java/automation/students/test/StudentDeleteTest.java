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

public class StudentDeleteTest  extends Base{

	@Test
	public void deleteStudent(){
		given()
		.when()
		.delete("/102")
		.then()
		.statusCode(204);
	}
}
