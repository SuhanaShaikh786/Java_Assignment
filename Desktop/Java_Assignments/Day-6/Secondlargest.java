class Secondlargest{
	public static void main(String args[]){
	 int a=10;
	int b=20;
	int c=30;
	int secondlargest;
	if((a>b && a < c) || (a<b && a>c))
	{	
		secondlargest=a;
	}
	else if((b>a && b<c) || (b<a && b<c))
	{
	       secondlargest=b;
	}
	else{
		secondlargest=c;
	}
System.out.println(secondlargest + " is the Second largest Number");
	}
}



// Output: 20 is the Second largest Number