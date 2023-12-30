import java.util.Random;
/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
		int n=(int)(Math.random()*10);
		System.out.print(n);
		int m=(int)(Math.random()*10);
		int temp;
		while(m>=n)
		{
			System.out.print(" "+m);
			temp=m;
			n=temp;
			m=(int)(Math.random()*10);
		}
		
	}
}
