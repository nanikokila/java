package com.app;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class TestQueryParam {

	public static void main(String[] args) {

		//create empty client object
		Client c = Client.create();
		//Define one URL
		String url = "http://localhost:1010/RestfulWebservices/rest/xyz";
		//add URL to Client object
		WebResource wr = c.resource(url);
		wr = wr.queryParam("eid","1");
		wr = wr.queryParam("ename", "Ashok");
		wr = wr.queryParam("esal", "10.0");
		ClientResponse cr = wr.get(ClientResponse.class);
		String s = cr.getEntity(String.class);
		System.out.println(s);
		System.out.println(cr.getStatus());
		System.out.println(cr.getStatusInfo());
	}

}
