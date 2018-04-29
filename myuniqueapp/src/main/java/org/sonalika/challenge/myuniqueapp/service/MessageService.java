package org.sonalika.challenge.myuniqueapp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.sonalika.challenge.myuniqueapp.database.DatabaseClass;
import org.sonalika.challenge.myuniqueapp.model.Message;

public class MessageService {
	
	private Map<Long, Message> messages = DatabaseClass.getMessages();
	
	public MessageService(){
		messages.put(1L, new Message(1, "Hello Sonalika", "Sonalika"));
		messages.put(2L, new Message(2, "Hello Sunit", "Sunit"));
		
	}

	 public List<Message> getAllMessages() {
		return new ArrayList<Message>(messages.values());
	 }
	 
	 public Message addMessage(Message message){
		 message.setId(messages.size() + 1);
		 messages.put(message.getId(), message);
		 return message;
		 
	 }
}
