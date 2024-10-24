import java.util.Scanner;


class p3{
	public static void main(String args[]){
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enetr  Integer:");
	int input =scanner.nextInt();
	for(int i=2; i<=input;i+=2)
	{
		int cube = i * i * i;
		int square = i*i;
		System.out.println("Cube of " + i + " : " + cube + " and Square of " + i + " : " + square);

	}
	scanner.close();

	}

		




	}