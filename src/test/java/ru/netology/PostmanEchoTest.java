package ru.netology;


import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.*;
public class PostmanEchoTest {
    @Test
    void whenSentQueryEqualsReceived(){
        given()
                .baseUri("https://postman-echo.com")
                .body("Testing API") // отправляемые данные (заголовки и query можно выставлять аналогично)
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Testing API"))
        ;
    }
}