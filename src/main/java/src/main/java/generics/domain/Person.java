package src.main.java.generics.domain;

import java.util.Comparator;
import java.util.Date;

public class Person implements Comparable<Person>, Comparator<Person>{

	private String firstName;
	private String lastName;
	private Date dob;
	private int age;
	
	public Person(){
		
	}
	
	public Person(String firstName, String lastname, Date dob, int age){
		this.firstName = firstName;
		this.lastName = lastname;
		this.dob =dob;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	

	public int compareTo(Person personToCompare) {
		// This will sort on age
		
		return this.age - personToCompare.getAge();
		
	}

	public int compare(Person person1, Person person2) {
		return person1.getFirstName().compareToIgnoreCase(person2.getFirstName());			
	}

	
}
