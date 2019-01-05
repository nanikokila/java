package com.app.matrixparam;

import javax.ws.rs.GET;
import javax.ws.rs.MatrixParam;
import javax.ws.rs.Path;

@Path("/zyx")
public class ProviderMatrix {

	@GET
	public String show(@MatrixParam("sid")int sid,
			@MatrixParam("sname")String sname,
			@MatrixParam("sfee")double sfee)
	{
		return "Hello:"+sid+","+sname+","+sfee;
	}
}
