package com.farhad.rest.messenger.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.farhad.rest.messenger.model.Profile;
import com.farhad.rest.messenger.services.ProfileService;

@Path("/profiles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProfileResource {
	
	ProfileService ps = new ProfileService();
	
	@GET
	public List<Profile> getProfiles(){
		return ps.getProfiles();
	}
}
