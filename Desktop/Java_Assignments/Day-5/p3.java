class p3{
	public static void main(String args[])
	{
		   char ch1='a';
	   	   char ch2='b';
		   checkCharacter(ch1);
		    checkCharacter(ch2);
   }
	public static void checkCharacter(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is a consonant.");
        }
		
	}
}