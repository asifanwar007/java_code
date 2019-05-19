import java.util.*;

public class modProjectCrypto {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String n = input.nextLine();
		var ans1 = normalizeText(n);
		ans1 = ans1.toUpperCase();
		System.out.println(ans1);
	}


	public static String normalizeText(String n) {
		var ans = "";
		for (int i = 0; i < n.length(); i++){
			if (" ".equals(n.charAt(i)) || ".".equals(n.charAt(i))  || " ,".equals(n.charAt(i)) || ":".equals(n.charAt(i)) || ";".equals(n.charAt(i)) || "'".equals(n.charAt(i)) || "\"".equals(n.charAt(i)) || "!".equals(n.charAt(i)) || "?".equals(n.charAt(i)) || "(".equals(n.charAt(i)) || ")".equals(n.charAt(i))) {
				ans = ans + "";
				System.out.println("remove charater: " + n.charAt(i) + "total character: " + ans);
			} else {
				ans = ans + n.charAt(i);
				System.out.println("total characere: " + ans);
			}


		}
		return ans;
	}
}