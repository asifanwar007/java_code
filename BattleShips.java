import java.util.*;

public class BattleShips {
	public static void main(String[] args) {
		System.out.println("****Welcome to BattleShips game****");
		diplay();
	}
	public static void diplay() {
		System.out.print("   ");
		for (var i = 0; i < 10; i++) { 
			System.out.print(i);
		}
		System.out.println("   ");
		for (var i = 0; i<10; i++) {
			System.out.print(i + " |");
			for (var j = 0; j<10; j++){
				System.out.print(" ");

			}
			System.out.println("| " + i);
		}
		System.out.print("   ");
		for (var i = 0; i < 10; i++) { 
			System.out.print(i);

		}
		System.out.print("\n");
	}
}