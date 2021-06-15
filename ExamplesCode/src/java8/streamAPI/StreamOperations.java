package java8.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import aop.EmployeeDTO;

public class StreamOperations {
	public static void main(String[] args) {
		List<String> stringList = Arrays.asList("John", "Martin", "Mary", "Steve");
		stringList.stream().map((s) -> s.toUpperCase()).forEach(System.out::println);

	//	Stream streamArray = Stream.of("X", "Y", "Z");
		
		

	//	Stream<Integer> intStream = Stream.generate(() -> 1).limit(5);
	//	intStream.forEach(System.out::println);
		// Output
		// 1
		// 1
		// 1
		// 1
		// 1

		Stream<Integer> intStream1 = Stream.iterate(100, n -> n + 1).limit(5);
		intStream1.forEach(System.out::println);
		// Output
		// 100
		// 101
		// 102
		// 103
		// 104

		Stream<String> nameStream = Stream.of("mohan", "john", "vaibhav", "amit", "jamina");
		Stream<String> nameStartJ = nameStream.map(String::toUpperCase).peek(e -> System.out.println(e))
				.filter(s -> s.startsWith("J"));
		// nameStartJ.forEach(System.out::println);
		System.out.println("Calling terminal operation: count");
		long count = nameStartJ.count();
		System.out.println("Count: " + count);

		// Output
		// Calling terminal operation: count
		// MOHAN
		// JOHN
		// VAIBHAV
		// AMIT
		// Count: 1

		Stream<String> nameStream1 = Stream.of("mohan", "john", "jvaibhav", "amit");
		Stream<String> nameStartJ1 = nameStream1.map((s) -> {
			System.out.println("Map: " + s);
			return s.toUpperCase();

		}).filter((s) -> {
			System.out.println("Filter: " + s);
			return s.startsWith("J");
		});

		Optional<String> findAny = nameStartJ1.findAny();
		System.out.println("Final output: " + findAny.get());

	}
}
