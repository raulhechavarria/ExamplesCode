package testCode;

import java.util.ArrayList;
import java.util.List;

public class KKK {

	public static void main(String args) {

		

	}
	
	
	
	private String revers(String string) {
		
		int[] arry = {7,5,6,1000,54,1 };
		
		int f = arry[0];// = 10000;
		int s = arry[1]; //= 10000 - 1;
		
		
		
			
		
		
		for (int i = 2 ; i < arry.length-3; i+=2) {
			if (f > arry[i]) {
				f = arry[i];
			}
			if (s > arry[i+1]) {
				s = arry[i+1];
			}
			if (f > s) {
				int va = s;
				s = f;
				f = va;
			}
		}
		return string;
		
		
	}
	
	
	

	/*
	 * 
	 * static private void metho() { String str = "Java";
	 * 
	 * String[] result = new String[str.length()]; List<String> obj = new
	 * ArrayList<>();
	 * 
	 * for (int i = 0; i < str.length(); i++) { // result[i] = str.substring(i+1) +
	 * str.substring() str = str.substring(1) + str.substring(0, 1); result[i] =
	 * str; System.out.println(str);
	 * 
	 * }
	 * 
	 * }
	 */

}
