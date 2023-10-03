
public class Patternexampample3 {

	public static void main(String[] args) 
	{
		for(int r=1;r<=5;r++)
		{
			int k4=5;
			for(int c=5;c>=r;c--)
			{
				System.out.print(k4);
				k4--;
			}
			System.out.println("");
		}
		
		
		int k=5;
		for(int r=1;r<=5;r++)//r=1//r=2
		{
			//int k4=5;
			for(int c=5;c>=r;c--)//5>=1//4>=1//3>=1//2>=1//1>=1
			{					//5>=2
				System.out.print(k);//5//4//3//2//1
			}
			k--;//4//3//2//1//0
			
			System.out.println("");
		}
	}
}

