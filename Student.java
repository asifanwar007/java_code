import java.util.*;

public class Student {
	//fields
	String name;
	int grad;
	int ID;
	double GPA;
	int abs;

	//constructor
	public Student(String name, int grad, int ID, double GPA, int abs) {
		this.name = name;
		this.grad = grad;
		this.ID = ID;
		this.GPA = GPA;
		this.abs = abs;
	}
	//behaviour
	public boolean isGraduating() {
		return (GPA > 2.0 && abs < 10 && grad == 12);
	}
}