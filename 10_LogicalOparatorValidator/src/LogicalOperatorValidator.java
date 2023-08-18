import java.util.Scanner;

public class LogicalOperatorValidator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("Is input valid:");
		boolean input=scan.nextBoolean();
		System.out.print("Does input meet a certain condition (true/false):");
		boolean condition=scan.nextBoolean();
		boolean res=isValidInput(input,condition);
		if(res==true) {
			System.out.println("Input is valid");
		}
		else {
			System.out.println("Input is not valid");
		}
	}
	public static boolean isValidInput(boolean input,boolean condition) {
		return(input&&condition);
	}

}
