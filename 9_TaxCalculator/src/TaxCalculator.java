import java.util.Scanner;

public class TaxCalculator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Purchase amount :");
		double purchaseAmount=scan.nextDouble();
		System.out.println("Enter the tax rate (in decimal form):");
		double taxRate=scan.nextDouble();
		double total=calculateTotalWithTax(purchaseAmount,taxRate);
		System.out.println("Total amount with Tax:"+total);
	}
	public static double calculateTotalWithTax(double purchaseAmount,double taxRate) {
		return (purchaseAmount*taxRate)+purchaseAmount;
	}
}
