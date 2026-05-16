package Tema10;

import Tema10.Config.Urls;
import Tema10.Utils.TokenUtils;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNull.notNullValue;

public class FakeStoreApi {
    //Ex:1
    @Test
    public void statusCode() {
        given()
                .when()
                .get("https://fakestoreapi.com/products/1")
                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("title", notNullValue())
                .body("price", greaterThan(0.0f));
    }

    //Ex:2

    @Test
    public void listNotEmpty() {

        RestAssured.baseURI = "https://fakestoreapi.com";
        given()
                .when()
                .get("/products")
                .then()
                .statusCode(200)
                .body("$", not(empty()))
                .body("[0].title", notNullValue())
                .body("[0].category", notNullValue())
                .body("[0].image", notNullValue());
    }

    //Ex:3
    // POST https://fakestoreapi.com/product Folosește
    // body personalizat Verifică:
    // - status code = 200
    // - title este corect
    // - category este corect

    @Test
    public void personalizedBody() {
        String headerName = "Content-Type";
        String headerValue = "application/json";
        String path = "https://fakestoreapi.com/products";
        String title = "Magda Has Apples";
        String price = "78.50";
        String category = "Fruits";
        String payLoad = """
                {
                  "title": "%s",
                  "price": "%s",
                  "category": "%s",
                  "image": "https://media.self.com/photos/5b6b0b0cbb7f036f7f5cbcfa/1:1/w_3089,h_3089,c_limit/apples.jpg",
                  "description": "Fruits"
                  }
                """.formatted(title, price, category);
        System.out.println(payLoad);
        given()
                .header(headerName, headerValue)
                .body(payLoad)
                .when()
                .post(path)
                .then()
                .statusCode(201)
                .body("title", equalTo(title))
                .body("category", equalTo(category));
    }

    //Ex:4
    @Test
    public void limitListTest() {
        given()
                .queryParam("limit", 5)
                .when()
                .get("https://dummyjson.com/products")
                .then()
                .statusCode(200)
                .body("limit", equalTo(5));
    }

    //Ex:5
    @Test
    public void listNotEmptyHasPriceAndTitle() {
        given()
                .when()
                .get("https://dummyjson.com/products")
                .then()
                .statusCode(200)
                .body("products", not(empty()))
                .body("products[0].title", notNullValue())
                .body("products[0].price", notNullValue());
    }

    //Ex:6
    @Test
    public void headerResponse() {
        String headerValue = "API Automation";
        String headerName = "Course-Name";

        given()
                .header(headerName, headerValue)
                .when()
                .get("https://httpbin.org/headers")
                .then()
                .statusCode(200)
                .body("headers." + headerName, equalTo(headerValue));
    }

    //Ex:7
    @Test
    public void basicAuth() {
        given()
                .auth()
                .basic("user", "passwd")
                .when()
                .get("https://httpbin.org/basic-auth/user/passwd")
                .then()
                .statusCode(200)
                .body("authenticated", equalTo(true))
                .body("user", equalTo("user"));
    }

    //Ex:8
    @Test
    public void loginAndAccessProtectedEndpoint() {

        RestAssured.baseURI = Urls.BASE_URL;

        String token = TokenUtils.getAccessToken();
        System.out.println("ACCESS TOKEN = " + token);

        given()
                .header("Authorization", "Bearer " + token)
                .when()
                .get(Urls.ME)
                .then()
                .statusCode(200)
                .body("username", Matchers.notNullValue())
                .body("email", Matchers.notNullValue());
    }
    //Ex:9 Pachete

    //Ex:10
    @Test
    public void invalidEndPoint() {
        given()
                .when()
                .get("https://dummyjson.com/prod")
                .then()
                .statusCode(404);
    }

    @Test
    public void missingItem() {
        given()
                .queryParam("q", "cars")
                .when()
                .get("https://dummyjson.com/products/search")
                .then()
                .statusCode(200)
                .body("products", empty());
    }

    @Test
    public void invalidCredentials() {

        RestAssured.defaultParser = Parser.JSON;
        given()
                .auth().preemptive().basic("Magda", "Ceva")
                .when()
                .get("https://httpbin.org/basic-auth/user/passwd")
                .then()
                .statusCode(401);
    }

    @Test
    public void invalidToken() {

        RestAssured.baseURI = Urls.BASE_URL;
        String invalidToken = "abc.def.ghi";

        given()
                .header("Authorization", "Bearer " + invalidToken)
                .when()
                .get(Urls.ME)
                .then()
                .statusCode(500)
                .body("message", notNullValue());
    }
}


