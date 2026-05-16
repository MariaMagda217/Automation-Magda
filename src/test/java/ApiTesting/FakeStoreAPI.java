package ApiTesting;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.IsNull.notNullValue;

public class FakeStoreAPI {

    @Test
    public void product1Test() {
        given()
                .when()
                .get("https://fakestoreapi.com/products/1")
                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("title", notNullValue());
    }

    @Test
    public void product2Test() {
        given()
                .when()
                .get("https://fakestoreapi.com/products/2")
                .then()
                .statusCode(200)
                .body("price", greaterThan(0.0f))
                .body("category", notNullValue())
                .body("description", not(emptyOrNullString()));
    }

    @Test
    public void postProductTest() {
        String title = "\"Automation Course Product\"";
        String price = "\"99.20\" ";
        String category = "\"electronics\"";
        String payLoad = "{\n" +
                " \"title\":" + title + " , " +
                " \"price\": " + price + " , " +
                " \" description\": \"Created during API automation session\", \n" +
                " \"image\": \"https://1.pravatar.cc\", \n" +
                " \"category\": " + category + "\"\n" +
                "}";
        System.out.println(payLoad);

        given()
                .header("Content-Type", "application/json")
                .body(payLoad)
                .when()
                .post("https://fakestoreapi.com/products")
                .then()
                .statusCode(400)
                .body("title", equalTo("Automation Course Product"))
                .body("category", equalTo("electronics"));

    }

    @Test
    public void responseTimeTest() {
        given()
                .when()
                .get("https//fakestoreapi.com/products")
                .then()
                .statusCode(200)
                .time(lessThan(3000L));
    }
}
