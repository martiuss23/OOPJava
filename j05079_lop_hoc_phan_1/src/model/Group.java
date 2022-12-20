package model;

public class Group implements Comparable<Group> {
	private String gID;
	private String lectureName;
	private Subject subject;
	
	Group(String gID, String lectureName, final Subject subject) {
		this.gID = gID;
		this.lectureName = lectureName;
		this.subject = subject;
	}
	
	Subject getSubject() {
		return subject;
	}
	
	@Override
	public int compareTo(Group o) {
		return gID.compareTo(o.gID);
	}
	
	@Override
	public String toString() {
		return gID + " " + lectureName;
	}
}
