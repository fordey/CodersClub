package src.main.java.collections.sort;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import src.main.java.generics.domain.Person;

public class ComparableSort {

	private static DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	
	public static void main(String[] args) throws ParseException {
		//note we are sorting a collection of Person objects
		//check the code for Person.. it now implements comparable
		//interface.
		
		List<Person> personList  = new ArrayList<Person>();
		personList.add(new Person("Peter", "Bloggs", format.parse("25/11/1975"), 39 ));
		personList.add(new Person("Colin", "Smith", format.parse("25/11/1985"), 29 ));
		
		for (Person p : personList){
			System.out.println(String.format("Name : %s Age : %s" , StringUtils.capitalize(p.getFirstName()),p.getAge()));
		}
		
		Collections.sort(personList);
		
		for (Person p : personList){
			System.out.println(String.format("Name : %s Age : %s" , StringUtils.capitalize(p.getFirstName()),p.getAge()));
		}
		
	}

}
