package api.client;

import api.dto.ArticleResponseDto;

import static io.restassured.RestAssured.given;

public class ArticleInformationClient {

    public ArticleResponseDto getAllArticles() {
        return given()
                .when()
                .get("http://rest-api-v2.playbuzz.com/v2/Items")
                .then()
                .statusCode(200)
                .extract()
                .body()
                .as(ArticleResponseDto.class);
    }
}
