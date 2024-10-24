import java.util.Scanner;
class p1{
public static void main(String args[]){
	Scanner scanner = new Scanner(System.in);
	System.out.print("Min of Series:");
	int min = scanner.nextInt();
	System.out.print("Max of Series:");
	int max = scanner.nextInt();
	System.out.println("Series Of Odd Numbers Ranging between  " + min + " and " +max + " is : ");
	for(int i=min;i<=max;i++){
		if(i%2 !=0){
			System.out.print(i +" ");
		}
	}
	scanner.close();




	}



}