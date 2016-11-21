import java.util.Scanner;
import java.util.LinkedList;


//find prime factors of number x

class PrimeFactors
{

	int x;
	LinkedList a = new LinkedList();

	public void read()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		x = s.nextInt();
		find_prime(x);
		System.out.println(a);
	}
	
	public void find_prime(int n)
	{
		if(n == 1 )
		{
			a.add(n);
		}
		else
		{
			while(n%2 == 0)
			{
					a.add(2);
					n=n/2;
			}
			
			for(int i=3; i<=n; i = i+2)
			{				
				while(n%i == 0)
				{
					a.add(i);
					n=n/i;
				}
			}
		}
	
	}
	
	
	public static void main(String args[])
	{
	PrimeFactors primeFactors = new PrimeFactors();
	primeFactors.read();		
	}





}