package selfpr;

public class pattern1 
{

	public static void main(String[] args) 
	{
		// pattern 1
		int i;
		int sp=4;
		for( i=0;i<5;i++)
		{
			for(int s=0;s<sp;)
			{	System.out.print(" ");
			sp--;
			}
		
			for(int k=0;k<i;k++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
