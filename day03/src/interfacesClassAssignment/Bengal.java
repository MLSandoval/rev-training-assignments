package interfacesClassAssignment;

public class Bengal extends Feline {
	
	String breed = "Bengal";

	public void declareFelinePreferredFood() {
		System.out.println("All cats prefer to eat "+this.preferredFood);
	}
	
	public void eatPreferredFood() {
		System.out.println("The polydactyl cat is able to use a spoon, he takes a bite of " +this.preferredFood);
	}
}
