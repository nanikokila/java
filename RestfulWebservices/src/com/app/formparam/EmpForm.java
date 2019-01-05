package com.app.formparam;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

@Path("/form")
public class EmpForm {

	@POST
	@Path("/path")
	public String form(@FormParam("eid")int eid,
			@FormParam("ename")String ename,
			@FormParam("esal")double esal)
	{
		return "Hello:"+eid+":"+ename+":"+esal;
	}
}
