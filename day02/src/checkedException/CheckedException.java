package checkedException;
import java.io.*;

public class CheckedException {

	public static void main(String ...args) {
		File file = new File("./");
		
		FileInputStream reader = new FileInputStream(file);//checked exception, occurs during compilation, IDE can anticipate these
		
	}
	
	
	
}
