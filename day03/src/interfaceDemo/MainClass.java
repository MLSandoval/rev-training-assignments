package interfaceDemo;

public class MainClass {

	
	public static void main(String []args) {
		
		//we want to instantiate a student and employee, they are persons, but we dont want to be able to instantiate a person
		Person s = new Student();
		Person e = new Employee();
		
		System.out.println("Student Person: ");
		System.out.println(s);
		
		System.out.println("Employee Person: ");
		System.out.println(e);
		
		s.sayHi();
		s.sayHello();
		
		e.sayHi();
		e.sayHello();
		
		//s.method1(); this method doesnt exist in s as s is of type person, and person does NOT implement the interfaces First or Second
		
	}
	
	
	
}
