package foreach;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import designPattern.chain.of.responsability.Chain;

public class TestForEach {

	static List<String> list;
	
	public static void main(String[] args) {
		list = new ArrayList<>();
		list.add("pepe");
		
		
		
		
		
		
		for (Object obj : NullGuard.nullGuard(list)) {
			  System.out.println("somethis if the list is not null: " + obj);
			}
		 System.out.println("method finish");
		
	}

	

}
