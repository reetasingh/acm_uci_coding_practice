import java.util.Stack;

class ReverseStack
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
	
	
	void init()
	{
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println(s);
		reverse(s);
		System.out.println(s);
	
	}
	
	public static void main(String args[])
	{
		ReverseStack rs = new ReverseStack();
		rs.init();
	}
}