package designPattern.chain.of.responsability;

import java.util.Map;

public class FirstCommand implements Command<Map<String, Object>>{

	

	@Override
	public Boolean execute(Map<String, Object> context) {
		//doing something in here
		return null;
	}

}
