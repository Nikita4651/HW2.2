package ru.netology.rest;



import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.given;



class PostmanEchoTest {


    @Test
            void test1() {
// Given - When - Then
// Предусловия
        given()
                .baseUri("https://postman-echo.com")
                .body("some data") // отправляемые данные (заголовки и query можно выставлять аналогично)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body("data", equalTo("some value"))
        ;
    }
}
