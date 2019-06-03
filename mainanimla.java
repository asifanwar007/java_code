public class mainanimla {
	public static void main(String[] args) {
		Animal a = new Animal();
		Animal b = new Sporting();
		Sporting c = new LabradorRetriever();
		System.out.println(a.bark()); // prints "woof"
		System.out.println(b.bark()); // prints "howl"
		System.out.println(c.bark()); // prints "high howl"
	}
}