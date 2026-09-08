package AQA_HW_2.Task2;

import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CreatedPetTest {

    @Test
    public void verifyPetCanBeCreated() {
        int petIdToCreate = 686;
        CategoryDTo categoryDTo = new CategoryDTo();
        categoryDTo.setName("Golden Retriever");
        String petNameToCreate = "Busya";
        String status = "available";

        PetsDto petsDtoToCreate = new PetsDto(petIdToCreate, categoryDTo, petNameToCreate, status);
        Response createdPetsResponse = given().contentType("application/json").body(petsDtoToCreate).post("Https://petstore.swagger.io/v2/pet");
        PetsDto postResponseDto = createdPetsResponse.as(PetsDto.class);

        Assert.assertEquals(petsDtoToCreate.getId(), postResponseDto.getId());
        Response previouslyCreatedPetsResponse = given().get("https://petstore.swagger.io/v2/pet/" + petIdToCreate);
        PetsDto previouslyCreatedPetsDto = previouslyCreatedPetsResponse.as(PetsDto.class);
        Assert.assertEquals(petIdToCreate, previouslyCreatedPetsDto.getId());
        Assert.assertEquals(categoryDTo.getName(), previouslyCreatedPetsDto.getCategory().getName());
        Assert.assertEquals(petNameToCreate, previouslyCreatedPetsDto.getName());
        Assert.assertEquals(status, previouslyCreatedPetsDto.getStatus());
    }
}
