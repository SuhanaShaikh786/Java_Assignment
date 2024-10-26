import java.util.Scanner;
class s5{
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Three Integer Numbers:");
		int num1 =sc.nextInt();
		int num2 =sc.nextInt();
		int num3=sc.nextInt();
		int max = num1;
		if(num2>max){
			max=num2;
		}
		if(num3>max){
			max=num3;
		}
		System.out.println("The Maximum number amongst " + num1 + " , " + num2+ "&" + num3 + "is"  + max + ".");

		sc.close();
		

	}


}