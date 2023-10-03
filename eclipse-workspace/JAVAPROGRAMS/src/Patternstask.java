
public class Patternstask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//CHARACTER PATTERNS
		
		int k=1;
		int rows=6,cols=6;
		for(int r=0;r<=rows;r++)//0<=6//1
		{
			for(int c=r;c>0;c--)//0>0
			{
				System.out.print("");
			}
			for(k=r;k>=0;k--)//0>=0
			{
				System.out.print((char)(k+65));
				
			}
			
		System.out.println(" ");
		}
		System.out.println(" ");
		
//HOLLOW PATTERNS
		
		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=5;c++)
				{
				if(r==1||c==1||r==4||c==5)
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
		System.out.println(" ");
		
//NUMBER PATTERN
		
		for(int x=1;x<=5;x++)
		{
			for(int y=x;y>=1;y--)
			{
				System.out.print(y);
				
			}
			System.out.println(" ");
		}
		
		System.out.println("");
		//CHARACTER PATTERN REVERSE
		k=1;
		 rows=6;cols=6;
		for(int r=rows;r>0;r--)//0<=6
		{
			for(int c=r;c>0;c--)
			{
				System.out.print("");
			}
			for(k=r;k>=0;k--)
			{
				System.out.print((char)(k+65));
				
			}
			
		System.out.println(" ");
		}
		System.out.println("");
		
//CHARACTER REVERSE ALONG WITH STARTING SAME
		
		 k=65;
		for(int r=1;r<=4;r++)
		{
			k=65;
			for(int c=1;c<=r;c++)
			{
				System.out.print((char)(k));
				k++;
			}
			System.out.println(" ");
		}
		System.out.println("");
	
//CHARACTER STARTING WITH A AND DECREMENTING
		 k=65;
			for(int r=1;r<=4;r++)
			{
				k=65;
				for(int c=r;c<=4;c++)
				{
					System.out.print((char)(k));
					k++;
				}
				System.out.println(" ");
			}	
			System.out.println("");
		
	
//CHARACTER STARTING WITH D AND REVERSEING DECREMENTING
			
			k=68;
			for(int r=1;r<=4;r++)//2
			{
				k=68;
				for(int c=r;c<=4;c++)//1//1<=4//2<=4//3<=4////4<=4//5<=4
				{
					System.out.print((char)(k));//64+3=67//63+3==66//62+3=65
					k--;//64//63//62//61
				}
				System.out.println(" ");//
			}
			System.out.println("");
			//k=65;
			for(int i=1;i<=6;i++)
			{
				for(int j=6;j>=i;j--)
				{
					System.out.print((char)(j+64));
				
				}
				System.out.println("");
			}
	}
}

