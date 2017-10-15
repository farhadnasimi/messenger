package com.farhad.rest.messenger.services;

import java.util.*;

import com.farhad.rest.messenger.database.DatabaseClass;
import com.farhad.rest.messenger.model.Message;

public class MessageService {
	private Map<Long, Message> messages = DatabaseClass.getMessages();
	
	public MessageService(){
		messages.put(1L, new Message(100, "I am the first message","Farhad"));
		messages.put(2L, new Message(101, "I am the second message","Bob"));
		messages.put(3L, new Message(103, "I am the third message","Mike"));
		messages.put(4L, new Message(104, "I am the fourth message","Lauren"));
	}	


	public List<Message> getMessages() {
		return new ArrayList<Message>(messages.values());
	}
	
	public Message getMessage(long id){
		return messages.get(id);
	}
	
	public Message addMessage(Message message){
		message.setId(messages.size() + 1);
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message){
		if(message.getId() <= 0){
			return null;
		}
		messages.put(message.getId(), message);
		return message;
	}
	public Message removeMessage(long id){
		return messages.remove(id);
	}
}
