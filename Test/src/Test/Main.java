package Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main  {
	public static TreeSet<OBJ> ls = new TreeSet<OBJ>();
	
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		OBJ o = new OBJ(l);
		ls.add(o);
		System.out.println(ls.toString());
	}
}
