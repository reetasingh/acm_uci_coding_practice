import java.util.Stack;

class QueueFromOneStack
{
	Stack <Integer>s = new Stack<Integer>();
	
	
	void  reverse(Stack s1)
	{
		if(s.size() >0)
		{
			Integer a = (Integer)s1.pop();
			reverse(s1);
			insert(s1,a);
		}

	} 
	
	void insert(Stack s2, Integer a)
	{
		if(s2.size() ==0)
		{
			s2.push(a);	
		}
		else
		{
			Integer temp = (Integer)s2.pop();
			insert(s2,a);
			s2.push(temp);
		}
		
	}
	
	void enque(int a)
	{
		s.push(a);
	}
	
	@Override
	public String toString()
	{
		reverse(s1);
		System.out.println(s1);	
		reverse(s1);
	}
	
	
	public void deque()
	{
		reverse(s1);
		int a = s1.pop();
		System.out.println(a);
		reverse(s1);
	}
	
	
	
	public static void main(String args[])
	{
		QueueFromOneStack rs = new ReverseStack();
		rs.enque(10);
		rs.enque(20);
		rs.enque(50);
		rs.deque();
		System.out.println(rs.toString());
		rs.enque(30);
		rs.enque(40);
		rs.deque();
		System.out.println(rs.toString());
	}
}