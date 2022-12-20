package model;

import java.util.HashMap;

public class Group {
	private static int counter = 1;
	private static HashMap<Integer, Group> groupTable = new HashMap<>(); 
	
	private int id;
	private String topic;
	
	public Group(String topic) {
		this.id = counter++;
		this.topic = topic;
	}
	
	static void addGroup(Group group) {
		groupTable.put(group.id, group);
	}
	
	static Group getGroupByID(int id) {
		return groupTable.get(id);
	}
	
	@Override
	public String toString() {
		return topic;
	}
}
