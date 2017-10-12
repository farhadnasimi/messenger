package com.farhad.rest.messenger.services;

import java.util.*;
import com.farhad.rest.messenger.model.Message;

public class MessageService {

	public List<Message> getMessages() {
		Message m1 = new Message(1, "I am message1", "Farhad");
		Message m2 = new Message(2, "I am message2", "Bob");
		Message m3 = new Message(3, "I am message3", "Tom");
		Message m4 = new Message(4, "I am message4", "Mike");

		List<Message> list = new ArrayList<Message>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);

		return list;
	}
}
