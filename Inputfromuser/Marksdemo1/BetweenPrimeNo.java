package Marksdemo1;

public class BetweenPrimeNo 
{
public static void main(String[] args)
{
	for(int x = 1; x<=100 ;x++)
	{
		int temp = 0;
		for(int i = 2;i<=x-1;i++)
		{
			if(x%i==0)
			{
			  temp = temp+1;
			}
			if(temp==0)
			{
			 System.out.println(x);
			  
			}
			else {
				temp=0;
			}
			
		}
	}
}
}

