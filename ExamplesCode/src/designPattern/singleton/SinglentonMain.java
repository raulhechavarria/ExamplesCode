package designPattern.singleton;

public class SinglentonMain {

	public static void main(String[] args) {
		SingletonSample sample = SingletonSample.getInstance();
		sample.testStatic = "value static";
		sample.testinst = "value not static";
		SingletonSample sample2 = SingletonSample.getInstance();

	}

}
