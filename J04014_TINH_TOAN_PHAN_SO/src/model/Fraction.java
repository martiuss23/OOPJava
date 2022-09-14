package model;

public class Fraction {
	private long numerator;
	private long denominator;
	
	public Fraction(long numerator, long denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public void reduce() {
		long gcd = GCD(numerator, denominator);
		this.numerator /= gcd;
		this.denominator /= gcd;
	}
	
	private static long GCD(long a, long b) {
		while(a != 0) {
			if(a < b) {
				long tmp = a;
				a = b;
				b = tmp;
			}
			a = a%b;
		}
		return b;
	}
	
	public static Fraction squareOfSum(Fraction firstFrac, Fraction secondFrac ) {
		long numer = firstFrac.numerator * secondFrac.denominator + firstFrac.denominator * secondFrac.numerator;
		long denom = firstFrac.denominator * secondFrac.denominator;
		Fraction result =  new Fraction(numer * numer, denom * denom);
		return result;
	}
	
	public static Fraction mulOf(Fraction firstFrac, Fraction secondFrac, Fraction thirdFrac) {
		long numer = firstFrac.numerator * secondFrac.numerator * thirdFrac.numerator;
		long denom = firstFrac.denominator * secondFrac.denominator * thirdFrac.denominator;
		Fraction result = new Fraction(numer, denom);
		return result;
	}
	
	@Override
	public String toString() {
		return numerator + "/" + denominator;
	}
}
