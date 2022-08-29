package Fraction;

public class Fraction {
	private long numerartor;
	private long denominator;
	
	public Fraction() {
	}

	public Fraction(long numerartor, long denominator) {
		this.numerartor = numerartor;
		this.denominator = denominator;
	}

	public long getNumerartor() {
		return numerartor;
	}

	public long getDenominator() {
		return denominator;
	}
	
	private long GCD(long a, long b) {
		while(a > 0 && b > 0) {
			if(a < b) {
				long tmp = a;
				a = b;
				b = tmp;
			}
			a = a % b;
		}
		if(a > 0)
			return a;
		return b;
	}
	
	private Fraction sum(Fraction secondFrac) {
		long denom = this.getDenominator() * secondFrac.getDenominator();
		long nume = this.getNumerartor() * (denom/ this.getDenominator()) + secondFrac.getNumerartor() * (denom/secondFrac.getDenominator());
		long gcd = this.GCD(denom, nume);
		Fraction result = new Fraction(nume/gcd, denom/gcd);
		return result;
		
	}
	
	public static Fraction sum(Fraction frac1, Fraction frac2) {
		return frac1.sum(frac2);
	}
	
	
}
