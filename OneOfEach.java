
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
	int x;
	int b=0;
	int g=0;
	int children=0;
	while(b<1 || g<1)
	{
		children++;
		x=(int)(Math.random()*10);
		if(x%2==0)
		{
			System.out.print("b ");
			b++;
		}
		else
		{
			System.out.print("g ");
			g++;
		}
	}
	System.out.println();
	System.out.println("You made it... and you now have "+children+" children.");
	}
}
