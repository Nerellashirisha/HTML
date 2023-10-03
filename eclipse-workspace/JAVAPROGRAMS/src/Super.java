
public class Super {

	public static void main(String[] args) {
		int start,end=100,count=0;
		for(start=1;start<=end;start++)
		{
			if(end%start==0)
			{
				System.out.println("factor of" + end + "is:"+start);
			
			count++;
			}
		}
	System.out.println("total factors are:"+count);
		if(count>=5)
		{
			System.out.println("super number");
		}
		else
		{
			System.out.println("not a super number");
		}
	}

}
