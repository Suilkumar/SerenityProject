package com.serenitytest.junit;
import java.util.HashMap;

import org.junit.Test;
import com.serenitytest.testbase.TestBase;
import net.serenitybdd.rest.SerenityRest;


public class getNorway extends TestBase{
	@Test
	public void getNorway1(){
		HashMap<String, Object> value =  SerenityRest.rest().given()
		.when()
		.get("/rest/v1/name/norway")
		.then()
		.log()
		.all()
		.statusCode(200)
		.extract()
		.path("findAll{it.capital=='Oslo'}.get(0)");
		System.out.println(value);
		//assertThat(value, hasValue(capital));
		 
		//System.out.println(value);
		
		
		
	}
	
	
}