public class ScienceFictionAudioBook extends ScienceFictionBook implements eAudioBook {
	static int count = 0;
	String size;

	public ScienceFictionAudioBook(String Title, String Author, int YearOfPublication, String Time, String place, String subject, String size){
		super(Title, Author, YearOfPublication, Time, place, subject);
		this.size = size;
		count++;
	}
	
	public int getNumberOfTracks(){
		
		return count;
	}
	public void print(){
		System.out.println("Title: " + Title + "\nAuthor: " + Author + "\nYear Of Publication: " + YearOfPublication + "\nTime: " + Time + "\nPlace: " + place + "\nSubject: " + subject +"\nSize: " + size);
	}
	public static void main(String[] args) {
		ScienceFictionAudioBook book4 = new ScienceFictionAudioBook("The Android Invasion","J. Morgan",2017,"Medievel","Europe","Time Travel", "8mb");
        book4.print();
        

		ScienceFictionAudioBook book1 = new ScienceFictionAudioBook("The Android Invasion","J. Morgan",2017,"Medievel","Europe","Time Travel","8mb");
		ScienceFictionAudioBook book2 = new ScienceFictionAudioBook("The Android Invasion","J. Morgan",2017,"Medievel","Europe","Time Travel","8mb");
     	System.out.println(book4.getNumberOfTracks());  
	}
}