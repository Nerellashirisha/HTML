
public class Fibonacci {

	public static void main(String[] args) {
		int n1=0,n2=0,n3=1;
		for(int y=0;y<=15;y++)
		{
			n1=n2;//1//2//3//4////5//8
			n2=n3;//0//1//2//3//4//8//13
			n3=n1+n2;//1//2//3//8//13//21
			
		System.out.println(n1);//0//1//1//2//3//5//8//13//21//
		}
	
		//PALINDROME NUMBER
		
int n=121,rem,temp,sum=0;
temp=n;
while(n>0)
{
	rem=n%10;
	//System.out.println(rem);
	sum=(sum*10)+rem;
n/=10;
}
if(temp==sum)
{
	System.out.println("palindrome number");
}
else
{
	System.out.println("not a palindrome number");
}
}
}
