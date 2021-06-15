package java8.lambda_expressions_in_Java_8;

public class Principal {

	@FunctionalInterface
	interface Matematicas {

		public double operacion(double x, double y);
	//	public void sum();

	}

	public static void main(String[] args) {

		Matematicas o = (x, y) -> x + y;
		System.out.println(o.operacion(2, 3));

	}
	
		void methodA(int a, int p) {
		  System.out.println("int");
		}
		void methodA(long a) {
		  System.out.println("long");
		}


		void methodA(Long a) {
		  System.out.println("Long");
		}
}
