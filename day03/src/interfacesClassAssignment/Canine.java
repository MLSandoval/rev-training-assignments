package interfacesClassAssignment;

public abstract class Canine implements Animal {
	
	String preferredFood = "New York style pizza";
	
	public void makeCanineSound() {
		System.out.println("Hm, yes, I am a dog, indubitably.");
	}
	
	abstract public void declareCaninePreferredFood();
}
