import java.util.*;

public class fact {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		System.out.println("result " + factorial(n));

	}
	public static int factorial(int n) {
		if (n == 1) {return 1; }
		return n*factorial(n-1);
		
	}
}