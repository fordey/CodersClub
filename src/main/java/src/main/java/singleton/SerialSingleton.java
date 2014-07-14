package src.main.java.singleton;

import java.io.Serializable;

public class SerialSingleton implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private SerialSingleton() {}
	
	private static class SerialSingletonHelper{
		private static final SerialSingleton instance = new SerialSingleton();
	}
	
	public static SerialSingleton getInstance(){
		return SerialSingletonHelper.instance; 
	}

	public void doSomething(){
		System.out.println("doing something");
	}
	
	
	//comment back in to show how this solves the problem of serialisable singetons
	/*protected Object readResolve(){
		return getInstance();
	}*/
}
