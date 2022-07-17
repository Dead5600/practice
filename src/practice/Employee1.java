package practice;

import java.util.Scanner;



public class Employee1 {
	    String firstName;
	    String lastName;
	    String city;
        long mobileNumber;
	    static String Country="India";
	    
	    
	    public Employee1() {
			   getUserInput();
		}
	    
	    
	    public void getUserInput() {
		Scanner sc=new Scanner(System.in) ;
		System.out.println("\n\n");
		System.out.println("Enter The First Name Of Employee :");
		String s1 =sc.next();
		if(s1.equals("null")) throw new NullPointerException();
		System.out.println("Enter The last Name Of Employee :");
		String s2= sc.next();
		if(s1.equals("null")) throw new NullPointerException();
		System.out.println("Enter The City Name Of Employee :");
		String s3 = sc.next();
		if(s1.equals("null")) throw new NullPointerException();
		System.out.println("Enter The Mobile No. Of Employee :");
		firstName= s1;
		lastName=s2;
		city=s3;
		mobileNumber=sc.nextLong();
		
				
}
	 	void display() {
	 	 System.out.println("\n\n");
         System.out.println("First name of Employee : --------> "+firstName);
         System.out.println("Last name of Employee : --------> "+lastName);
         System.out.println("City name of Employee : --------> "+city);
         System.out.println("Mobile Number of Employee  : --------> "+mobileNumber);
         System.out.println("Country of the Employee  : --------> "+Country);
	 }
			  
	public static void main(String[] args) {
		
		Employee1 e1=new Employee1();
		e1.display();
		
		Employee1 e2=new Employee1();	
		e2.display();
      
	}

}
