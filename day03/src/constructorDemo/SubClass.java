package constructorDemo;

public class SubClass extends SuperClass {

	private int y;
	
	public SubClass() {
		super();
		System.out.println("Default Constructor SubClass.");
	}
	
	public SubClass(int y) {
		super();
		this.y = y;
		System.out.println("Parameterized Constructor SubClass.");
	}
}
