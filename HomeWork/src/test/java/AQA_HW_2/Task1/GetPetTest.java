package AQA_HW_2.Task1;

import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetPetTest {

    @Test
    public void verifyPetCanBeObtained() {
        int entityIdToFInd = 399;
        Response response = given().get("Https://petstore.swagger.io/v2/pet/" + entityIdToFInd);
        System.out.println(response.asPrettyString());

        PetDto petDto = response.as(PetDto.class);
        System.out.println(petDto);
        Assert.assertEquals(200, response.statusCode());
        Assert.assertEquals(entityIdToFInd, petDto.getId());
    }
}
