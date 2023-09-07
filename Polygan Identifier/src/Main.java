import java.util.Scanner;

public class Main {
	public static void identifyPolygon(int sides)

	{

		switch (sides) {
		case 3:
			System.out.println("Triangle");
			break;
		case 4:
			System.out.println("Quadrilateral");
			break;
		case 5:
			System.out.println("Pentagan");
			break;
		case 6:
			System.out.println("Hexagan");
			break;
			default:
				System.out.println("Polygan");
		}
		
	}

	public static void main(String[] args)

	{
		Scanner scan=new Scanner(System.in);
		int sides=scan.nextInt();
		identifyPolygon(sides);
		scan.close();
	}

}
