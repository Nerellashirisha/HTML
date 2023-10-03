import java.util.Scanner;

public class Primepattern 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows");
		int rows=sc.nextInt();
		System.out.println("enter number of cols");
		int cols=sc.nextInt();
		
		int temp=1,r,c;
		/*for( r=1;r<=rows;r++)
		{
			for( c=1;c<=r;)
			{
				int count=0;
				for(int i=1;i<=temp;i++)
				{
					if(temp%i==0)
					{
						count++;
					}
				}
					if(count==2)
					{
						System.out.print(temp+" ");
					c++;
					}
					
					temp++;
			
				}
					System.out.println();
			}*/
		
//PALINDROME PATTERN
		
	int	temp1=1;
		for(r=1;r<=rows;r++)
		{
			for(c=1;c<=cols;)
			{
				int var=0,rem=0,i=temp1;
					
					for(;i!=0;i/=10)
					{
						rem=i%10;
						var=var*10+rem;
					}
				if(temp1==var)
				{
					System.out.print(temp1+"  ");					
					c++;
				}
			temp1++;
			}
			System.out.println();
		}
			
	}
}
	


		
		
		
		
	
	
	
	
	
