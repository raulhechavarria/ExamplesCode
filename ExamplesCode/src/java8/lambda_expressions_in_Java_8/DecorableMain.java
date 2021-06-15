package java8.lambda_expressions_in_Java_8;

import java8.lambda_expressions_in_Java_8.functional.interfaces.Decorable;

public class DecorableMain {

	public static void main(String[] args) {
		// Using lambada expression
				Decorable dec=()->{System.out.println("Decorating with curtains");};
				dec.decorateWithCurtains();
				dec.decorateWithPaints();

	}

}
