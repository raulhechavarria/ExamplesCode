package DifferenceBetweenfinalfinallyAndfinalize;

class FinallyExample {

	public static void main(String[] args) {
		int i = methotest();
		System.out.println("end execution with " + i);
	}

	private static int methotest() {
		try {
			int x = 300;
			return x;
		} catch (Exception e) {
			System.out.println(e);
			return -1;
		} finally {
			//por lqqd simepre y  simepre se ejecuta  el finally
			System.out.println("finally block is executed");
			return 1;
		}

	}
}
