package model;

public class Complex {
	private int real;
	private int imagine;
	
	public Complex(int real, int imagine) {
		this.real = real;
		this.imagine = imagine;
	}
	
	public static Complex sum(Complex firstComplex, Complex secondComplex) {
		return firstComplex.sum(secondComplex);
	}
	
	private Complex sum(Complex secondComplex) {
		int real = this.real + secondComplex.real;
		int imagine = this.imagine + secondComplex.imagine;
		return new Complex(real, imagine);
	}
	
	public static Complex mul(Complex firstComplex, Complex secondComplex) {
		return firstComplex.mul(secondComplex);
	}
	
	private Complex mul(Complex secondComplex) {
		int real = this.real*secondComplex.real - this.imagine*secondComplex.imagine;
		int imagine = this.real*secondComplex.imagine + this.imagine * secondComplex.real;
		return new Complex(real, imagine);
	}
	
	@Override
	public String toString() {
		return real + " " + ((imagine>0)?"+":"-") + " " + Math.abs(imagine) + "i";
	}
}
