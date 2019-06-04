package designPattern.chain.of.responsability;

import java.util.HashMap;
import java.util.Map;

public class ExampleCOR {

	public static void main(String[] args) {
		Chain chain = new Chain(new FirstCommand(), new SecondCommand());
		Map<String, Object> context = new HashMap<>();
		context.put("some parameter", "some value");
		chain.start(context);

	}
	// Now we can break our code into Commands and separate each logic in just one place. Also, we can reorganize as we want, making our code more decoupled, thus solving our complexity problem.

}
