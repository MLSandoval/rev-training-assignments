package com.revature.day02.statics;

public class Student {
	private int id;
	private String name;
	public static String universityName = "UCLA";
	
	public Student() {
		super();
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
		StudentManager.incObjCount();
	}
}
