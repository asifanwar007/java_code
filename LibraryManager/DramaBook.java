
public class DramaBook implements Book{
	String Title;
	String Author;
	int YearOfPublication;
	String Time;
	String place;

	public DramaBook(String Title, String Author, int YearOfPublication, String Time, String place){
		this.Title = Title;
		this.Author = Author;
		this.YearOfPublication= YearOfPublication;
		this.Time = Time;
		this.place = place;
	}
	public String getTime(){
		return Time;
	}
	public String getPlace(){
		return place;
	}
	@Override
	public String getTitle(){
		return Title;
	}
	@Override
	public String getAuthor(){
		return Author;
	}
	@Override 
	public int getYearOfPublication(){
		return YearOfPublication;
	}
	@Override
	public void print(){
		System.out.println("Title: " + Title + "\nAuthor: " + Author + "\nYear Of Publication: " + YearOfPublication + "\nTime: " + Time + "\nPlace: " + place);
	}
	public static void main(String[] args) {
		DramaBook book4 = new DramaBook("The Android Invasion","J. Morgan",2017,"Medievel","Europe");
        book4.print();	
	}

}	