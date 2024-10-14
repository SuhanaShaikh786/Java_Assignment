class p3{
	public static void main(String args[]){
	for(int i=0;i<4;i++)
	{
	   for(int j=0;j<4-i; j++)
	   {
		if(i%2==0){	
		  System.out.print((char)('A' + j) + " ");
		}
		else{
		   System.out.print((char)('a' + j) + " ");
		}
	   }
	System.out.println();
	}

   }

}