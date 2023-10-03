
public class Patternexample1 {

	public static void main(String[] args)
	{
		//5 rows and 5 columns and diagonal
		for(int r=1;r<=5;r++)
		{
			for(int c=1;c<=5;c++)
			{
				if(r==1||c==1||r==5||c==5||r!=c)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			
			}
			System.out.println(" ");
		}
//3 rows and 3 columns
		
		for(int r=1;r<=3;r++)
		{
			for(int c=1;c<=3;c++)
			{
				if(c==1)
				{
					System.out.print("1");
				}
				else if(c==2)
				{
					System.out.print("2");
				}
				else
				{
					System.out.print("3");
				}
			}
			System.out.println(" ");
		}
		
		
	
		for(int r=1;r<=5;r++)
		{
			for(int c=1;c<=5;c++)
			{
				if(r==1||c==1||r==5||c==5)
				{
					System.out.print("*");
				}
				else if((r==2&&c==4)||(r==3&&c==3)||(r==4&&c==2))

				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
					
			}
			System.out.println(" ");
		}
		
		
	}

}
