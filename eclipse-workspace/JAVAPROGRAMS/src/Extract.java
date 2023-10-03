
public class Extract {

	public static void main(String[] args) {
		int num=15000,rem,var=0,temp=num,var1=0,count=0
				;
		//for(;num>0;num/=10)
		//{
			//rem=num%10;
			//var=var*10+rem*1000;
			//System.out.println(var);
			
			//}
		//num=temp;
	
//	System.out.println(var);
	//for(;var>0;var/=10)
	//{
	//	rem=var%10;
		//var1=var1*10+rem*1000;
		
	//}
	//System.out.println(var1);
	
	for(;num>0;num/=10)
	{
		rem=num%10;
		//count++;
		var=var*10+rem;
		if(rem==0)
		{
			count++;
		}
		else
		{
			System.out.println(var);
		}
	}
	
	
	}
}
