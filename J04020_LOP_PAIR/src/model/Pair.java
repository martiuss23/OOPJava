package model;

public class Pair<First, Second> {
	private First first;
	private Second second;
	
	public Pair(First first, Second second) {
		this.first = first;
		this.second = second;
	}
	
	public boolean isPrime() {
		if(first.getClass().equals(Integer.class) && second.getClass().equals(Integer.class))
			return Pair.isPrime((Integer)this.first) && Pair.isPrime((Integer)this.second);
		return false;
	}
	
	private static boolean isPrime(Integer number) {
		if(number == 2) return true;
		if(number < 2 || number % 2 == 0) return false;
		for(int i = 3; i <= Math.sqrt(number); i+=2) {
			if(number % i == 0) return false;
		}
		return true;
	}
	
	@Override
	public String toString() {
		return first + " " + second;
	}
	
}
