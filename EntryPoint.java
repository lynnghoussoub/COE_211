import java.util.Scanner;

public class EntryPoint {
    public static void main (String[] args) {
    int input;
    BasicWeek basic= new BasicWeek();
    AdvancedWeek advanced= new AdvancedWeek();
    Calculator calc= new Calculator();
    Scanner scan= new Scanner(System.in);
    System.out.println("Which service would you like to use?");
    System.out.println("[1] : Basic week visualizer" + "\n" + " [2]: Advanced week visualizer" + "\n" + " [3]: Basic calculator" + "\n" + " [4]: Employee repertoire");
	 
    input= scan.nextInt();
    if (input == 1){
	basic.printDays();
}


    if (input==2){
	advanced.printDays();
}

    if (input==3){
	 Calculator calc= new Calculator();



    }
}