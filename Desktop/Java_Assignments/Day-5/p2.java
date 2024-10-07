class p2{
	public static void main(String args[]){
	int a=20;
	int b=30;
	int c=40;
	int smallest;
	if(a<=b && a<=c)
	{
	   smallest =a;
	}
	else if(b<=a && b<=c)
	{
	 smallest =b;
	}
	else{
   	     smallest=c;
	}
System.out.println(smallest + " is the smallest Number");

   }

}