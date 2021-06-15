package designPattern.creational.singleton;

public class SinglentonMain {

	public static void main(String[] args) {
		/*
		 * SingletonSample sample = SingletonSample.getInstance(); sample.testStatic =
		 * "value static"; sample.testinst = "value not static"; SingletonSample sample2
		 * = SingletonSample.getInstance();
		 */
		
		int[] aaa = {1,2};
		int p = 0;
		for (int i = 0; i < aaa.length; i++) {
			p+=aaa[1];
		}
		//aaa.length;
		
		String a = "aa";
		String b = new String("aa");
		String c = a;
		
		System.out.print(a==b);
		System.out.print(a==c);
		System.out.print(b.equals(c));
		
		

	}

}
