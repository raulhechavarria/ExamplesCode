package testCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.aspectj.weaver.patterns.HasThisTypePatternTriedToSneakInSomeGenericOrParameterizedTypePatternMatchingStuffAnywhereVisitor;

public class mainClassJPMO {

	public static void main(String[] args) {

		List<Integer> num = new ArrayList<>();
		
		

		// HashMap<Integer, Integer> result = num.stream().
			
		//log(n^2); 
		
		Integer result = null;
		for (int i = 0; i < num.size() - 1; i++) {
			
			Integer integer = num.get(i);

			for (int j = i + 1; j < num.size(); j++) {

				Integer integer2 = num.get(j);
				if (integer == integer2) {
					result = integer;
					System.out.print(result);
				}
			}

		}
		
		if (result == null) {
			System.out.print("");	
		}
		
		
		
		
		
		

		// @formatter:on

	}

}
