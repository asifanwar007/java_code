public class Classroom {
	// field
	int roomName;
	static int roomNumber=101;
	int studentCapacity;

	// constructor
	public Classroom(int studentCapacity){
		this.studentCapacity = studentCapacity;
		this.roomName=roomNumber;
		roomNumber++;
	}
	public int getstudentCapacity(){
		return studentCapacity;

	}
	public int keepTrack(){
		
		return roomNumber;
	}
	public static Classroom highestCapacity(Classroom[] oth){
		int comp = 0;
		Classroom ans=oth[0];
		for (int i = 0; i < oth.length; i++){
			if (oth[i].getstudentCapacity() > comp){
				ans = oth[i];
			}
		}
		return ans;
	}

	public String toString(){
		String ans = "Classroom number: " + this.keepTrack() + " Student Capcity: " + studentCapacity;
		return ans;
	}

	public static void main(String[] args) {
		Classroom[] arr=new Classroom[100];
		int[] num= {100,19,191,192,1929,1992};
		

		for(int i =0; i < 100; i++){
			Classroom a = new Classroom(i*10);
			// (a.keepTrack());
			arr[i] = a;
		}
		Classroom highestValue = highestCapacity(arr);
		System.out.println(highestValue.getstudentCapacity());
		System.out.println(highestValue.keepTrack());

		// for (int c:num){
		// 	System.out.println(c);
		// }


	}


}