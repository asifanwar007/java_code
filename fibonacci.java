import java.util.*;

public class fibonacci {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int j = input.nextInt();
		System.out.println("result: " + fibonacci(j));
		
	}
	public static int fibonacci(int n) {
		if (n == 0) { return 0; }
		else if (n == 1) {return 1; }
		else if (n == 2) { return 3; }
		else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
}