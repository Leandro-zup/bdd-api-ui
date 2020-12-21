package webService.base;

import io.restassured.http.ContentType;

public interface constant {
	
	String baseUrl = "https://5fda79376cf2e7001737f621.mockapi.io/api/";
	ContentType content = ContentType.JSON;
	Long MAX_TIMEOUT = 20000L;
	//Integer port = 443;
	String basePath="";
}
