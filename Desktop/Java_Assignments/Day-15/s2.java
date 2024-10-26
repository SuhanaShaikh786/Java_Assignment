import java.util.Scanner;
class s2{
	public static void main(String args[]){
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter num1:");
	int num1 = sc.nextInt();
	System.out.println("Enter Num2:");
	int num2=sc.nextInt();
	System.out.print(num1 < num2 ? "Min :"  +num1 :  num1  ==  num2 ? "Equal" : "Min :" + num2);


	}


}