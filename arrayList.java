import java.util.*;

public class arrayList {
	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		System.out.println(name);
		name.add("Asif");
		name.add("Snwar");
		name.add("Anwar");
		name.set(0, "my name is asif anwr");

		System.out.println(name);
		var index0 = name.get(0);
		System.out.println(index0);
	}
}