package com.farhad.rest.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.farhad.rest.messenger.model.Message;
import com.farhad.rest.messenger.services.MessageService;

@Path("/messages")
public class MessageResource {
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessage(){
		MessageService ms = new MessageService();
		return ms.getMessages();
	}
}
