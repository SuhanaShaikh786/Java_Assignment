import java.util.Scanner;


class p4{
	public static void main(String args[]){
	    Scanner scanner = new Scanner(System.in);

	    System.out.println("Enter first Number:");
	    int num1 = scanner.nextInt();
	    System.out.println("Enter Second Number:");
	     int num2 = scanner.nextInt();

	    System.out.println("Enter the sign of Operation (+,-,*,/):");
	    char operation = scanner.next().charAt(0);
	    
	    switch(operation){
			case '+':
				System.out.println("Addition of : " + num1 + " & " + num2 + "  is: " + (num1 + num2));
				break;
			case '-':
				System.out.println("Subtraction of: " + num1 + " & " + num2 + " is: " + (num1 - num2));
				break;
			case '*':
				System.out.println("Multiplication of: " + num1 + " & " + num2 + " is:  " + (num1 * num2));
				break;
			case '/':
			   	  if(num2 !=0){
						System.out.println("Division of : " + num1 + " & " + num2 + "  is: " + (num1 / num2));
					}
				  else{
						System.out.println("Error: Division by Zero is not allowed:.");
					}
				break;
			default:
				System.out.println("Invalid operation sign. plz use +,-,*,/.");
		   }
			scanner.close();    
	}

}