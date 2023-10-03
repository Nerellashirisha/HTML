
public class Extraction
{

	public static void main(String[] args)
	{
// extraction model using loop

		int num=8976,rem=0,count=0;
	for(int i=1;i<=4;i++)
	{
		rem=num%10;
		num=num/10;
	
		System.out.println(rem);
		count++;
	}
		System.out.println("count is:"+count);
		
// extraction model using normal statement
	
	//rem=num%10;//8976%10==6
	//num=num/10;//8976/10==897
	//System.out.println(rem);//6
	//rem=num%10; //897%10==7
	//num=num/10;//897/10==89
	//System.out.println(rem);//7
	//rem=num%10;//89%10==9
	//num=num/10;//89/10==8
	//System.out.println(rem);//9
	//rem=num%10;//8%10==8
	//num=num/10;//8/10==0
	//System.out.println(rem);//8
	
//ANOTHER EXAMPLE
	
	int number=256,remainder=0,sum=0,multiple=1;
	for(;number!=0;number/=10)
	{
		rem=number%10;
		System.out.println(rem);
		sum=sum+rem;
		multiple=multiple*rem;
	}
	System.out.println("sum is:"+sum);
	System.out.println("multiple is:"+multiple);

	//	USING WHILE LOOP
	
	int n1=256,remain=0,var=0,factor=0,multi=1;
	while(n1!=0)
	{
	remain=n1%10;
	n1=n1/10;
	System.out.println(remain);
	var=var+remain;
	factor++;
	multi=multi*remain;
	
	}
		System.out.println("sum is:"+var);
		System.out.println("count is:"+factor);

		System.out.println("multiple is:"+multi);

	}

}

