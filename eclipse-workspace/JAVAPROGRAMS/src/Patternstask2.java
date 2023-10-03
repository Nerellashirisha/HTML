import java.util.Scanner;

public class Patternstask2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int rows=sc.nextInt();
		System.out.println("enter number2:");
		int cols=sc.nextInt();
		int r,c;
		//char ch='A';
		//for(r=1;r<=rows;r++)
		//{
			//for(c=cols;c>=r;c--)
			//{
				//System.out.print((char)(c+ch-1));
				//System.out.print((char)(c+64));
			//}
			//System.out.print(" ");
		//}
		
//PRINT NUMBER RANDOMLY
		
		for(r=1;r<=rows;r++)
		{
			for(c=1;c<=r;c++)
			{
				if(r%2==0)
				{
					System.out.print("0");
				}
				else
				{
					System.out.print("1");
				}
				System.out.print(" ");
			}
			System.out.println("");
			}
		
//PRINT NUMBERS RANDOMLY  ANOTHER WAY
		
		for(r=1;r<=rows;r++)
		{
			for(c=1;c<=r;c++)
			{
				System.out.print(r%2);
			}
			System.out.println("");
		}
}
}