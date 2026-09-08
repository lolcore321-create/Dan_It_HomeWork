package AQA_HW_2.Task2;

import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetNotFoundPetTest {

    @Test
    public void verifyPetNotFoundReturnsError(){
        Response notFoundResponse = given().get("https://petstore.swagger.io/v2/pet/1334");
        ErrorResponseDto errorResponseDto = notFoundResponse.as(ErrorResponseDto.class);
        System.out.println(notFoundResponse.getBody().asString());
        Assert.assertEquals("1", errorResponseDto.getCode());
        Assert.assertEquals("error", errorResponseDto.getType() );
        Assert.assertEquals("Pet not found", errorResponseDto.getMessage() );
    }
}
