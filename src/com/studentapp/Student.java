package com.studentapp;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Student {
 
	String name;
	int age;
	String studentId;
	List<String> courses;
	public Student(String name, int age, String studentId) {
		super();
		if(validateAge(age) && validateName(name) & validateStudentId(studentId) ) 
		{
		this.name = name;
		this.age = age;
		this.studentId = studentId;
		courses = new ArrayList<String>(); //Intialization of Courses!!
	}
	}
	
	private boolean validateStudentId(String studentId2) {
		String studentIdRegex="S-\\d+$";
		Pattern studentIdPattern=Pattern.compile(studentIdRegex);
		Matcher studentIdMatcher=studentIdPattern.matcher(studentId2);
		if(studentIdMatcher.matches())
		{
			return true;
		}
		else {
			
			System.err.println("Invalid Student Id... Use the Format Eg:S-12345 ");
		}
		
		
		return false;
	}

	public void enrollCourse(String course)
	{
		courses.add(course);
		System.out.println("Student is enrolled to "+ course +" successfully!!");
	}
	 
	public void printStudentInfo()
	{
		System.out.println("========== Student Information ==========");
		System.out.println("Student Name: "+ name);
		System.out.println("Student Age: "+ age);
		System.out.println("Student Id: "+ studentId);
		System.out.println("Enrolled For: "+ courses);
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", studentId=" + studentId + ", courses=" + courses + "]";
	}
	
	//Validation Methods
	
	public boolean validateAge(int age)
	{
		if(age>=19 && age<=35)
		{
			return true;
		}
		else
		{
			System.err.println("Invalid age!!! Student Age needs to be between 19 and 35");
			return false;
		}
	}
	
	public boolean validateName(String name)
	{
		String nameRegex = "^[a-zA-Z\\s]+$";
		Pattern namePattern=Pattern.compile(nameRegex); //Creating the Regex pattern for name
		Matcher nameMatcher=namePattern.matcher(name); //check 'name' with Regex Name Pattern
		if(nameMatcher.matches())
		{
			return true;
		}
		else {
			System.err.println("Invalid Name!!! Please enter alphabets only");
			return false;

		}
		
	}
	
	
}
	 

