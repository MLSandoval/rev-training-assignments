package customExc;

public class ThrowCustomExc {

	public static void main(String []...args) {
		throwArrExc();
	}
	
	public static void throwArrExc(){
		try {
			
			int[] intArr = {1,2,4};
			
			int num = intArr[5];
			
		}catch(CustomArrayExc e) {
			System.out.println(e.getMessage());
		}
	}
}
