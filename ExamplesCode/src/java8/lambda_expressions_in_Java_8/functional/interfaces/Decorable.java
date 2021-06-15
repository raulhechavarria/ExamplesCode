package java8.lambda_expressions_in_Java_8.functional.interfaces;

@FunctionalInterface
public interface Decorable {
	// one abstract method
	void decorateWithCurtains();
	
//	int decorateWithCurtains1();
	
	default void decoratortest() {
		System.out.println("test");
	};
	
	default String doSomething() {
		System.out.println("do domething");
		return "do domething";
	}


	// default method
	
	  default void decorateWithPaints() {
	  System.out.println("Decorating using paints"); }
	 

	// Overriding method of java.lang.Object
	@Override
	public int hashCode();

}
