package org.jaini.messenger.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.jaini.messenger.database.DatabaseClass;
import org.jaini.messenger.model.Message;

public class MessageService {

	private Map<Long, Message> messages = DatabaseClass.getAllMessages();

	public List<Message> getAllMessages() {
		return new ArrayList<Message>(messages.values());

	}
	
	public Message getMessage(long id){
		return messages.get(id);
	}
	
	public Message addMessage(Message message){
		message.setId(messages.size()+1);
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message){
		if(messages.containsKey(message.getId())){
			messages.put(message.getId(), message);
			return message;
		}
		return null;
	}
	
	public Message removeMessage(long id){
		return messages.remove(id);
	}

}
