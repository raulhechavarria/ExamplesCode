package designPattern.template.method;

public abstract class Animal {
	public abstract void makeSound();

	public abstract void eatFood();

	public abstract void sleep();

	public void doEveryday() {
		makeSound();
		eatFood();
		sleep();
	}

	/* TEMPLATE METHOD This pattern defines a skeleton in a method for a operation. It is very useful when your have common method calls but different behaviors. This pattern is totally based in
	 * polymorphism. */
}
