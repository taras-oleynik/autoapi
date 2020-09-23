package RestAssured;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class Tests_Get {
    @Test
    public void test_1() {

        given().get("https://reqres.in/api/users?page=2").then().statusCode(200).body("data.id[1]", equalTo(8)).
                body("data.first_name",hasItems("Michael","Lindsay")).log();

    }
}
