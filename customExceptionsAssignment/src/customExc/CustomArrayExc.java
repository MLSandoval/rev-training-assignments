package customExc;

public class CustomArrayExc extends ArrayIndexOutOfBoundsException {
	
	CustomArrayExc(String s){
		super(s);
	}
	public String getMessage(String s){
		
		return s + " #### You picked an item which does not exist within the collection.";
	}
	
	
}
