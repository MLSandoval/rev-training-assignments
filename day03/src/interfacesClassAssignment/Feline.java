package interfacesClassAssignment;

public abstract class Feline implements Animal {
	
	String preferredFood = "ice cream";
	
	public void makeFelineSound() {
		System.out.println("Schrodinger has nothing on me.");
	}
	
	abstract public void  declareFelinePreferredFood();
}
