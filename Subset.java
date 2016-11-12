//Given a set of integers and value ,find subset which will sum upto value 

/* dynamic programming problem
*/

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class Subset
{
	static String input[] = null;
	static Integer data[]=new Integer[10];
	static ArrayList ans  = new ArrayList();

	static int sum;

	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		System.out.println("Enter sum");
		sum = Integer.parseInt(s.nextLine());
		input = s.nextLine().split(" ");
		for(int i=0;i<input.length;i++)
		{
			//System.out.println(input[i]);
			//Save input data 
			data[i]= Integer.parseInt(input[i]);
			//System.out.println(data[i]);
		}

		find_subset();
		
		for(int i=0;i<ans.size();i++)
		{
			// answer is saved in ArrayList ans
			Integer val= (Integer)ans.get(i);
			System.out.println(data[val]);
		}
	}

	static void find_subset()
	{
		Boolean set1 [][]= new Boolean[input.length][sum];
		for (int i=0;i<input.length;i++)
		{
			for(int j=0;j<sum;j++)
			{
				//initalize all false
				set1[i][j] = false;
			}	
		}
		for (int i=0;i<input.length;i++)
		{
			if(data[i]< sum)
			{
				//current = true
				set1[i][data[i]-1]=true;
				//System.out.println("i = " + i + " data[i]" +data[i]);
			}
			for(int j=0;j<sum;j++)
			{
				if(i>0)
				{
					if(set1[i-1][j]==true)
					{
						//System.out.println("i-1 = " + (i-1) + "j =" + j);
						set1[i][j]=true;
						if((j + data[i]) < sum)
						{
							//if previos = true and current +previus less than sum, set it to true
							set1[i][j + data[i]] = true;
						}
					}	
				}
			}

			for(int j=0;j<sum;j++)
			{
				//System.out.println(set1[i][j]);				
			}
			int num=data[i];
			int post= sum-1;
			if(set1[i][sum-1]==true)
			{
				ans.add(i);
				for(int k=i-1;k>=0;k--)
				{
					for(int l=0;l<sum;l++)
					{
						//Backtrace to find what lead to this answer
						if(set1[k][l]==true)
						{
							if(k-1 >=0 && set1[k-1][l] ==false)
							{
								//System.out.println("k = " + k + " l=" + l);
								if((l + num) ==post)
								{
									ans.add(k);
									//System.out.println(" k =" + k);
									post=l; 
									//System.out.println("post =" + post);
									num= data[k];
									//System.out.println("num ="+ num);
									break;
								}
							}
							if(k==0)
							{
								if((l + num) ==post)
								{
									ans.add(k);
									//System.out.println(" k =" + k);
									post=l; 
									//System.out.println("post =" + post);
									num= data[k];
									//System.out.println("num ="+ num);
									break;
								}
							
							}
						}	
						
				    }
					
				}
				break;
				
			}
		}
	}
}