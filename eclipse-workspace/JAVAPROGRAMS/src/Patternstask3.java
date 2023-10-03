import java.util.Scanner;

public class Patternstask3
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows");
		int rows=sc.nextInt();	
		System.out.println("enter number of cols");
		int cols=sc.nextInt();	
		int x,y,z;
		for(x=1;x<=rows;x++)
		{
			for(y=rows-1;y>=x;y--)
				
			{
				System.out.print(" ");
			}
		for(z=1;z<=x;z++)
		{
			System.out.print(z+" ");
		}
		System.out.println();
		}
	/*for( x=1;x<=rows;x++)
	{
		for(y=1;y<=x-1;y++)
		{
			System.out.print(" ");
		}
		for(z=rows;z>=x;z--)//
		{
			System.out.print(z+" ");
		}
		System.out.println();
	}*/
	
	
	
	
	
	for( x=rows;x>=1;x--)
	{
		for(y=7;y>=x;y--)
		{
			System.out.print(" ");
		}
		for(z=1;z<=x-1;z++)//
		{
			System.out.print(z+" ");
		}
		System.out.println();
	}
	}


}