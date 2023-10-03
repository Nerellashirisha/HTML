
public class Patternsexample2 
{

	public static void main(String[] args)
	{
//reverse triangle stars****
		
		for(int r=1;r<=5;r++)//double click toggle break point for debug
		{
			for(int c=5;c>=r;c--)
			{
				System.out.print("* ");
				
			}
			System.out.println("");
		}
		System.out.println("");
		
//every row start with different letter
		
			char ch='A';
					for(int r=1;r<=4;r++)
					{
						for(int c=1;c<=r;c++)
						{
							System.out.print(ch+" ");
							ch++;
						}
						System.out.println("");
					}
					System.out.println("");
					
// every row start with  A only
					
					int k=65;
					for(int r=1;r<=4;r++)
					{
						k=65;//initialize here//carry forward problem
						for(int c=1;c<=r;c++)
						{
							System.out.print((char)k+" ");
							k++;
						}
						System.out.println("");
					}
					System.out.println("");
					
//every row start with different letter
					
					int k1=65;
							for(int r=1;r<=4;r++)
							{
								for(int c=1;c<=r;c++)
								{
									System.out.print((char)k1+" ");
									k1++;
								}
								System.out.println("");
							}
							System.out.println("");//for next program space
							
//every number start with different number
				for(int r=1;r<=4;r++)
				{
					for(int c=1;c<=4;c++)
					{
						System.out.print(r+" ");
					}
					System.out.println("");
				}
				System.out.println("");
				
	
//every number start with different number
			
				for(int r=1;r<=4;r++)
				{
					for(int c=1;c<=r;c++)
					{
						System.out.print(r+" ");
					}
					System.out.println("");
				}
				System.out.println("");
				
// alphabets patterns	
				int k2=65;
				for(int r=1;r<=5;r++)
				{
					k2=65;
					for(int c=1;c<=r;c++)
					{
						System.out.print((char)k2);
						
					
					}
					k2++;
					
					System.out.println(" ");
				}
				
				int k3=65;
				for(int r=1;r<=5;r++)
				{
					//k2=65;
					for(int c=1;c<=r;c++)
					{
						System.out.print((char)k3);
						
					}
					k3++;
					
					System.out.println(" ");
				
				}
				
				
				for(int r=1;r<=6;r++)
				{
					int k4=4;
					for(int c=5;c>r;c--)
					{
						System.out.print(k4);
						k4--;
					}
					System.out.println("");
				}
	}
}
