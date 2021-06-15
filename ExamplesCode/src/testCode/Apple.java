package testCode;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Apple  {

	

	private static void main(String[] args, String ter) {

		List<Integer> list = new ArrayList();
		
		Predicate<? super Integer> predicate = e -> e > 100;
		int count = 0; 
		Consumer<? super Integer> action = a ->{ } ;
		
		list.stream().filter(e -> e > 100).forEach(action  );
		
	}

	

}
