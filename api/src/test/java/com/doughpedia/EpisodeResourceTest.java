package com.doughpedia;

import com.doughpedia.utils.CockroachDBResource;
import io.quarkus.test.common.QuarkusTestResource;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
@QuarkusTestResource(CockroachDBResource.class)
public class EpisodeResourceTest {

    @Test
    public void testEpisodesEndpoint() {
        given()
          .when().get("/episodes")
          .then()
             .statusCode(200)
             .body(is("[]"));
    }

}