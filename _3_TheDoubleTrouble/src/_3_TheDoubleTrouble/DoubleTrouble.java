package _3_TheDoubleTrouble;

import java.util.Scanner;

public class DoubleTrouble {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println(" enter the num to be doubled");
		int num=scan.nextInt();
		System.out.println(doubleTheNumber(num));
	}
	public static int doubleTheNumber(int num) {
		return  2*num;
	}
}
