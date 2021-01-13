package ExceptionsPrac;

public class Test {

	public static void main(String ...args) {
		
		int num1, num2, result;
		
		num1 = 10;
		num2 = 0;
		
		try {
			result = num1 / num2;
			System.out.println("Result: " + result); //leads to arithmetic exception, 'division by zero' exception
		}catch(ArithmeticException e){
			e.printStackTrace();
		}
		
		System.out.println("Ending program process...");
		
	}
	
}
