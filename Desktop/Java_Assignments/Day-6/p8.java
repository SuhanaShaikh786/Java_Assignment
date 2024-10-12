class p8{
	public static void main(String args[]){

	int rows=3;
	int columns =4;
	int startNum = 1;

	for(int i=0;i<rows;i++)
	{
	    int currentNum = startNum;
	     for(int j=0; j<columns;j++)
	    {
		System.out.print(currentNum+ " ");
		currentNum += 2;
	     }
	System.out.println();
	startNum += 2;
	   
	}

  }
}