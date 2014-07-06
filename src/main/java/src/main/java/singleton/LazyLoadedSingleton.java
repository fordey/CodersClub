package src.main.java.singleton;

public class LazyLoadedSingleton {
 
	private static LazyLoadedSingleton instance;
	
	private LazyLoadedSingleton(){}
	
	public static LazyLoadedSingleton getInstance(){
		if (instance== null)
			instance = new LazyLoadedSingleton();
		
		return instance;
	}
}
