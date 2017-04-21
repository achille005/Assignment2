package demo.model;

import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.List;

import javax.ws.rs.core.*;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sun.jersey.api.client.*;
import com.sun.jersey.api.client.config.*;
import entities.*;

public class AddressRestClient {
	
	private String BASE_URL = "http://localhost:8080/IngATMsServiceREST/rest/address/findall";
	
	public List<Address> findAll() {
		List<Address> addresses = null;
		try {
			Gson gson = new Gson();			
			URL url = new URL(BASE_URL);
	        InputStreamReader reader = new InputStreamReader(url.openStream());
			Type listType = new TypeToken<List<Addresses>>() {}.getType();
			addresses = gson.fromJson(reader, listType);
		} catch (Exception e) {
			addresses = null;
		}
		return addresses;
	}

}
