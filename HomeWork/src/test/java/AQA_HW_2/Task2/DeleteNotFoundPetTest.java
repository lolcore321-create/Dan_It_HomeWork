package AQA_HW_2.Task2;

import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DeleteNotFoundPetTest {


    @Test
    public void verifyNotExistingPetCannotBeDeleted() {
        Response deleteResponse = given().delete("https://petstore.swagger.io/v2/pet/" + 1346);
        Assert.assertEquals(404, deleteResponse.getStatusCode());
    }
}
