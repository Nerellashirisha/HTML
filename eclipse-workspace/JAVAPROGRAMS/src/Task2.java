
public class Task2 {

	public static void main(String[] args) {
		//int n1=1,n2=7,count=0;
		//for(;n1<=n2;n1++)//1<=5//2<=5//3//4//5//6//7//8
		//{
		//	if(n2%n1==0)//5%1==0//5%5==0
			//{
			//	n1=n1+1;//2//3
			//}
		//}
		//System.out.println(n1);
		//if(n2+2==n1)//
		//{
		//	System.out.println("twin prime");
		//}
		//else
		//{
		//	System.out.println("not a twin prime");
		//}
		 int n1=3;
		 int n2=5;
		int count=0;
			for(int start=1;start<=n1;start++)
			{
			if(n1%start==0)
			{
				count++;
			}
		}
		
				for(int start=1;start<=n2;start++)
				{
					if(n2%start==0)
					{
						count++;
					}
				}
			
			if((n2-n1)==2)
			{
				System.out.println("twin prime");
				
			}
			else
			{
				System.out.println("not twin prime");
			}
	}

}

