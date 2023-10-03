
public class Ascending
{
	public static void main(String args[])
	{
		int x,multiple=7,var;
		for(x=2;x<=20;x=x+2)//1<=20////2<=20//3<=20//4<=20//5<=20
		{
			var=multiple*x;//9*1=9//9*2=18//9*3=27//9*4=36//9*5=45
			if(var%2==0)//9%2==0//18%2==0//27%2==0//36%2==0//45%2==0
			{
			System.out.println(multiple+"*"+x+"="+var);//18//36//
			}
		}
	}
}