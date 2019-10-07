package designPattern.singleton;

public class SingletonSample {
	private static SingletonSample instance = null;
	public static String testStatic;
	public String testinst; 

	   private SingletonSample() {
	   }

	   public static SingletonSample getInstance() {
	      if(instance == null) {
	         instance = new SingletonSample();
	      }
	      return instance;
	   }
}
