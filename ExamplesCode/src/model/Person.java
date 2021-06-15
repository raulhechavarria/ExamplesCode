
package model;

import java.applet.*;

public class Person implements Comparable<Person> {

	String name;
	private String surname;
	Integer age;

	long tem = 234_23;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	static int pepe;

	public void naming() {

		System.out.println(128 >> 4);

	}

	@Override
	public int compareTo(Person o) {	 
		return o.age;
	}

}

class p extends Person {
	public p(String name, Integer age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public int pppp;
}

class p1 extends Person {
	public p1(String name, Integer age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// Person persona = new p(name, age);
		System.out.println(Math.ceil(-82.4));
		System.out.println(Math.pow(-6, 2));

	}
}
