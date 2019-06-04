package designPattern.chain.of.responsability;

import java.util.*;

public class Chain {

	public List<Command> commands;

	public Chain(Command... commands) {
		this.commands = Arrays.asList(commands);
	}

	public void start(Object context) {
		for (Command command : commands) {
			boolean shouldStop = command.execute(context);

			if (shouldStop) {
				return;
			}
		}
	}
}
