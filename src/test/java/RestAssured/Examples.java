package RestAssured;

import io.restassured.http.ContentType;
import io.restassured.specification.ResponseSpecification;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Examples {


    // @Test
    public void test_get() {

        baseURI = "http://localhost:3000/";
        given().
                get("/users").then().
                statusCode(200).log().all();

    }

    //@Test
    public void test_post() {
        JSONObject request = new JSONObject();

        request.put("firstName","Janny");
        request.put("lastName","Peaterson");
        request.put("subjectId",3);

        baseURI = "http://localhost:3000/";


       given().
                contentType(ContentType.JSON).accept(ContentType.JSON).
                accept(ContentType.JSON).
                header("Content-Type", "application/json").body(request.toJSONString()).
               when().
               post("/users").then().
               statusCode(201).log().all();
    }

    //@Test
    public void test_patch() {
        JSONObject request = new JSONObject();

        request.put("lastName","Cooper");

        baseURI = "http://localhost:3000/";


        given().
                contentType(ContentType.JSON).accept(ContentType.JSON).
                accept(ContentType.JSON).
                header("Content-Type", "application/json").body(request.toJSONString()).
                when().
                patch("/users/4").then().
                statusCode(200).log().all();
    }

   // @Test
    public void test_put() {
        JSONObject request = new JSONObject();

        request.put("firstName","Marry");
        request.put("lastName","Jane");
        request.put("subjectId",3);


        baseURI = "http://localhost:3000/";


        given().
                contentType(ContentType.JSON).accept(ContentType.JSON).
                accept(ContentType.JSON).
                header("Content-Type", "application/json").body(request.toJSONString()).
                when().
                put("/users/4").then().
                statusCode(200).log().all();
    }

    @Test
    public void test_delete() {
        JSONObject request = new JSONObject();

        request.put("firstName","Marry");
        request.put("lastName","Jane");
        request.put("subjectId",3);


        baseURI = "http://localhost:3000/";


        given().
                contentType(ContentType.JSON).accept(ContentType.JSON).
                accept(ContentType.JSON).
                header("Content-Type", "application/json").body(request.toJSONString()).
                when().
                delete("/users/4").then().
                statusCode(200).log().all();
    }
}
