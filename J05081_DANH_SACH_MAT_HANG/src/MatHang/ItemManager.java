package MatHang;

import java.util.ArrayList;
import java.util.Collections;

public class ItemManager {
	private ArrayList<Item> list;
	
	public ItemManager() {
		list = new ArrayList<>();
	}
	
	public void add(Item item) {
		list.add(item);
	}
	
	public void sortLs() {
		Collections.sort(this.list);
	}
	
	public void show() {
		list.forEach((item)->{System.out.println(item);});
	}
}
