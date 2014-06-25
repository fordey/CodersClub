package src.main.java.collections.conversion;

import java.util.ArrayList;
import java.util.List;

public class TestCollectionsConversion {

	//example of potential problems with converting Lists.
	
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		//example 1. addall method
		List<String> stringList = new ArrayList<String>();
		stringList.add("Eddie");
		stringList.add("Damo");
		
		@SuppressWarnings("rawtypes")
		List eddieList = new ArrayList();
		eddieList.add("paula");
		eddieList.add(100);
		
		eddieList.addAll(stringList);
		
		stringList.addAll(eddieList);
		
		for(String str:stringList){
			System.out.println(str);
		}
		
		
			
		//example 2. constructor conversion.
		
		//this wont compile good!! two typed lists
		/*List<String> myStringList = new ArrayList<String>();
		
		myStringList.add("test");
		myStringList.add("test1");
		
		List<Integer> myIntegerList = new ArrayList<Integer>(myStringList);*/
		
		
		//This will compile but will throw runtime exceptions!!
		@SuppressWarnings("rawtypes")
		List myStringList2 = new ArrayList();
		
		myStringList2.add("test");
		myStringList2.add("test1");
		
		List<Integer> myIntegerList2 = new ArrayList<Integer>(myStringList2);
		
		for(Integer myInt:myIntegerList2){
			System.out.println(myInt);
		}
		

	}

}
