class p4{
	public static void main(String args[]){
		for(int i=1;i<=5;i++)
		{
			char ch;
			if(i% 2 == 1)
			{
				ch= 'a';
			}
			else{
				ch='A';
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch + " ");
			}
			System.out.println();
		}
	}
}