package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
	
		int eid;
		
		String ename;
		
		int esalary;

		public Employee(int eid, String ename, int esalary) {
			super();
			this.eid = eid;
			this.ename = ename;
			this.esalary = esalary;
		}

		@Override
		public String toString() {
			return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
		}		
	
}


	public class SerializationDemo {
	
		public static void main(String[] args) throws IOException, ClassNotFoundException {
			
			Employee e1 = new Employee(101, "Sandeep", 50000);
			
			System.out.println("Employee ID --> "+e1.eid+" Employee Name --> "+e1.ename+" Employee Salary --> "+e1.esalary);
			
			File f1 = new File("acb.txt");
			
			f1.createNewFile();
			
			System.out.println("\n"+f1.exists());
			
			System.out.println("\nObject Serialization Started....");
			
			FileOutputStream fos = new FileOutputStream(f1);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(e1);
			
			System.out.println("\nObject De-serialization Started....");
			
			
			FileInputStream fis = new FileInputStream(f1);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Employee e2 = (Employee) ois.readObject();
			
			System.out.println("\nObject Serialization and De-serialization Completed....");
			
			System.out.println("\nEmployee ID --> "+e1.eid+" Employee Name --> "+e1.ename+" Employee Salary --> "+e1.esalary);
		}
	
	}
