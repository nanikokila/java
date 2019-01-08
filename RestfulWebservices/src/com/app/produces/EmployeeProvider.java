package com.app.produces;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
/*import javax.ws.rs.Produces;*/
import javax.ws.rs.core.MediaType;

@Path("/aaa")
public class EmployeeProvider {

	@Path("/rrr")
	@GET
	
	@Produces(MediaType.APPLICATION_JSON)
	//@Produces("application/json")
	public Employee showMessage()
	{
		Employee emp=  new Employee();
		emp.setEmpId(1);
		emp.setEmpName("Ashok");
		emp.setEmpSal(45000.0);
		return emp;
	}
}
