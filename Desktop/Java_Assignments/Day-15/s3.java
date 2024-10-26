import java.util.Scanner;
class s3{
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter Distance in Meters:");
		double distance = scanner.nextDouble();

		System.out.print("Enter Time in Seconds:");
		double time = scanner.nextDouble();

		double velocity = distance / time;
		System.out.println("The Velocity of a Particle roaming In space is  " + velocity + "m/s.");
		scanner.close();


	}




}