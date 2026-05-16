package Tema10.Tests;

//Exercițiul 8
//1. Fă login folosind:
//POST https://dummyjson.com/auth/login
// 2. Extrage token-ul.
// 3. Folosește token-ul pentru:
// GET https://dummyjson.com/auth/me
// Verifică:
// - status code = 200
// - username există
// - email există
//public class AuthTest {
//    @Test
//    public void loginAndAccessProtectedEndpoint() {
//
//        RestAssured.baseURI = Urls.BASE_URL;
//
//        String token = TokenUtils.getAccessToken();
//        System.out.println("ACCESS TOKEN = " + token);
//
//        given()
//                .header("Authorization", "Bearer " + token)
//                .when()
//                .get(Urls.ME)
//                .then()
//                .statusCode(200)
//                .body("username", notNullValue())
//                .body("email", notNullValue());
//    }
//}
