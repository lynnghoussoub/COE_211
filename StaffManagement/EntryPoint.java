import java.util.Scanner;
public class EntryPoint{
	public static void main (String []args){
	Scanner scan= new Scanner (System.in);
	System.out.println ("Please input the employee's first name: ");
	String first= scan.nextLine();
	System.out.println("Please input the employee's last name:");
	String last= scan.nextLine();
	System.out.println("Please input the employee's age:");
	int  age=scan.nextInt();
	System.out.println("Please input the employee's monthly salary:");
	double salary=scan.nextDouble();
	
	Employee emp= new Employee(first, last, age, salary);

	System.out.println("Employee information:" + emp.FirstName + " " + emp.LastName  + ", " + emp.age + ", " + emp.MonthlySalary);
}
}
	

