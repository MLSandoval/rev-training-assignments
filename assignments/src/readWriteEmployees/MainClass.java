package readWriteEmployees;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass {

	public static void main(String []args) throws IOException{
		
		readWriteEmployee("employees.txt", "employeesCopy.txt");
		
	}
	
	
	
	
	
	protected static void readWriteEmployee(String readFilePath, String writeFilePath) throws FileNotFoundException, IOException  {
		
		BufferedReader inputStream = null;
        BufferedWriter outputStream = null;
        
        try {
            inputStream = new BufferedReader(new FileReader(readFilePath));
            outputStream = new BufferedWriter(new FileWriter(writeFilePath));
            String l;
            while ((l = inputStream.readLine()) != null) {
            	
            	String[] splitLine = l.split(":");
            	
            	Employee emp = new Employee(splitLine[0], Integer.parseInt(splitLine[1]), splitLine[2] , Integer.parseInt(splitLine[3]));
            			
                outputStream.write("Name: "+emp.getName()+"\nID:"+Integer.toString(emp.getId())+"\nTitle: "+emp.getTitle()+"\nSalary: "+Integer.toString(emp.getSalary()));
                outputStream.write("\n");
                
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
	}
}
