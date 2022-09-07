package MatHang;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int sz = scn.nextInt();
		
		ItemManager itemManager = new ItemManager();
		String name, unit;
		int purchasePrice, price;
		for(int  i = 1; i <= sz; i++) {
			scn.nextLine();
			name = scn.nextLine();
			unit = scn.nextLine();
			purchasePrice = scn.nextInt();
			price = scn.nextInt();
			Item item = new Item(name, unit, purchasePrice, price);
			itemManager.add(item);
		}
		itemManager.sortLs();
		itemManager.show();
	}
}

