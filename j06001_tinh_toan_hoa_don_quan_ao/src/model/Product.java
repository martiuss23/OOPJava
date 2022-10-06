package model;

public class Product {
	private String id;
	private String name;
	private int type1;
	private int type2;
	
	public Product(String id, String name, int type1, int type2) {
		super();
		this.id = id;
		this.name = name;
		this.type1 = type1;
		this.type2 = type2;
	}
	
	public String getID() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getOption(char a) {
		if(a == '1') return type1;
		return type2;
	}
}
