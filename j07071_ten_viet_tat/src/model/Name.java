package model;


public class Name implements Comparable<Name> {
	private String[] name;
	
	public Name(String name) {
		this.name = name.split("\\s+");
 	}
	
	public String getShortName() {
		String shortName = "";
		for(int i = 0; i < name.length - 1; i++) {
			shortName += name[i].charAt(0);
			shortName += '.';
		}
		return shortName + name[name.length - 1].charAt(0);
	}

	public boolean similarTo(String str) {
		String shortName = this.getShortName();
		if(str.length() != shortName.length()) return false;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == '*') continue;
			if(shortName.charAt(i) != str.charAt(i)) return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		StringBuilder sbd = new StringBuilder();
		for(int i = 0; i < name.length; i++) {
			sbd.append(name[i]);
			sbd.append(" ");
		}
		return sbd.toString().trim();
	}

	@Override
	public int compareTo(Name o) {
		if(name[name.length - 1].compareTo(o.name[o.name.length - 1]) == 0) {
			if(name[0].compareTo(o.name[0]) == 0) {
				//compare middle name
				for(int i = 1; i <= Math.min(name.length, o.name.length) - 2; i++) {
					if(name[i].compareTo(o.name[i]) == 0) continue;
					else return name[i].compareTo(o.name[i]);
				}
				if(name.length > o.name.length) return 1;
				else if(name.length < o.name.length) return -1;
				else return 0;
			}
			return name[0].compareTo(o.name[0]);
		}
		return name[name.length - 1].compareTo(o.name[o.name.length - 1]);
	}
	
}
