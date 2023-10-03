
public class Armstrongrange {

	public static void main(String[] args) {
		int num=1,rem,count=0,sum=0;
		for(;num<=10000;num++)
		{ 
			
			count=0;
			sum=0;
			for(int y=num;y>0;y/=10)
			{
				count++;
			}
			for(int y=num;y>0;y/=10)
			{
				rem=y%10;
				sum=sum+(int)(Math.pow(rem,count));
			}
			if(sum==num)
			{
				System.out.println(num);
			}
		}
		/*int n=15000,rem,count1=0,var=0,temp=n,count2=0,count3=0;
		for(;n>0;n/=10)
			{
				count1++;
				rem=n%10;
				var=var*10+rem;
			}
		n=temp;
		int temp1=var;
				for(;var>0;var/=10)
				{
					count2++;
				}
				int count=count1-count2;
				System.out.println("count is :"+count);
				temp1=temp1*(int)Math.pow(10, count);
				System.out.println("reverse is:"+temp1);
				count=0;
				for(;temp1>0;temp1/=10)//51000//5100
				{
					
					count++;//1//2//
						
				if(count==5)
				{
						System.out.println("ZERO");
					}
				if(count==4)
				{
					System.out.println("ZERO");
					
				}
				if(count==3)
				{
					System.out.println("ZERO");
				}
					else
					{
						switch(1)
						{
					case 1:
							if(count==2)
							{
								System.out.println("ONE");
							}
						
						
							else if(count==1)
							{
								System.out.println("FIVE");
							
							}
							break;
							default:
								System.out.println("please provide number");
						}
					}
				}*/
				}
}


		