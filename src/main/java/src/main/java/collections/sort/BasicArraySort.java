package src.main.java.collections.sort;

import java.util.Arrays;

public class BasicArraySort {

	public static void main(String[] args){
		String[] animals = new String[4];
		animals[0] = "Rat";
		animals[1] = "Dog";
		animals[2] = "Cat";
		animals[3] = "Mouse";
		
		for(int i=0;i<4;i++){
			System.out.println(animals[i]);
		}
		
		Arrays.sort(animals);
		
		for(int i=0;i<4;i++){
			System.out.println(animals[i]);
		}
		
		
	}
}
