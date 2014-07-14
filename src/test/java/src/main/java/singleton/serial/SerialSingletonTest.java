package src.main.java.singleton.serial;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import org.junit.Test;

import src.main.java.singleton.SerialSingleton;

public class SerialSingletonTest {

	@Test
	public void test() throws FileNotFoundException, IOException, ClassNotFoundException {
		SerialSingleton instance = SerialSingleton.getInstance();
		
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("Test.txt"));
		
		out.writeObject(instance);
		
		out.close();
		
		ObjectInput in  = new ObjectInputStream(new FileInputStream("Test.txt"));
		SerialSingleton instance2 = (SerialSingleton) in.readObject();

		in.close();
		
		System.out.println(String.format("%s : hascode instance  1", instance.hashCode()));
		System.out.println(String.format("%s : hascode instance  2", instance2.hashCode()));
		
		assertNotEquals(instance, instance2);
	}

}
