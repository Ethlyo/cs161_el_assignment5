package edu.cgcc.cs161;

import java.time.LocalDate;
import java.time.Period;

public class Person {
	//fields
	private String firstName;
	private String lastName;
	private int age;
	private LocalDate birthdate;
	//constructors

	//operation
	public String getFirstName() { //getter first name
			return firstName;
	}
	public void setFirstName(String a) { //setter first name
		if(a.matches("^[a-zA-Z]*$") && a != null && !a.isEmpty()) {
			firstName = a;
		}
		else {
			System.out.println("please use only a-z or A-Z for first names");
		}
		
	}
	public String getLastName() { //getter last name
		return lastName;
	}
	public void setLastName(String b) { //setter last name
		if(b.matches("^[a-zA-Z]*$") && b != null && !b.isEmpty()) {
			lastName = b;
		}
		else {
			System.out.println("please use only a-z or A-Z for last names");
		}
	}
	public int getAge() { //getter age
		return age;
	}
	/*public void setAge(int c) { //setter age, commented out due to instructions
		if( 0 < c && c < 125) {
			age = c;
		}
		else {
			System.out.println("please use only numbers between 0 and 125");   
		}
	}*/
	
	public String getFullName() { //get full name string
		return firstName + " " + lastName;
	}
	public String getAll() { //get all string
		return firstName + ", " + lastName + ", " + age;
	}
	//note, I didn't include the changeAll one as it implicates calling a commented out method (age). I could use the changeBirthdate method, but I don't think you want that.
	public LocalDate getBirthdate() { //gets birthdate
		return birthdate;
	}
	public void changeBirthdate(LocalDate d) { //sets birthdate
		birthdate = d;
		age = calculateAge();
	}
	private int calculateAge() { //method for calculating age
		 return Period.between(birthdate, LocalDate.now()).getYears();
	}
}
