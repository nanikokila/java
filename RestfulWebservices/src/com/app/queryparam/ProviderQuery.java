package com.app.queryparam;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/xyz")
public class ProviderQuery {

	@GET
	public String show(@QueryParam("eid")int eid,
			@QueryParam("ename")String ename,
			@QueryParam("esal")double esal)
	{
		return "Hello:"+eid+","+ename+","+esal;
	}
}
