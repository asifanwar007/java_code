public class ScienceFictionBook extends DramaBook implements Book{
	String subject;
	
	
	public ScienceFictionBook(String Title, String Author, int YearOfPublication, String Time, String place,String subject){
		super(Title, Author, YearOfPublication, Title, place);
		this.subject = subject;
	}

	public String getSubject(){
		return subject;
	}
	public void print(){
		System.out.println("Title: " + Title + "\nAuthor: " + Author + "\nYear Of Publication: " + YearOfPublication + "\nTime: " + Time + "\nPlace: " + place + "\nSubject: " + subject);

	}
	public static void main(String[] args) {
		ScienceFictionBook book4 = new ScienceFictionBook("The Android Invasion","J. Morgan",2017,"Medievel","Europe","Time Travel");
        book4.print();
	}
}