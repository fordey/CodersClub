package src.main.java.singleton.reflection;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;

import org.junit.Test;

import src.main.java.singleton.EagerSingleton;

public class ReflectionTest {

	@SuppressWarnings("rawtypes")
	@Test
	public void test() {
		EagerSingleton instance = EagerSingleton.getInstance();
		EagerSingleton instance2 = null;
		Constructor[] constructors = EagerSingleton.class.getDeclaredConstructors();
		try{
				for(Constructor constructor: constructors){
					constructor.setAccessible(true);
			
					instance2 = (EagerSingleton) constructor.newInstance();
				}
		}catch(Exception e){
			e.printStackTrace();
		}

		System.out.println(String.format("Instance One hashcode %s", instance.hashCode()));
		System.out.println(String.format("Instance Two hashcode %s", instance2.hashCode()));
		
		assertNotEquals(instance, instance2);
	}

}
