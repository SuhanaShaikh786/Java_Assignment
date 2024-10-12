class Grade{
	public static void main(String args[])
	{
		double perecentage=85.0;

		char grade;
		if(perecentage >= 90 && perecentage <=100){
			grade = 'A';
	       }
	      else if(perecentage >= 80 && perecentage <90)
		{
			grade = 'B';
		}
		else if(perecentage >= 70 && perecentage <80)
		{
			grade ='C';
		}
		else if(perecentage >= 60 && perecentage <70)
		{
			grade ='D';
		}
		else if(perecentage >= 0 && perecentage <60)
		{
			grade ='F';
		}
		else{
			grade = 'I';
		}
		if(grade == 'I')
		{
			System.out.println("Invalid perecentage");
		}
		else{
			System.out.println("The Grade is:"+grade);
		}


	}




}