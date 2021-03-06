package com.revature.day02.statics;
import static java.lang.Math.PI; // importing a final/constant variable

public class StudentManager {
	
	static public int objCount = 0;
	
	public static void main(String []args) {
		Student s1 = new Student(1, "Miky"); //these 2 students will be created in the heap, each with own location
		System.out.println(objCount);
		Student s2 = new Student(2, "Maky"); //however, all students go to same uni, so they will all share the same static variable
		System.out.println(objCount);
		Student s3 = new Student(3, "Moky");
		System.out.println(objCount);
		
		
		int radius = 10;
		System.out.println(Math.PI*radius*radius);//PI all uppercase because it is a final (constant) variable
		
		
//		System.out.println(s1+" "+ s1.universityName);
//		System.out.println(s2+" "+ s1.universityName);
//		
//		s1.universityName = "UCB";
//		
//		System.out.println(s1+" "+ s1.universityName);
//		System.out.println(s2+" "+ s1.universityName);
//		
//		System.out.println(Student.universityName);//this is the preferred way to access the class variable (static variable) university name
		
//		int x = Integer.parseInt(args[0]);//these are static members of the 
//		float y = Float.parseFloat("10");
		
	}
	
	public int getObjCount(){
		return this.objCount;
	}
	
	public static void incObjCount(){
		objCount++;
	}
}
