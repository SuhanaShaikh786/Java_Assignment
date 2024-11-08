import java.util.Scanner;
class p1{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number:");
		int number = sc.nextInt();
		for(int i=0;i < 10 ; i++){
			System.out.println(number + " * "  + (10 - i) + "=" + number * (10 - i));
		}
	}
}