package RestAssured;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Tests_Post {
    @Test
    public void test_1_post() {


        JSONObject request = new JSONObject();
        request.put("name", "Kean");
        request.put("job", "Teacher");
        System.out.println(request.toJSONString());

        given().
                 body(request.toJSONString()).
                when().post("https://reqres.in/api/users").
                then().statusCode(201);
    }
}
