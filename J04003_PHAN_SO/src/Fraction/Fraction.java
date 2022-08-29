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
	
	private void shortFrac() {
		long gcd = this.GCD(this.getNumerartor(), this.getDenominator());
		this.numerartor /= gcd;
		this.denominator /= gcd;
	}
	
	public void shortenFraction() {
		this.shortFrac();
	}
}
