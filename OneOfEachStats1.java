/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
	double T=Double.parseDouble(args[0]);
	double average=0.0;
	double children_sum=0.0;
	int family_2=0;
	int family_3=0;
	int family_4_or_more=0;
	
	
	for(int i=0;i<T;i++)
	{
		//OneOfEach
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
				b++;
			}
			else
			{
				g++;
			}
		}
		children_sum+=children;
		
		if(children==2)
		{
			family_2++;
		}
		else
		{
			if(children==3)
			{
				family_3++;
			}
			else{
				family_4_or_more++;
			}
		}

	}
	average=children_sum/T;
	System.out.println("Average: "+average+" children to get at least one of each gender.");
	System.out.println("Number of families with 2 children: "+family_2);
	System.out.println("Number of families with 3 children: "+family_3);
	System.out.println("Number of families with 4 or more children: "+family_4_or_more);

	if(family_2>=family_3 && family_2>=family_4_or_more)
		{
			System.out.println("The most common number of children is 2.");	
		}
		else
		{
			if(family_3>=family_2 && family_3>=family_4_or_more)
			{
				System.out.println("The most common number of children is 3.");
			}
			else
			{
				System.out.println("The most common number of children is 4 or more.");
			}
		}
	}
}
