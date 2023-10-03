
public class Leapyear {
	public static void main(String args[])
	{
		int year=2025,b,c,d;
		if(year%4==0 && year%100!=0||year%400==0)
		{
			b=year%100;
			if(b%2==0)
			{
				System.out.println("even number");
			}
			else
			{
				System.out.println("odd number");
			}
		}
		else
		{
			c=year/100;
			d=year%100;
			d=d+c;
			System.out.println("the addition of numbers is:"+d);
		}
	}

}
