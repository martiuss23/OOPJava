package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class PrimeNumber extends TreeMap<Integer, Integer> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static boolean[] primes;
	private static int MAX_SIZE = 10001;
	static
	{
		primes = new boolean[MAX_SIZE];
		Arrays.fill(primes, true);
		primes[0] = false;
		primes[1] = false;
		for(int i = 4; i < MAX_SIZE; i+= 2)
			primes[i] = false;
		for(int i = 3; i<= Math.sqrt(MAX_SIZE); i+=2) {
			if(primes[i]) {
				for(int j = i * i; j < MAX_SIZE; j+=i) {
					primes[j] = false;
				}
			}
		}
	}
	
	public PrimeNumber() {
		super();
	}
	
	public PrimeNumber(ArrayList<Integer> list) {
		super();
		for(Integer nb: list) {
			if(primes[nb]) {
				if(this.containsKey(nb)) this.put(nb, this.get(nb) + 1);
				else
					this.put(nb, 1);
			}
		}
	}
	
	public void showIntersection(PrimeNumber o) {
		for(Map.Entry<Integer, Integer> et : o.entrySet()) {
			if(this.containsKey(et.getKey())) {
				System.out.println(et.getKey() + " " + this.get(et.getKey()) + " " + et.getValue());
			}
		}
	}
	
	
}
