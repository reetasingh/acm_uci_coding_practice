//Create queue from 2 statcks

import java.util.Stack;


class Queue1
{
	Stack<Integer> a = new Stack<Integer>();
	Stack<Integer> b = new Stack<Integer>();

	void enque(Integer x)
	{
		if(b.size() > 0)
		{
			int n= b.size();
			for(int i=0;i<n;i++)
			{	
				a.push(b.pop());
			}
		}
		a.push(x);

	}

	void deque()
	{
		if(a.size() > 0)
		{
			int n= a.size();
			for(int i=0;i<n;i++)
			{	
				b.push(a.pop());
			}
		}
		if(b.size() >0 )
		{
			Integer k = b.pop();
			System.out.println(k);
		}
		else
		{
			System.out.println("queue empty");
		}
		
		

	}


	public static void main(String args[])
	{
		Queue1 queue1 = new Queue1();
		queue1.enque(10);
		queue1.deque();
		queue1.enque(20);
		queue1.enque(11);
		queue1.enque(12);
		queue1.enque(13);
		queue1.enque(14);
		queue1.enque(15);
		queue1.enque(16);
		queue1.enque(17);
		queue1.enque(18);
		queue1.deque();
		queue1.deque();
		queue1.deque();
		queue1.deque();
	}
}