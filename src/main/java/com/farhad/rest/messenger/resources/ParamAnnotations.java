package com.farhad.rest.messenger.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.*;

@Path("/annotations")
public class ParamAnnotations {
	//MatrixParam is very similar to QueryParam but the request url format is different.
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/annotate")
	public String paramAnnotationTests(@MatrixParam("matrixparam") String matparam, 
			@HeaderParam("HeaderParammm") int header, @CookieParam("cookie") String cook){
		return "Matrix Param: "+matparam+" header Paramerter: "+header+" cookie param: "+cook;
	}
	
	@GET
	@Path("/context")
	public String contextTest(@Context UriInfo uriInfo){
		return uriInfo.getAbsolutePath().toString();
	}
}
