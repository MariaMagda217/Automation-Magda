package Utils2;

import static io.restassured.RestAssured.given;

public class TokenUtils {

    public static String getAccesToken(String username, String password) {

        return given()
                .header("Content-Type", "application/json")
                .body("{\"username\":\"" + username + "\", \"password\":\"" + password + "\"}")
                .when()
                .post("https://dummyjson.com/auth/login")
                .then()
                .extract()
                .path("accessToken");
    }
}

