package designPattern.creational.singleton;

import java.util.ArrayList;
import java.util.List;

public class SingletonSample {
	private static SingletonSample instance = null;
	public static String testStatic;
	public String testinst; 

	   private SingletonSample() {
		   
		   List<String> temp = new ArrayList<>();
		   temp.stream().unordered(); 
		   
		   
		   
	   }
	   
	   

	   public static SingletonSample getInstance() {
	      if(instance == null) {
	         instance = new SingletonSample();
	      }
	      return instance;
	   }
	   
	   
	   
}
