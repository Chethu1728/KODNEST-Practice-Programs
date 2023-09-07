import java.util.Scanner;

public class Main {
	public static void getProduct(String productCode)
	{ 
		switch(productCode) {
		case "P01":
			System.out.println("Coca Cola");
			break;
		case "P02":
			System.out.println("pepsi");
			break;
		case "P03":
			System.out.println("Fanta");
			break;
		case "P04":
			System.out.println("Jal Jeere");
			break;
		case "P05":
			System.out.println("Mountain");
			break;
			default:
				System.out.println("Enter the correct code");
		}
	} 
		public static void main(String[] args)
		{ 
			Scanner scan=new Scanner(System.in);
			String productCode=scan.next();
			getProduct(productCode);
		
	}

}
