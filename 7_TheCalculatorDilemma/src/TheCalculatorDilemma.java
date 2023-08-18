import java.util.Scanner;

public class TheCalculatorDilemma {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the two numbers for the operations");
		int a=scan.nextInt();
		int b=scan.nextInt();
		TheCalculatorDilemaApp calc=new TheCalculatorDilemaApp();
		System.out.println("Enter 1 for Addition, 2 for Subtraction, 3 for Multiplication and 4 Division");
		int k=scan.nextInt();
		switch(k) {
		case 1:
			calc.add(a,b);
			break;
		case 2:
			calc.sub(a,b);
			break;
		case 3:
			calc.mul(a,b);
			break;
		case 4:
			calc.div(a, b);
			break;
			default:
				System.out.println("Choose the Number Between 1 to 4 only to perform any Arithmatic Operations");
			
		}
	}

}
