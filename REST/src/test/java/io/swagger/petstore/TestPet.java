package io.swagger.petstore;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.apache.commons.lang3.RandomStringUtils;
import org.hamcrest.Matchers;
import org.junit.Test;

public class TestPet {
    @Test
    public void petTest() {
        String idTestValue = RandomStringUtils.randomNumeric(5);
        RestAssured.given()
                .baseUri("http://petstore.swagger.io")
                .basePath("/v2/pet")
                .contentType(ContentType.JSON)
                .header("api_key", "1qa2ws3ed4rfvcxz")
                .body("{\n" +
                " \"id\": " + idTestValue + ",\n" +
                " \"name\": \"fpqlwfqp[wflqpw'f\",\n" +
                " \"photoUrls\":[],\n" +
                " \"tags\":[],\n" +
                " \"status\": \"pending\"\n" +
                "}")
                .when().put()
                .then()
                .body("id", Matchers.equalTo(Integer.valueOf(idTestValue)));

    }
}
