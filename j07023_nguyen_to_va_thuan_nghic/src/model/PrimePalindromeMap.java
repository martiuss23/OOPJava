package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class PrimePalindromeMap extends TreeMap<Integer, Integer> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int MAX_SIZE = 10001;
	private static boolean[] primes;
	static {
		primes = new boolean[MAX_SIZE];
		Arrays.fill(primes, true);
		primes[0] = primes[1] = false;
		for(int i = 4; i < MAX_SIZE; i+= 2)
			primes[i] = false;
		for(int i = 3; i <= Math.sqrt(MAX_SIZE); i+= 2) {
			if(primes[i]) {
				for(int j = i * i; j < MAX_SIZE; j+= i)
					primes[j] = false;
			}
		}
		
	}
	
	private static boolean isPalindrome(String nb) {
		for(int i = 0; i < nb.length()/2; i++)
			if(nb.charAt(i) != nb.charAt(nb.length()-1-i)) return false;
		return true;
	}
	
	public PrimePalindromeMap() {
		super();
	}
	
	public PrimePalindromeMap(ArrayList<Integer> list) {
		super();
		for(Integer nb: list) {
			if(primes[nb] && isPalindrome(nb + "")) {
				if(this.containsKey(nb)) this.put(nb, this.get(nb) + 1);
				else this.put(nb, 1);
			}
			
		}
	}
	
	public void showIntersection(PrimePalindromeMap o) {
		for(Map.Entry<Integer, Integer> entry : this.entrySet()) {
			if(o.containsKey(entry.getKey()))
				System.out.println(entry.getKey() + " " + entry.getValue() + " " + o.get(entry.getKey()));
		}
	}
}
