package Utils3Token;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class TokenUtilsNew {

    public static String getCookieToken() {

        RestAssured.baseURI = "https://dummyjson.com";

        String body = """
                {
                  "username": "kminchelle",
                  "password": "0lelplR"
                }
                """;

        Response response = given()
                .header("Content-Type", "application/json")
                .body(body)
                .when()
                .post("/auth/login")
                .then()
                .statusCode(200)
                .extract()
                .response();

        return response.getCookie("token");
    }
}