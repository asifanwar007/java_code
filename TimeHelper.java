import java.util.*;

public class TimeHelper {
	// field
	int seconds;
	public TimeHelper(int seconds) {
		this.seconds = seconds;
	}
	public int inMinutes(){
		return seconds/60;
	}
	public int inHours(){
		return seconds/3600;
	}
	String hour(){
		if (this.inHours() <= 1){
			return " hour ";
		} else {
			return " hours ";
		}
	}

	String minut(){
		if (this.inMinutes() <= 1){
			return " minute ";
		} else {
			return " minutes ";
		}
	}
	String sec(){
		if (seconds%60 <= 1){
			return " second ";
		} else {
			return " seconds ";
		}
	}
	
	public String toString(){
		String ans = this.inHours() + this.hour() + this.inMinutes() + this.minut() + seconds%60 + this.sec();
		return ans;
	}

	public static void main(String[] args) {
		TimeHelper time = new TimeHelper(32000);
		TimeHelper time1 = new TimeHelper(320000);
		TimeHelper time2 = new TimeHelper(320003);
		TimeHelper time3 = new TimeHelper(60);
		TimeHelper time4 = new TimeHelper(3700);
		System.out.println(time.inMinutes());
		System.out.println(time1.inMinutes());
		System.out.println(time2.inMinutes());
		System.out.println(time3.inMinutes());
		System.out.println(time4.inMinutes());
		System.out.println(time3.toString());
		System.out.println(time2.toString());
		System.out.println(time1.toString());
		System.out.println(time.toString());
		System.out.println(time4.toString());
	}
}