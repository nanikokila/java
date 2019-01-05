package com.app;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.representation.Form;

public class TestFormParam {

	public static void main(String[] args) {

		Client c = Client.create();
		//Define one URL
		String url = "http://localhost:1010/RestfulWebservices/rest/form/path";
		//URL to the client object
		WebResource wr = c.resource(url);
		Form f = new Form();
		f.add("eid", "1");
		f.add("ename", "Ashok");
		f.add("esal", "45000.0");
		ClientResponse cr = wr.post(ClientResponse.class,f);
		//Read entity from client ClientResponse object
		String s = cr.getEntity(String.class);
		//print entity message
		System.out.println(s);
		System.out.println(cr.getStatus());
		System.out.println(cr.getStatusInfo());
	}

}
