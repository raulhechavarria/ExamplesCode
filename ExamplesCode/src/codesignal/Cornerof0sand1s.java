package codesignal;

import java.util.HashMap;

public class Cornerof0sand1s {

	public Cornerof0sand1s() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	int secondRightmostZeroBit(int n) {
		/*
		 * String x = ""; while(n > 0) { int a = n % 2; x = a + x; n = n / 2; }
		 * StringBuilder builder = new StringBuilder(); builder.append(x);
		 */
		HashMap<String, Integer> hashMap = new HashMap<>();
		
		return (int) Math.pow(2, new StringBuffer(Integer.toBinaryString(n)).reverse().toString().indexOf("0",
				new StringBuffer(Integer.toBinaryString(n)).reverse().toString().indexOf("0") + 1));
		
	}// n;

	

	int mirrorBits(int a) {
		String x = "";
		while (a > 0) {
			int n = a % 2;
			x = n + x;
			a = a / 2;
		}
		StringBuilder builder = new StringBuilder();
		builder.append(x);
		builder.reverse();

		return Integer.parseInt(builder.toString(), 2);
	}

}
