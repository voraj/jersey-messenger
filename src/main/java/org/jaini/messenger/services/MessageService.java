package org.jaini.messenger.services;

import java.util.ArrayList;
import java.util.List;

import org.jaini.messenger.model.Message;

public class MessageService {
	
	public List<Message> getAllMessages(){
		Message m1=new Message(1L, "Hello world", "Jaini");
		Message m2=new Message(2L, "Wohoo", "Jaini");
		List<Message> list=new ArrayList<Message>();
		list.add(m1);
		list.add(m2);
		return list;
		
	}

}
