package AQA_HW_2.Task1;

import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DeletePetTest {
    @Test
    public void verifyPetCanBeRemoved() {
        int petIdToCreate = 985;
        CategoryDto categoryDto = new CategoryDto();
        categoryDto.setName("Staff");
        String petNameToCreate = "Bul";
        String status = "available";

        PetDto petDtoToCreate = new PetDto(petIdToCreate, categoryDto, petNameToCreate, status);
        Response createdPetResponse = given()
                .contentType("application/json")
                .body(petDtoToCreate)
                .post("https://petstore.swagger.io/v2/pet");
        PetDto postResponseDto = createdPetResponse.as(PetDto.class);

        Assert.assertEquals(petIdToCreate, postResponseDto.getId());
        Response previouslyCreatedPetResponse = given().get("https://petstore.swagger.io/v2/pet/" + petIdToCreate);
        PetDto previouslyCreatedPetDto = previouslyCreatedPetResponse.as(PetDto.class);
        Assert.assertEquals(petIdToCreate, previouslyCreatedPetDto.getId());

        given().delete("https://petstore.swagger.io/v2/pet/" + petIdToCreate);

        Response deletedPetResponse = given().get("https://petstore.swagger.io/v2/pet/" + petIdToCreate);

        Assert.assertEquals(404, deletedPetResponse.getStatusCode());

        NotFoundPetDto notFoundPetDto =deletedPetResponse.as(NotFoundPetDto.class);

        Assert.assertEquals("error", notFoundPetDto.getType());
        Assert.assertEquals("Pet not found", notFoundPetDto.getMessage());
    }
}
