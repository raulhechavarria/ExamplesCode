package amazon;

public class Palindrome {

	static boolean isPalindrome(String str) {
		Long long1;
		// Pointers pointing to the beginning
		// and the end of the string
		int i = 0, j = str.length() - 1;

		// While there are characters toc compare
		while (i < j) {

			// If there is a mismatch
			if (str.charAt(i) != str.charAt(j))
				return false;

			// Increment first pointer and
			// decrement the other
			i++;
			j--;
		}

		// Given string is a palindrome
		return true;
	}

	private  void writeObject(java.io.ObjectInputStream inputStream) {
	// Integer integer = new Integer();	
	}
	
	// Driver code
	static public  void main(String args[]) {
		String str = "geeks";

		if (isPalindrome(str))
			System.out.print("Yes");
		else
			System.out.print("No");
	}

}
