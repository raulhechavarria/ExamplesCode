package HackerRank;

public class CountingValleys {

	public static void main(String[] args) {
		int steps = 8;
		String path = "UDDDUDUU";
		System.out.print(countingValleys(steps, path));
	}
	
	public static int countingValleys(int steps, String path) {
		Integer level = 0, valley = 0;
		for (int i = 0; i < steps; i++) {
			if (path.charAt(i) == 'U') {
				level++;
				if (level == 0) {
					valley++;
				}
			} else {
				level--;

			}
		}
		return valley;
	}

}
