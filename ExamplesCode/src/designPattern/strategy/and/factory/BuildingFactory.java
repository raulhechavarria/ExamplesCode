package designPattern.strategy.and.factory;

import java.util.HashMap;
import java.util.Map;

public class BuildingFactory {
	private static Map<String, Building> instances;

    static {
        instances = new HashMap<>();

        instances.put("house", new House());
        instances.put("edifice", new Edifice());
    }

    public static <T extends Building> T getBuilding(String type){
        return (T) instances.get(type); 
    }
}
