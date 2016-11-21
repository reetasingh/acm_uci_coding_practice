//Create queue from 2 statcks

import java.util.Queue;
import java.util.ArrayDeque;


class Stack1
{
	Queue<Integer> a = new ArrayDeque<Integer>();
	Queue<Integer> b = new ArrayDeque<Integer>();

	void push(Integer x)
	{
		if(b.size() > 0)
		{
			int n= b.size();
			for(int i=0;i<n;i++)
			{	
				a.add(b.remove());
			}
		}
		a.add(x);
		

	}

	void pop()
	{
		if(a.size() > 0)
		{
			int n= a.size();
			Integer c[]= new Integer[n];
			for(int i=0;i<n;i++)
			{	
				c[i]= a.remove();
				
			}
			
			for(int i=n-1;i>=0;i--)
			{	
				b.add(c[i]);
				
			}
		}
		if(b.size() >0 )
		{
			Integer k = b.remove();
			System.out.println(k);
		}
		else
		{
			System.out.println("stack empty");
		}
	}


	public static void main(String args[])
	{
		Stack1 stack = new Stack1();
		stack.pop();
		stack.push(10);
		stack.push(11);
		stack.pop();
		stack.push(12);
		stack.push(13);
		stack.push(14);
		stack.pop();
		stack.pop();
		
	}
}