package com.app;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/ashok")
public class Provider {

	@Path("/ramya")
	@GET
	public String showMessage()
	{
		return "Hi Ashok welcome to Restful";
	}
}
