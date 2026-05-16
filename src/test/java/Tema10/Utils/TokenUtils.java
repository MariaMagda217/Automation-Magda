package Tema10.Utils;


import Tema10.Config.Urls;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class TokenUtils {

    public static String getAccessToken() {

        RestAssured.baseURI = Urls.BASE_URL;

        String body = """
                {
                  "username": "emilys",
                  "password": "emilyspass"
                }
                """;

        Response response = given()
                .header("Content-Type", "application/json")
                .body(body)
                .when()
                .post(Urls.LOGIN)
                .then()
                .statusCode(200)
                .extract()
                .response();

        return response.jsonPath().getString("accessToken");
    }
}