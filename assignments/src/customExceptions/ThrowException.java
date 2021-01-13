package customExceptions;

import java.util.*;

public class ThrowException {
	
	public static void main(String []args) throws Exception{
		throwException();
		throwDuckedException();
	}
	
	public static void throwException(){
		try {
			System.out.println("Starting try block.");
			int ind = 7;
			int[] intArr = {1,2,4};
			
//			System.exit(0);
			
			if(ind < 0 || ind > intArr.length) {
				throw new ExtendedArrayException("Selected item is not within the collection.");
				
			}
			System.out.println("Ending try block.");
		}catch(ExtendedArrayException e) {
			System.out.println("Start catch block for custom exception.");
			System.out.println(e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Java API Array index exception.");
		}finally {
			System.out.println("Farewell, you are excepted successfully.");
		}
	}
	
	public static void throwDuckedException() throws Exception{
		
		System.out.println("Throw ducked exception method start.");
		
		try {
			throw new Exception();
		}finally {
			System.out.println("finally statement, Exception ducked, passed to main.");
		}
	}
}
