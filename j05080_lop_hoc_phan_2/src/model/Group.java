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
	
	String getLectureName() {
		return lectureName;
	}
	
	@Override
	public int compareTo(Group o) {
		if(subject.compareTo(o.subject) == 0)
			return gID.compareTo(o.gID);
		return subject.compareTo(o.subject);
	}
	
	@Override
	public String toString() {
		return subject + " " + gID;
	}
}
