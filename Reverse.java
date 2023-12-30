/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		//String[] array=new char[args[0].length()];
		String s=args[0];
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}		//// Put your
		
		System.out.println();
		int x=s.length();
		if(x%2==0)
		{
			System.out.println("The middle character is "+s.charAt((x/2)-1));
		}
		
		else
		{
			System.out.println("The middle character is "+s.charAt(x/2));
		}
		
	}
}
