package readWriteEmployees;
import java.io.*;

public class Employee implements Serializable {

	private String name;
	private int id;
	private int salary;
	private String title;
	
	Employee(String name, int id, String title, int salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.title = title;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
}
