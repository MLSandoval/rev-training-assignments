package interfacesClassAssignment;

public class MainClass {

	public static void main(String [] args) {
		
		Canine dog1 = new Malinois();
		Feline cat1 = new Bengal();
		
		System.out.println("Dog is extinct? "+ !Animal.isExtant);
		System.out.println("Cat is extinct? "+ !Animal.isExtant);
		System.out.println("");
		
		dog1.declareCaninePreferredFood();
		cat1.declareFelinePreferredFood();
		System.out.println("");
		
		dog1.eatPreferredFood();
		cat1.eatPreferredFood();
		System.out.println("");
		
//		System.out.println("dog1 breed: "+ dog1.breed);  these fields cannot be resolved because breed 
//		System.out.println("cat1 breed: "+ cat1.breed);  is a variable of the subclasses, where dog1 and cat1 are of 
//														 the super types canine and feline, which does not contain the breed variable
		dog1.makeCanineSound();
		cat1.makeFelineSound();
		
	}
}
