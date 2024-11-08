import java.util.Scanner;

class p3{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length:");
		int l= sc.nextInt();
		System.out.println("Enter breadth:");
		int b =sc.nextInt();
		if(l>=0 && b>=0){
			System.out.println("Area= " + l*b );
		}
		else{
			System.out.println("Enter valid dat.");

		}

	}

}