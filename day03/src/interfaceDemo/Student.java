package interfaceDemo;

public class Student extends Person implements First,Second {

	public void sayHello() {
		System.out.println("Hello Hello Student, abstract method from person overriden in Student");
	}
	
	public void method1() {
		System.out.println("Student method1, required to be implemented as student implements the 'First' interface");
	}
	
	public void method2() {
		System.out.println("Student method2, required to be implemented as student implements the 'Second' interface");
	}
}
