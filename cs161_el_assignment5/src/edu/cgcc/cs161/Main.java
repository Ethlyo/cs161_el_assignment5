package edu.cgcc.cs161;
//Header
//Program Name: Person Class Getters and Setters
//Author: Ethan Lyons
//Class: CS161
//Date: 2/10/2021
//Description: Created different types of attributes and methods as told to by the homework, which includes
// First Name, Last Name, Age (commented out for parts) and Birthdate, alongside groups of attributes.
import java.time.LocalDate;

public class Main {

	public static void main(String[] Args) {
		Person aa = new Person();
		aa.setFirstName("Ethan");
		aa.setLastName("Lyons");
		aa.changeBirthdate(LocalDate.parse("2003-03-14"));
		//aa.setAge(17); commented out because the modifier is commented out
		System.out.println(aa.getFullName());
		System.out.println(aa.getAll());	
	}
}
/*FOOTER
Ethan Lyons
Ethan, Lyons, 17
*/