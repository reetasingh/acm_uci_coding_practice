// calculate exponential 

//https://en.wikipedia.org/wiki/Exponentiation_by_squaring

import java.util.Scanner;
import  java.lang.Math;

public class Exponential
{

//pow(x,n)
static int n;// power
static int x;// number

	void read()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n");
		n = scanner.nextInt();
		System.out.println("Enter x");
		x = scanner.nextInt();
		System.out.println("n = " + n + "x = "+ x);

	}
	
	long calculate(int x,int n)
	{
		if (n==0) 
		{
			return 1;
		}
		else
		{
			if(n==1)
			{
			    return x;
			}
			else
			{
				if(n%2 ==0)
				{
						//Even numbers
						return calculate(x*x,n/2);
				}
				else
				{
						//Odd numbers
						return x * calculate (x*x,n/2);
				}
			
			}
		
		}
	
	}
	
	
	public static void main(String args[])
	{
		Exponential exponential = new Exponential();
		exponential.read();
		System.out.println(exponential.calculate(x,n));
		System.out.println(Math.pow(x,n));
		
	}


}