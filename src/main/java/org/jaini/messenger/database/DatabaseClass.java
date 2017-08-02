package org.jaini.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.jaini.messenger.model.Message;

public class DatabaseClass {
	
	private static HashMap<Long, Message> messages=new HashMap<Long, Message>();
	
	public static Map<Long, Message> getAllMessages(){
		return messages;
	}
	
}
