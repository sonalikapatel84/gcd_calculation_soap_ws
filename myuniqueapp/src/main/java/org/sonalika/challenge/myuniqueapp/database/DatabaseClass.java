package org.sonalika.challenge.myuniqueapp.database;

import java.util.HashMap;
import java.util.Map;

import org.sonalika.challenge.myuniqueapp.model.Message;

public class DatabaseClass {
	
	public static Map<Long, Message> messages = new HashMap<>();

	public static Map<Long, Message> getMessages() {
		return messages;
	}

}
