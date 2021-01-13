package exceptionAssignment;

public class CustomArrExcClass extends ArrayIndexOutOfBoundsException {

	
	public String getMessage(Exception e){
		
		return "You picked an item which does not exist within the collection.";
	}
	
}
