package Marksdemo1;

public class PrimeNum {
public static void main(String[] args) {
	int x = 13;
	int temp = 0;
	for(int i = 2; i<=x-1;i++)
	{
		if(x%i==0)
		{
			temp = temp+1;
		}
		
	}
	if(temp > 0)
	{
		System.out.println(x +" is not prime ");
	}
	else
	{
		System.out.println(x +" is prime ");
	}
}
}
