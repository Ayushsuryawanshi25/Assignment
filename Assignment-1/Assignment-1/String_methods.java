import java.util.*;

/*Differentiate String, StringBuffer and StringBuilder. Write a program to perform String
related operations using length(), isEmpty(), chatAt(), toString(), equals(), compareTo(),
contains(), indexOf(), lastIndexOf(), startsWith(), endsWith(), matches(), substring(),
toLowerCase(), trim(), replace(), split(), join(), and valueOf().
*/

class String_methods{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String ");
		String s = sc.nextLine();
		
		System.out.println("The Length of the String is : "+s.length());
		System.out.println("Is String empty : "+ s.isEmpty());
		
		System.out.println("Find the character by index :   Enter an Index :");
		int idx = sc.nextInt();
		char charac = s.charAt(idx);
		System.out.println("Character At Given Index : "+ charac);
		
		
		System.out.println("Uppercase form of the String is : "+ s.toUpperCase());
		System.out.println("Lowercase form of the String is : "+ s.toLowerCase());
		
		System.out.println("Find the Substring of the string : Enter the start point and endpoin :");
		int i = sc.nextInt();
		int j = sc.nextInt();
		System.out.println("The Substring of the string is : "+ s.substring(i,j));
		
		System.out.println("Find the index of the character you enter:  Please enter a character : ");
		char ch  = sc.next().charAt(0);
		int index = s.indexOf(ch);
		System.out.println("The index of the character you entered is : "+index);		
		
		System.out.println("Find the String ends with :   Enter an ending  :");
		String endswith = sc.nextLine();
		System.out.println("The String ends with an ending  :"+ s.endsWith(endswith));
		
		System.out.println("Find the String starts with :  Enter a start  :");
		String startswith = sc.nextLine();
		System.out.println("The String start with an ending  :"+ s.startsWith(startswith));
		
		
		
	}
	

}