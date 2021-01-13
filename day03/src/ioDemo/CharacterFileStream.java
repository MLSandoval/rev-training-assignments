package ioDemo;
import java.io.*;

public class CharacterFileStream {

	public static void main(String[] args) throws IOException{
		
		FileInputStream in = null;
		FileOutputStream out = null;
		
		try {
			in = new FileInputStream("./deedee.txt");
			out = new FileOutputStream("./copyDeedee.txt");
			
			int c;
			while((c = in.read()) != -1) {
				out.write(c);
			}
		}finally {
			if(in != null) in.close();
			if(out != null) out.close();
		}
	}
}
