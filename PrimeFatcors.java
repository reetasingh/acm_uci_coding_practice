import java.util.Scanner;


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
		Ssytem.out.println(a);
	}
	
	public void find_prime(int n)
	{
		if(n < 2 )
		{
			a.add(n);
		}
		else
		{
			if(n%2 ==0)
				{
					a.add(2);
					find_prime(n/2);
				}
			else
				{
					for(int i=3; i< Math.sqrt(n); i++)
					{
						if(n%i ==0)
						{
							a.add(i);
							find_prime(n/i);
						}
					}
				}
		}
	
	}





}