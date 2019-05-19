import java.util.*;

public class array {
	public static void main(String[] args) {
		int[] a = new int[5];
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++){
			a[i] = i ;
		}
		System.out.println(Arrays.toString(a));
		int[][] darray = new int[3][5];
		System.out.println(Arrays.toString(darray[0]));
		var count = 0;
		for (int i = 0; i < darray.length; i++){
			for (int j = 0; j < darray[0].length; j++){
				darray[i][j] = count;
				count++;
			}
		}
		System.out.println(Arrays.deepToString(darray));
	}
}