import java.util.Scanner;
class p1{
	public static void main(String args[]){
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter first integer:");
	int num1=scanner.nextInt();
	System.out.print("Enetr second integer:");
	int num2=scanner.nextInt();
	int addition = num1+ num2;
	int substraction;
	if(num1 > num2){
		substraction = num1 -num2;
	}
	else{
		substraction = num2 - num1;
	}
System.out.println("Addition is:"+ addition);
System.out.println("Substraction is:"+ substraction);
scanner.close();
}


}