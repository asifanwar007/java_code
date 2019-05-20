import java.util.*;

public class fraction {
	//fields
	private int numerator;
	private int denominator;

	//constructor
	public fraction(int numerator, int denominator){
		try{
		if(denominator < 0){
			this.numerator = -1*numerator;
			this.denominator = -1*denominator;	
		}
		else{
			this.numerator = numerator;
			this.denominator = denominator;	
		}
		int y = numerator/denominator;
	}	
		catch(ArithmeticException e){
			System.out.println("IllegalArgumentException");
		}
		// catch(IllegalArgumentException e){}
	}
	public fraction(int num){
		this.numerator = num;
		this.denominator = 1;
	}
	public fraction(){
		this.numerator = 0;
		this.denominator = 1;
	}
	public int getNumerato() {
		return numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	public String toString() {
		return numerator + "/" + denominator;
	}
	public double ToDouble() {
		return (double) numerator/denominator;
	}
	public double add(double x, double y) {
		return x + y;
	}
	public static int gcd(int num,int div){
		if(num <= 0 || div <= 0 && num > div) return num;
		else if(num <= 0 || div <= 0 && num < div) return div;
		else if(num > div) return gcd(num-div,div);
		else return gcd(num,div-num);
	}
	public void printmyVal(){
		System.out.print(this.numerator);
		System.out.print(",  ");
		System.out.println(this.denominator);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numer = input.nextInt();
		int denom = input.nextInt();
		System.out.println(gcd(numer, denom));
			
	}
}
