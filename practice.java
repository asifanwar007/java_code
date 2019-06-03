class practice {
	private String name;
	private int Id;
	public practice(String str){
		this.name = str;
	}

	public String getName(){
		return name;
	}
	public void eat(){
		System.out.println("This statement is running form practice class");
	}
	public static void main(String[] args) {
		practice n = new practice("name");
		System.out.println(n.getName());
	}
}