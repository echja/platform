package com.docker.test;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

import net.paoding.rose.web.Invocation;
import net.paoding.rose.web.annotation.Param;
import net.paoding.rose.web.annotation.Path;
import net.paoding.rose.web.annotation.rest.Get;

@Path("1.0")
public class FileController {
	private static ObjectMapper jsonObjectMapper = new ObjectMapper();
	
	@Get("files")
	public String file(Invocation inv,@Param("ProviderIP") String ProviderIP,@Param("ProviderPort") String ProviderPort) throws Exception {
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("files", "111.txt");
		return "@json:" + getJsonObjectMapper().writeValueAsString(result);
	}

	public static ObjectMapper getJsonObjectMapper() {
		return jsonObjectMapper;
	}
	
}
