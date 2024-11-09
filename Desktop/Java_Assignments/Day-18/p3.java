import java.util.Scanner;
class p3{
	public static void main(String args[]){
	Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the first integer:");
		int dividend = scanner.nextInt();

		System.out.print("Enter the Second integer:");
		int divisor = scanner.nextInt();
		
		if(divisor==0){
			System.out.println("Errro : Division by zero is not allowed.");
		}
		else{
			int quotient = dividend / divisor;
			int remainder = dividend%divisor;


			System.out.println("Quotient:" + quotient);
			System.out.println("Remainder: "+ remainder);
		}
	scanner.close();
	}





}