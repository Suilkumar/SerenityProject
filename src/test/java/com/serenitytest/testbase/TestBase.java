package com.serenitytest.testbase;

import org.junit.BeforeClass;

import io.restassured.RestAssured;

public class TestBase {

	@BeforeClass
	public static void init(){
		RestAssured.baseURI = "http://restcountries.eu";
		
	}
}
