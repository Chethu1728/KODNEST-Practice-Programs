import java.util.Scanner;

public class JourneyCalculator {
	public static void main(String[] args) {
	 Scanner scan=new Scanner(System.in);
	 System.out.println(" Enter the speed and time to travel");
	 double speed=scan.nextDouble();
	 double time=scan.nextDouble();
	 System.out.println(calculateDistance(speed,time));
	}
	public static double calculateDistance(double speed, double time) {
		return speed*time;
				
	}
}
