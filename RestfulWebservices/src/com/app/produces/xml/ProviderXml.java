package com.app.produces.xml;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
/*import javax.ws.rs.core.MediaType;*/

@Path("/home")
public class ProviderXml {

	@Path("/msg")
	@GET
	//@Produces(MediaType.APPLICATION_ATOM_XML)
	@Produces("application/xml")
	public Emp showMessage()
	{
		Emp emp=  new Emp();
		emp.setEmpId(1);
		emp.setEmpName("Ashok");
		emp.setEmpSal(45000.0);
		return emp;


	}}