package com.serenitytest.junit;
import org.junit.Test;
import com.serenitytest.testbase.TestBase;
import net.serenitybdd.rest.SerenityRest;


public class GetCountry extends TestBase{
	@Test
	public void getCountry(){
		SerenityRest.given()
		.when()
		.get("/rest/v1/name/INDIA")
		.then()
		.log()
		.all()
		.statusCode(200);
	}
	@Test
	public void getAllStudents(){
		SerenityRest.given()
		.when()
		.get("/rest/v1/name/XYZ")
		.then()
		.log()
		.all()
		.statusCode(404);
	}
	
}