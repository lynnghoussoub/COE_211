import java.util.Scanner;
public class GradesAggregator{
	public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	int[] grades= new int[5];
	int sum=0;
	
		for(int idx = 0; idx <grades.length; idx++) {
			System.out.println("Input the grade of assignment " + (idx+1));
			grades[idx] = scan.nextInt();
			sum+=grades[idx];

		}
	
		System.out.println("Input the number of attended labs");
		int attendances= scan.nextInt();
		
		System.out.println("Input the midterm grade");
		int midterm=scan.nextInt();


		System.out.println("Assignments(30%): " + (sum*0.3)/5 +"\nAttendance(5%): " + (attendances*100*0.05/7) + "\nMidterm(30%): " + (midterm*0.3));

	}
}