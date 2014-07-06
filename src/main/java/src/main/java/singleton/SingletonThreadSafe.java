package src.main.java.singleton;

public class SingletonThreadSafe {
	
	private static SingletonThreadSafe instance;
	
	private SingletonThreadSafe(){}
	
	public static synchronized SingletonThreadSafe getInstance(){
		if (instance == null)
			instance = new SingletonThreadSafe();
		
		return instance;
		
	}
	
	
	//this method will reduce overhead of synchronised method.. synchonised moved
	//into if statement, also a check to ensure that only one object exists.
	
	public static SingletonThreadSafe getInstanceDoubleLocking(){
		
		if(instance == null){
			synchronized (SingletonThreadSafe.class) {
				if (instance == null){
					instance = new SingletonThreadSafe();
				}
				
			}
		}
		
		return instance;
	}
	
}
