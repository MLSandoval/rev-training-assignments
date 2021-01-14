package serializableDemo;
import java.io.*;

public class MyClass implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String s;
	int i;
	double d;
	
	public MyClass(String s, int i, double d) {
		this.s = s;
		this.i = i;
		this.d = d;
	}
	public String toString() {
		return "s=" + s + "; i=" + i + "; d=" + d;
	}
}
