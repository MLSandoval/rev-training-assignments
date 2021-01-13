package constructorDemo;

public class MainClass {

	public static void main(String [] args) {
		
		ConstructorDemo obj = new ConstructorDemo();
		
		System.out.println("ConstructorDemo obj: ");
		System.out.println(obj);
		System.out.println("");
		
		SubClass sub = new SubClass();
		System.out.println("");
		
		SubClass sub2 = new SubClass(3); //calls SubClass and SuperClass constructor becuase there is the super(); call in the subclass constructor, and subclass extends super class
		System.out.println("");
	}
}
