import java.util.*;


public class mainfraction{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numer = input.nextInt();
		int denom = input.nextInt();
		fraction fr = new fraction(numer, denom);
		int n = fr.getNumerator();
		int d = fr.getDenominator();
		System.out.println(n + " " + d);
			
	}
}