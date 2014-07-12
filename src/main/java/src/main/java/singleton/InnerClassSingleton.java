package src.main.java.singleton;

public class InnerClassSingleton {
	
	private InnerClassSingleton () {}
	
	private static class SingletonHelper{
		private static final InnerClassSingleton instance =
				new InnerClassSingleton();
	}
	
	private static InnerClassSingleton getInstance(){
		return SingletonHelper.instance;
	}

}
