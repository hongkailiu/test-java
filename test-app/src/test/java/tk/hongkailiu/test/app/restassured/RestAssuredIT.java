package tk.hongkailiu.test.app.restassured;


import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

/**
 * use public rest service for tests
 * http://www.geonames.org/export/ws-overview.html
 * http://jsonplaceholder.typicode.com/
 */
public class RestAssuredIT {
    @Test public void testTrivial() {
        Assert.assertTrue(true);
    }


    @Test public void testGetCountry() {
        RestAssured.given().baseUri("http://api.geonames.org/").port(80).param("username", "demo")
            .param("country", "ca").get("/countryInfo").then().
            statusCode(200);
    }

    /**
     * status and print the response body
     */
    @Test public void testGetCountry2() {
        RestAssured.given().baseUri("http://api.geonames.org/").port(80).param("username", "demo")
            .param("country", "ca").contentType(ContentType.XML).get("/countryInfo").then()
            .assertThat().statusCode(200).contentType(ContentType.XML).log().body();
    }

    @Test public void testGetCountry3() {
        RestAssured.given().baseUri("http://api.geonames.org/").port(80).param("username", "demo")
            .param("country", "ca").contentType(ContentType.XML).get("/countryInfo").then()
            .assertThat().statusCode(200).contentType(ContentType.XML)
            .body("geonames.country.countryCode", Matchers.equalTo("CA"))
            .body("geonames.country.countryName", Matchers.equalTo("Canada"));
    }

    @Test public void testGetCountryJSON1() {
        RestAssured.given().baseUri("http://jsonplaceholder.typicode.com/").port(80).
            contentType(ContentType.JSON).get("/users").then().assertThat().statusCode(200)
            .contentType(ContentType.JSON).log().body();
    }

    @Test public void testGetCountryJSON2() {
        int id = 1;
        RestAssured.given().baseUri("http://jsonplaceholder.typicode.com/").port(80).
            contentType(ContentType.JSON).get("/users/{param1Value}", id).then().assertThat()
            .statusCode(200).contentType(ContentType.JSON)
            .body("id", Matchers.equalTo(id))
            .body("address.city", Matchers.equalTo("Gwenborough"));
    }
}
