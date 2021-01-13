package interfacesClassAssignment;

public class Malinois extends Canine {

	public String breed = "Malinois";

	public void declareCaninePreferredFood() {
		System.out.println("It is well documented that dogs prefer "+this.preferredFood);
	}
	
	public void eatPreferredFood() {
		System.out.println("The dog folds a slice of " +this.preferredFood+", and eats while walking");
	}
}
