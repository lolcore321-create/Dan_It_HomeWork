package AQA_HW_2.Task2;

import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetPetsTest {

    @Test
    public void verifyPetCanBeObtained() {
        int entityIdToFInd = 686;
        Response response = given().get("Https://petstore.swagger.io/v2/pet/" + entityIdToFInd);
        System.out.println(response.asPrettyString());

        PetsDto petsDto = response.as(PetsDto.class);
        System.out.println(petsDto);
        Assert.assertEquals(200, response.statusCode());
        Assert.assertEquals(entityIdToFInd, petsDto.getId());
    }
}
