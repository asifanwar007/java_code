public class DramaPrintedBook extends DramaBook implements PrintedBook {
	String dimensions;
	String weight;
	public DramaPrintedBook(String Title, String Author, int YearOfPublication, String Time, String place, String dimensions, String weight){
		super(Title, Author, YearOfPublication, Time, place
			);
		this.dimensions = dimensions;
		this.weight = weight;
	}
	public String getDimensions(){
		return dimensions;
	}
	public String getWeight(){
		return weight;
	}
	public void print(){
		System.out.println("Title: " + Title + "\nAuthor: " + Author + "\nYear Of Publication: " + YearOfPublication + "\nTime: " + Time + "\nPlace: " + place +"\nDimensions: " + dimensions + "\nWeight: " + weight);
	}
}