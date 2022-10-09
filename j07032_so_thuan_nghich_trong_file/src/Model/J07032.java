package Model;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeMap;


public class J07032 {
	
	static boolean[] palindromeNumber = new boolean[1000001]; 
	
	static void generatePalindrome() {
		Arrays.fill(palindromeNumber, false);
		ArrayDeque<String> queue = new ArrayDeque<>();
		for(int i = 1; i <= 9; i+= 2) {
			queue.add(i +"");
		}
		while(!queue.isEmpty()) {
			StringBuilder sbd = new StringBuilder();
			sbd.append(queue.pollFirst());
			for(int i = 1; i <= 9; i+=2) {
				int x = Integer.parseInt(sbd.toString() + i + sbd.reverse().toString());
				if(x > 9 && x < 1000001) {
					palindromeNumber[x] = true;
					queue.addLast(sbd.toString() + i);
				}
			}
		}
	}
	
	static ArrayList<Integer> bnFileInput(String path) throws IOException, ClassNotFoundException{
		BufferedInputStream buf = new BufferedInputStream(new FileInputStream(path));
		ObjectInputStream obi = new ObjectInputStream(buf);
		ArrayList<Integer> list = (ArrayList<Integer>)obi.readObject();
		obi.close();
		buf.close();
		return list;
	}
	
	static TreeMap<Integer, Integer> getMap(ArrayList<Integer> list){
		TreeMap<Integer, Integer> mp = new TreeMap<>();
		for(Integer nb : list ) {
			if(palindromeNumber[nb]) {
				if(mp.containsKey(nb)) {
					mp.put(nb, mp.get(nb) + 1);
				}
				else
					mp.put(nb, 1);
			}
		}
		return mp;
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		generatePalindrome();
		ArrayList<Integer> list1 = bnFileInput("DATA1.in");
		ArrayList<Integer> list2 = bnFileInput("DATA2.in");
		TreeMap<Integer, Integer> mp1 = getMap(list1);
		TreeMap<Integer, Integer> mp2 = getMap(list2);
		TreeMap<Integer, Integer> res = new TreeMap<>();
		mp1.forEach((key, val)->{
			if(mp2.containsKey(key)) {
				res.put(key, val + mp2.get(key));
			}
		});
		int cnt = 0;
		for(Integer key : res.keySet()) {
			if(cnt >= 10) break;
			System.out.println(key + " " + res.get(key));
			cnt++;
		}
	}
}
