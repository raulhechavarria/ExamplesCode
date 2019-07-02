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

public class main {

	public static void main(String[] args) {
		/*int temp = 89;
		for (int i = 0; i < 1000; i++) {
			System.out.println(i);
		}
		
		System.out.println(division(15, -4));*/

	}

	static  double division(int x,int y){
		return x/y;
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

	private static void helper(String digits, int index, HashMap<Character, char[]> dict, List<String> result, char[] arr) {
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

}
