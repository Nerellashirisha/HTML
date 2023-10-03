
public class Powerrange {

	public static void main(String[] args) {
		int num=132,sum=0,product=1,count=0,rem;
		for(;num>0;num/=10)
		{
		count++;
		rem=num%10;
			if(count==1||count==2||count==3)
			{
				sum=sum+rem;
				product=product*rem;
			}
		}
		if(sum==product)
		{
			System.out.println("Power number");
		}
		else
		{
			System.out.println("Not a power number");
		
	}

}
}
