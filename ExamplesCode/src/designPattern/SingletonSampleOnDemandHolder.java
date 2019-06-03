package designPattern;

public class SingletonSampleOnDemandHolder {
	private SingletonSampleOnDemandHolder() {
    }

    public static SingletonSampleOnDemandHolder getInstance() {
        return SingletonSampleHolder.INSTANCE;
    }

    private static class SingletonSampleHolder {
        private static final SingletonSampleOnDemandHolder INSTANCE = new SingletonSampleOnDemandHolder();
    }
}
