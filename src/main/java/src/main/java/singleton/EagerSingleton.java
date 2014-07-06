package src.main.java.singleton;

public class EagerSingleton {
	
	//private instance of class will be only instance.
	private static final EagerSingleton instance = new EagerSingleton();
	
	private EagerSingleton(){
		//private constructor to disallow clients from creating instances.
	}

	
	public static EagerSingleton getInstance(){
		return instance;
	}
}
