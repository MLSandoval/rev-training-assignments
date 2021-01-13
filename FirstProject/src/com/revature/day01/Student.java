package com.revature.day01;

import java.util.Date;

public class Student{
	
	private int id;
	private String name;
//	private Date dob;
	private String[] courses;
	
	public String[] getCourses() {
		return courses;
	}

	public void setCourses(String[] courses) {
		this.courses = courses;
	}

	public Student() {
		System.out.println("Default constructor invoked.");
	}
	
	public Student(int id,String name){
		System.out.println("Parameterized constructor invoked.");
		this.id=id;
		this.name=name;
//		this.dob=new Date();
	}

	public void displayData(){
//		System.out.println("ID : "+id+" , Name : "+name+" , DOB : "+dob);
		System.out.println("ID : "+id+" , Name : "+name);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override //annotation, special command via meta information regarding field or method
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
}