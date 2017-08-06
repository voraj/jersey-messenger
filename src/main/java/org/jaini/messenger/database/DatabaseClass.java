package org.jaini.messenger.database;

import java.util.HashMap;
import java.util.Map;

import org.jaini.messenger.model.Message;
import org.jaini.messenger.model.Profile;

public class DatabaseClass {
	
	private static HashMap<Long, Message> messages=new HashMap<Long, Message>();
	private static HashMap<String, Profile> profiles=new HashMap<String, Profile>();
	
	public static Map<Long, Message> getAllMessages(){
		return messages;
	}
	
	public static Map<String, Profile> getProfiles(){
		return profiles;
	}
}
