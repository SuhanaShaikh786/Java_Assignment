import java.util.Scanner;
class p1{
	public static void main(String args[]){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter First Number:");
		int a=scanner.nextInt();
		System.out.println("Enter Second Number:");
		int b=scanner.nextInt();
		System.out.println("Before Swap: a= " +a + " & b = " +b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swap: a="  +a + " & b = " +b);
		scanner.close();

	}



}