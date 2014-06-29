package src.main.java.collections.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BasicCollectionSort {

	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();
		
		myList.add("Zebra");
		myList.add("Dog");
		myList.add("Elephant");
		myList.add("Cat");
		
		for(String animal:myList){
			System.out.println(animal);			
		}
		
		Collections.sort(myList);
		
		for(String animal:myList){
			System.out.println(animal);			
		}
		
		
		
		
	}

}
