import java.util.Scanner;
class p3{
	public static void main(String args[]){
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter two interes:");
	int num1 = scanner.nextInt();
	int num2 = scanner.nextInt();

	int cube1= num1 * num1 * num1;
	int cube2=num2 * num2 * num2;
	int square1 = num1 * num1;
	int square2 = num2 * num2;

	int cubeAddition = cube1 + cube2;
	int squareSubtraction = square1 - square2;
	
	System.out.println("Addition of  "    +  cube1  +  " &"   +  cube2   +  "is"  + cubeAddition);
	System.out.println("Subtraction of "  + square1 +  "&"  +  square2  + "is"  +  squareSubtraction);
	
	scanner.close();		 



	}

}