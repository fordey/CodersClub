package src.main.java.singleton;

public class EagerStaticBlockSingleton {
	
	private static EagerStaticBlockSingleton instance;
	
	private EagerStaticBlockSingleton(){
		
	}
	
	//static block of code
	static{
		try{
			instance = new EagerStaticBlockSingleton();
		}catch(Exception e){
			throw new RuntimeException("Error initialising StaticBlockEagerSingleton");
		}
	}
	
	public static EagerStaticBlockSingleton getInstance(){
		return instance;
	}
	

}
