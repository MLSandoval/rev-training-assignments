package exceptionAssignment;

public class CustomExcThrow {

	public static void main(String []...args) {
		throwArrExc();
	}
	
	public static void throwArrExc(){
		try {
			int[] intArr = {1,2,4};
			
			int num = intArr[5];
		}catch(CustomArrExcClass e) {
			System.out.println(e.getMessage());
		}
	}
}