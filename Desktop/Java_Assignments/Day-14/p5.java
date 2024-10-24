import java.util.Scanner;
class p5{
public static void main(String args[]){

	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter the First Integer:");
	int first = scanner.nextInt();

	System.out.println("Enter the Second Integer:");
	int second = scanner.nextInt();

	int max;
	if(first > second){
		max = first;
	}
	else{
		max = second;
	}
	System.out.println("The Maximum number amongst " + first + " & " + second + "is " + max);
	scanner.close();




	}


}