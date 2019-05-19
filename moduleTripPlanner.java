import java.util.Scanner;

public class moduleTripPlanner {
	public static void main(String[] args) {
		System.out.println("Welcome to Vacation planner");
		

		intor();
		divider();
		travelAndBudget();
		divider();
		
		
	}
	public static void divider() {
		System.out.println("***********");
		
	}
	public static void intor() {
		System.out.print("What is your name? ");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		System.out.print("Nice to meet you " + name + ", " + "Where are you travelling to? ");
		String address = input.nextLine();		
		System.out.println("Great! "+address+" "+"sounds like a great trip");
		
	}
	public static void travelAndBudget() {
		Scanner input = new Scanner(System.in);
		System.out.print("How many days are you going to spend travelling");
		int spend = input.nextInt();
		System.out.print("How much money, in USD, are you planning to spend on your trip? ");
		int toSpend = input.nextInt();
		System.out.print("What is the three letter currnecy symbol for your travelling destination? ");
		String currnecy = input.next();
		System.out.print("How many " + currnecy + " are there in 1 USD? ");
		int normalCurrency = input.nextInt();
		System.out.print("\n");
		System.out.print("\n");
		System.out.print("If you are travelling for");

	}
}