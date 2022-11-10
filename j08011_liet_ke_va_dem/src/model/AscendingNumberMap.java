package model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class AscendingNumberMap {
	private Map<String, Integer> map;

	public AscendingNumberMap() {
		map = new LinkedHashMap<>();
	}
	
	public void put(String key) throws AscendingNumberException {
		if(!isAscendingNumber(key))
			throw new AscendingNumberException();
		if(map.containsKey(key)) {
			map.put(key, map.get(key) + 1);
		}
		else
			map.put(key, 1);
	}
	
	private static boolean isAscendingNumber(String number) {
		for(int i = 0; i < number.length() - 1; i++) {
			if(number.charAt(i) > number.charAt(i+1)) {
				return false;
			}
		}
		return true;
	}
	
	public List<Entry<String, Integer>> getListDescendingValue(){
		List<Entry<String, Integer>> ls = new ArrayList<>(map.entrySet());
		ls.sort(new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				if(o1.getValue() < o2.getValue()) return 1;
				if(o1.getValue() > o2.getValue()) return -1;
				return 0;
			}
		});
		return ls;
	}
	
	
}
