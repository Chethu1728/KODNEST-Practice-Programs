package RaiseToThePowerOfDigits;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		Power p=new Power();
		p.solve(num);
	}

}
