import java.util.Scanner;
class p2{
	public static void main(String args[]){
		Scanner scanner= new Scanner(System.in);
		System.out.print("Enter first Integer:");
		int num1 = scanner.nextInt();
		System.out.print("Enetr Second Integer:");
		int num2 = scanner.nextInt();
		int multiplication = num1 * num2;
		int divisor = Math.min(num1,num2);
		int division = (divisor !=0) ? (num1 / divisor): 0;
		System.out.println("Multiplication is"+ multiplication);
		System.out.println("Division is"+ division);
		scanner.close();
	}

}
