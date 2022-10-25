package model;

public class Pair <T, S> 
{
	private T first;
	private S second;
	
	public Pair(T first, S second) {
		this.first = first;
		this.second = second;
	}

	public T getFirst() {
		return first;
	}

	public S getSecond() {
		return second;
	}
	
	private static boolean isPrime(int nb) {
		if(nb == 2) return true;
		if(nb < 2 || nb % 2 == 0) return false;
		for(int i = 3; i <= Math.sqrt(nb); i+= 2) {
			if(nb % i == 0) return false;
		}
		return true;
	}
	
	public boolean isPrime() {
		return isPrime((Integer)first) && isPrime((Integer)second);
	}
	
	@Override
	public String toString() {
		return first + " " + second;
	}
	

	
}
