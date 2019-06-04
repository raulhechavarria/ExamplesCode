package designPattern.chain.of.responsability;

public interface Command<T> {
	
	Boolean execute(T context);

}
