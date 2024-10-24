import java.util.Scanner;


class p2{
public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter first Integer:");
		int first = scanner.nextInt();
		System.out.print("Enter Second Integer:");
		int second = scanner.nextInt();
		
		System.out.println("Before Swap: " +first + "  " + second);

		int temp = first;
		first = second;
		second = temp;
		System.out.println("After Swap :" + first + "  "  +second);
		scanner.close();

	}



}