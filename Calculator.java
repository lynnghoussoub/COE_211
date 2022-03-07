import java.util.Scanner;

public class Calculator {
    private int num1;
    private int num2;
    private String operator;

    // Constructor to initialize the calculator
    public Calculator() {}

        // Get user input
        Scanner scanCalc = new Scanner(System.in);
	System.out.println("Input the first number:");
	num1= scanCalc.nextInt();
	System.out.println("Input the operator");
	operator=scanCalc.nextLine();
	System.out.println("Input the second number:");
	num2=scanCalc.nextInt();

     	public String add ( int num1, int num2){
	return num1 + " + " + num2 + "=" + (num1+num2);
}

	public String subtract (int num1, int num2){
	return num1 + "-" + num2 + "=" + (num1-num2); 
}

	public String divide (int num1, int num2) {
	return num1 +"/" + num2 + "="  + (num1/num2); 
}

	public String multiply (int num1, int num2){
	return num1 +" x " + num2 + "=" + (num1*num2); 
}

        if (operator == "+" ) {
	add(int num1,int num2);
}
	if (operator == "-") {
	subtract(int num1, int num2);
}
	if (operator== "x") {
	multiply (int num1, int num2);
}
	if (operator== "/" ) {
	divide (int num1, int num2);
}
}
 	