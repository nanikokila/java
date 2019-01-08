package org.sathya;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

@Path("dept")
public class DepartmentConsumes {

	@Path("/cse")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public String showDept(Department dept)
	{
		
		return "Hello:"+dept.getDeptId()+":"+dept.getDeptName()+":"+dept.getDeptHOD();
	}
}
