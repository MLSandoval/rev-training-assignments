package ioDemo;
import java.util.*;
import java.io.*;

public class IOMain {

	public static void main(String []args) {
		
	}
	
	public void byteStreamMethod() throws Exception {
		FileInputStream in = null;
		FileOutputStream out = null;
		
		
			
		
		
		try {
			in = new FileInputStream("xanadu.txt"); //assumes there is xanadu.txt file in the same directory
			out = new FileOutputStream("outagain.txt");
			
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
               