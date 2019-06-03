public class practice1 extends practice {


	public practice1(String name, int Id){
		super(name, Id);
		
		
	}
	void work(){
		super.eat();
	}
	public static void main(String[] args) {
		practice1 as = new practice1("asif",10);
		as.work();
		
	}

}