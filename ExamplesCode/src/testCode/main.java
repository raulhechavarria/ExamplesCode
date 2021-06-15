package testCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.SimpleDoc;

import org.w3c.dom.ls.LSInput;

import model.Employee;

public class main {

	public static void main(String[] args) {
		/*
		 * System.out.println(Math.ceil(-82.4)); System.out.println(Math.pow(-6, 2));
		 * 
		 * 
		 * int[] a1 = {1,2,3}; int[] a2 = {4,5,6,7}; System.arraycopy(a1, 0, a2, 0,
		 * a1.length); for (int i = 0; i < a2.length; i++) { System.out.println(a2[i]);
		 * }
		 */
	}

	static double division(int x, int y) {
		return x / y;
	}

	static String[] pressingButtons(String buttons) {

		HashMap<Character, char[]> dict = new HashMap<Character, char[]>();
		dict.put('2', new char[] { 'a', 'b', 'c' });
		dict.put('3', new char[] { 'd', 'e', 'f' });
		dict.put('4', new char[] { 'g', 'h', 'i' });
		dict.put('5', new char[] { 'j', 'k', 'l' });
		dict.put('6', new char[] { 'm', 'n', 'o' });
		dict.put('7', new char[] { 'p', 'q', 'r', 's' });
		dict.put('8', new char[] { 't', 'u', 'v' });
		dict.put('9', new char[] { 'w', 'x', 'y', 'z' });

		List<String> result = new ArrayList<String>();

		if (buttons == null || buttons.length() == 0) {
			return new String[0];
		}
		char[] arr = new char[buttons.length()];

		helper(buttons, 0, dict, result, arr);
		String[] resultfinal = new String[result.size()];
		int coutn = 0;
		for (String c : result) {
			resultfinal[coutn] = c;
			coutn++;

		}
		return resultfinal;
	}
	
	
	
	

	private static void helper(String digits, int index, HashMap<Character, char[]> dict, List<String> result,
			char[] arr) {
		if (index == digits.length()) {
			result.add(new String(arr));
			return;
		}

		char number = digits.charAt(index);
		char[] candidates = dict.get(number);
		for (int i = 0; i < candidates.length; i++) {
			arr[index] = candidates[i];
			helper(digits, index + 1, dict, result, arr);
		}
	}

	static int kthLargestElement(int[] nums, int k) {
		Arrays.sort(nums);
		return nums[nums.length - k];
	}

	static boolean symbolsPermutation(String word1, String word2) {
		boolean b = false;
		if (word1.length() != word2.length()) {
			return false;
		}

		char tempArray1[] = word1.toCharArray();
		char tempArray2[] = word2.toCharArray();

		Arrays.sort(tempArray1);
		Arrays.sort(tempArray2);

		String t1 = new String(tempArray1);
		String t2 = new String(tempArray2);

		b = t1.equals(t2) ? true : false;

		return b;

	}
	
	public static int CoinsInMaze(int N,int M,int Maze[][]){
        int result =-404;
        int count = Maze[0][0];
		count += coinsrecursive(N, M, Maze, 0, 0, count);
        //write your Logic here:

        
        return result;
    }
	
	
	public static int coinsrecursive(int N,int M,int Maze[][], int postN,int postM, int count){
	//	for (int i = postN; i < N; i++) {
		//	for (int j = postM; j < M; j++) {
				if (Maze[postN + 1][postM] > Maze[postN][postM + 1]) {
					count += Maze[postN + 1][postM];
					count += coinsrecursive(N, M, Maze, postN + 1, postM , count); 
				} else {
					count += Maze[postN][postM + 1];
					count += coinsrecursive(N, M, Maze, postN , postM + 1 , count);
				}
		//	}
	//	}
		return count;
	}
	
	int[] mutateTheArray(int n, int[] a) {
		int[] b =  new int[n];
		for (int i = 0; i < n; i++){
		    //ArrayIndexOutOfBoundsException.
		    b[i] = ((i - 1) < 0 ? 0: a[i - 1]) + a[i] + ((i + 1) > n-1 ? 0 :a[i + 1]);
		}
		return b;
		}
	
	int countTinyPairs(int[] a, int[] b, int k) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			String tiny = String.valueOf(a[i]) + String.valueOf(b[a.length -1 - i]);
			int t = Integer.valueOf(tiny);
			if (k > t) {
				count++;
			}
		}
		return count;
	}

	
	
	static String mergeStrings(String s1, String s2) {
		String result = "";
		int len =(s1.length() > s2.length()?s1.length():s2.length());
		for (int i = 0; i < len; i++) {
			Character cs1; 
			if (i < s1.length()) {
				cs1 = s1.charAt(i);	
			} else {
				cs1 = 'z';

			}
			Character cs2 ;
			if (i < s2.length()) {
				cs2 = s2.charAt(i);	
			} else {
				cs2 = 'z';

			}			 
			if (cs1.isMirrored(cs2)) {
				result += cs1; 
			} else {
				result += cs2;
			}
			
		}
		return result;
		
		
	}
	

}
