package ru.rest.controllers;


import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.omg.CORBA.Request;
import ru.rest.model.RestModel;

import static io.restassured.RestAssured.given;

public class RestCtrl {

    public RestCtrl() {
         RestAssured.requestSpecification = new RequestSpecBuilder()
                .addHeader("api_key", "1qa2ws3ed4rfvcxz")
                .setBaseUri("http://petstore.swagger.io")
                .setBasePath("/v2/pet")
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL).build();
    }

    public RestModel addnewPet(RestModel pet) {
        return given()
                .body(pet)
                .when()
                .post()
                .as(RestModel.class);
    }
}
