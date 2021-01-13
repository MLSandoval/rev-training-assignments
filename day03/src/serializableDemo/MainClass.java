package serializableDemo;
import java.io.*;

public class MainClass implements Serializable {
	
	String s;
	int i;
	double d;
	
	public MainClass(String s, int i, double d) {
		this.s = s;
		this.i = i;
		this.d = d;
	}
	public String toString() {
		return "s=" + s + "; i=" + i + "; d=" + d;
	}
}
