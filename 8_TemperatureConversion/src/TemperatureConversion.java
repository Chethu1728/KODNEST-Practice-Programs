import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to the Temperature Conversion Tool!");
		System.out.println("Select an option:\n 1. Convert Celsius to Fahrenheit \n 2. Convert Fahrenheit to Celsius");
		System.out.println("Enter Your choice");
		int k=scan.nextInt();
		switch(k) {
		case 1:
			System.out.println("Enter the temperature in Celsius:");
			double celsius=scan.nextDouble();
			double f= celsiusToFahrenheit(celsius);
			System.out.println(celsius+"°C is equivalent to "+f+"°F");
			break;
		case 2:
			System.out.println("Enter the temperature in fahrenheit:");
			double fahrenheit=scan.nextDouble();
			double c=fahrenheitToCelsius(fahrenheit);
			System.out.println(fahrenheit+"°F is equivalent to "+c+"°C");
			break;
		}
	}
	public static double celsiusToFahrenheit(double celsius) {
		return (celsius * 9/5) + 32;
	}
	public static double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit- 32)*5/9;
	}
}
