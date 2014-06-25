package src.main.java.generics.domain;

import java.util.Date;

public class Person {

	private String firstName;
	private String lastName;
	private Date dob;
	
	public Person(String firstName, String lastname, Date dob){
		this.firstName = firstName;
		this.lastName = lastname;
		this.dob =dob;
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
	
	
	
}
