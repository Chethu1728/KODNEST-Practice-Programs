import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println(" Enter the fahrenheit temparature to be converted ");
		double f=scan.nextDouble();
		TemperatureConverter temperatureConverter = new TemperatureConverter();
		System.out.println(temperatureConverter.convertFahrenheitToCelsius(f));
	}

}
