package com.revature.day01;
//
//public class StudentManager{
//	public static void main(String []args){
//		
//		Student s1 = new Student();
//		s1.displayData();
//		
//		int id = Integer.parseInt(args[0]);
//		String name = args[1];
//		
//		Student s2 = new Student(id, name);
//		
//		s2.displayData();
//	}
//}

public class StudentManager {
	public static void main(String[] args) {
		
		Student s1,s2,s3;
		
		s1 = new Student(); // Default Constructor
		s1.setId(100);
		s1.setName("Ryan");
		
		System.out.println("Id : "+s1.getId()+", Name : "+s1.getName());
		System.out.println("S1 Details : "+s1);
		
		int id = Integer.parseInt(args[0]);
		String name = args[1];
		
		s2 = new Student(id,name);
		
		System.out.println("Id : "+s2.getId()+", Name : "+s2.getName());
		
	}
}