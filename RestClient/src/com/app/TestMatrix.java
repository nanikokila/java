package com.app;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class TestMatrix {

	public static void main(String[] args) {
		
		//create empty client object
				Client c = Client.create();
				//Define one URL
				String url = "http://localhost:1010/RestfulWebservices/rest/zyx;sid=1;sname=ashok;sfee=5.0";
				//URL to the client object
				WebResource wr = c.resource(url);
		
				ClientResponse cr = wr.get(ClientResponse.class);
				//Read entity from client ClientResponse object
				String s = cr.getEntity(String.class);
				//print entity message
				System.out.println(s);
				System.out.println(cr.getStatus());
				System.out.println(cr.getStatusInfo());
	}
}
