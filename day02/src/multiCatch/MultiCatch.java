package multiCatch;

public class MultiCatch {
	
	public static void main(String ...args) {
		
		int num1, num2, result = 0;
		
		num1 = 10;
		num2 = 0;
		int[] myArr = new int [5];
		
		try{
			result = num1/num2; //will produce 
			myArr[10] = 100;
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
//		catch(ArithmeticException | ArrayIndexOutOfBounds e) //new form of using multiple exception handlers within one catch block using |
		
		System.out.println("Ending program process...");
	}
}
