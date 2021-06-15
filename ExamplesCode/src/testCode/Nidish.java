package testCode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Nidish {

	public static void main(String[] args) {
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("Apple");
		strings.add("Oracle");
		strings.add("Apple");
		strings.add("Oracle");
		strings.add("Microsoft");
		strings.add("Microsoft");
		strings.add("Infosys");
		strings.add("Infosys");
		strings.add("Infosys");
		strings.add("Infosys");

		Map<String, Long> list = strings.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(list);
		
		Predicate<? super String> predicate = s->s.length() > 4;
		System.out.println(strings.stream().allMatch(predicate));
		
		System.out.println(strings.stream().filter(f->f.charAt(0) == 'M').collect(Collectors.toList()));
		
		System.out.println(strings.stream().filter(f->f.charAt(0) == 'M').findFirst());
		
		System.out.println(strings.stream().sorted().collect(Collectors.toList()));
		
		
		
		
		
	}

}
