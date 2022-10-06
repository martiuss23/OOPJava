package model;

import java.util.ArrayList;
import java.util.HashMap;

public class Table {
	private HashMap<String, Product> productMap;
	private ArrayList<Receipt> listReceipts;
	
	public Table() {
		productMap = new HashMap<>();
		listReceipts = new ArrayList<>();
	}
	
	public void addProduct(Product product) {
		productMap.put(product.getID(), product);
	}
	
	public void addReceipt(String id, int numberOfProduct) {
		listReceipts.add(this.contructReceipt(id, numberOfProduct));
	}
	
	private static double getDiscount(int numberOfProduct) {
		if(numberOfProduct >= 150) return 0.5;
		if(numberOfProduct >= 100) return 0.3;
		if(numberOfProduct >= 50) return 0.15;
		return 0;
	}
	
	private Receipt contructReceipt(String id, int numberOfProduct) {
		Product product = productMap.get(id.substring(0, 2));
		int cost = product.getOption(id.charAt(2));
		long total = (long)cost * numberOfProduct;
		return new Receipt(id, product.getName(), numberOfProduct, (long)(total * Table.getDiscount(numberOfProduct)),total - 
				(long)(total * Table.getDiscount(numberOfProduct)));
	}
	
	@Override
	public String toString() {
		StringBuilder sbd = new StringBuilder();
		listReceipts.forEach((receipt)->{sbd.append((receipt) + "\n");});
		return sbd.toString();
	}
}

