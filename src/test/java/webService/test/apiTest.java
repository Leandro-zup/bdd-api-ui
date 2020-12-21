package webService.test;

import org.junit.Test;
import webService.base.hook;

import static io.restassured.RestAssured.given;

public class apiTest extends hook{

	@Test
	public void cadastrarGarantia() {
		given()
			.contentType(content)
			.body("{" +
					"\"garantia\":\"moto\"," +
					"\"valor\": \"21000.0\"," +
					"\"vencimento\": \"12/10/2021\"," +
					"\"valoracao\":true}")
		.when()
			.post("/garantia")
		.then().log().all()
			.statusCode(201);
	}

	@Test
	public void listarGarantia() {
		given()
		.when()
			.get("/garantia/40")
		.then().log().all()
			.statusCode(200);
	}
	
	@Test
	public void listarTodasGarantias() {
		given()
		.when()
			.get("/garantia")
		.then().log().all()
			.statusCode(200);
	}
	
	@Test
	public void alterarGarantia() {
		given()
		.contentType(content)
		.body("{" +
				"\"garantia\":\"carro\"," +
				"\"valor\": \"45000.0\"," +
				"\"vencimento\": \"12/10/2021\"," +
				"\"valoracao\":false}")
	.when()
		.put("/garantia/40")
	.then().log().all()
		.statusCode(200);
	}

	@Test
	public void deletarGarantia() {
		given()
				.contentType(content)
				.when()
				.delete("/garantia/40")
				.then().log().all()
				.statusCode(200);
	}
}