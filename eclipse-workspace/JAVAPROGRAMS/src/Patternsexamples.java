
public class Patternsexamples 
{

	public static void main(String[] args) 
	
	{
//3 rows and 3 columns
		
		//for(int x=1;x<=3;x++)
		//{
			//for(int y=1;y<=3;y++)
			//{
				//if(x==1||y==1||x==3||y==3)
				//{
				//System.out.print("*");
			//}
				//else
				//{
					//System.out.print(" ");
				//}
			//}
			//System.out.println(" ");
		//}
		//System.out.println(" ");//for next program space
		
//4 rows and 4 columns
		
			//for(int r=1;r<=4;r++)
			//{
				//for(int c=1;c<=4;c++)
				//{
					//if(r==1||c==1||r==4||c==4)
					//{
						//System.out.print("*");
					//}
					//else
					//{
						//System.out.print(" ");
					//}
				//}
				//System.out.println(" ");
			//}
		//System.out.println(" ");//for next program space

//3 rows and 4 columns
		
		//for(int r=1;r<=3;r++)
	//{
		//for(int c=1;c<=4;c++)
		//{
			//if(r==1||c==1||r==3||c==4)
			//{
				//System.out.print("*");
			//}
			//else
			//{
				//System.out.print(" ");
			//}
		//}
		//System.out.println(" ");
	//}
		//System.out.println(" ");//for next program space 
// 5 columns and 5 rows and diagonal
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
		
	
	}
}
