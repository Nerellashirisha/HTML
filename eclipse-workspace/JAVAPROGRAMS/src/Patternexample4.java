
public class Patternexample4 {

	public static void main(String[] args) {
		//int k=5;
		for(int r=5;r>=1;r--)//r=5//r=4
		{
			
			for(int c=1;c<=r;c++)
			{					
				System.out.print(r);
			
			
			}
			//k--;
			System.out.println("");
		}
		
		for(int r=1;r<=5;r++)
		{	int c=5;
			for (;c>=r;c--)
			{
				System.out.print(c);
			}
			System.out.println("");
		}
		
//numbers  lastlo 1
		
		for(int r=1;r<=4;r++)//1//2
		{		
			for(int c=1;c<=r;c++)//1<=1//2<=1==>false
								//1<=2//2<=2//
			{
				if(r==c)
				{
					System.out.print(1);
				}
				else
				{
					System.out.print(r);
				}
			}						//2//
			System.out.println("");
		}
		
		//numbers last lo 1
		//and increment row
		
		for(int r=1;r<=4;r++)
		{
			for(int c=r;c>=1;c--)
			{
				System.out.print(c);
			}
			System.out.println("");
		}
		
		System.out.println(" ");
	
		
		//
		 //decrementing rows and colums
		//and following th eseries
		for(int r=5;r>=1;r--)
		{	
			for (int c=r;c>=1;c--)
			{
				System.out.print(c);
			}
			System.out.println("");
		}
		}
	}


