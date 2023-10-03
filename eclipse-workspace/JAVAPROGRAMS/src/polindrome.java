import java.util.Scanner;
public class polindrome 
{

	public static void main(String[] args) 
	{
		
//PALINDROME PROGRAM
		
		//int n=121,rem,var=0,temp=n;
		//for(;n>0;n/=10)
		//{
		//	rem=n%10;
			//var=(var*10)+rem;
		//}
		//n=temp;
		//if(n==var)
		//{
		//	System.out.println("palindrome number");
		//}
		//else
		//{
			//System.out.println("not a palindrome number");
		//}
		
//ARMSTRONG NUMBER PROGRAM
		
		//int a=153,rem1,var1=0,temp1=a;
		//for(;a>0;a/=10)
		//{
			//rem1=a%10;
			//var1=var1+rem1*rem1*rem1;
			
		//}
		//a=temp1;
		//System.out.println(a==var1?"ARMSTRONG NUMBER":"NOT ARMSTRONG");
		//if(a==var1)
		//{
		//	System.out.println("ARMSTRONG NUMBER");
			
		//}
		//else
		//{
			//System.out.println("not armstrong number");
		//}
		
//EVEN SUBTRACT 1 AND ODD ADD 1 IN THE GIVEN NUMBER 
		
		//int n1=6553,rem2,var2=0;
		//System.out.println(n1);
		//for(;n1>0;n1/=10)
		//{
		//	rem2=n1%10;
			//if(rem2%2==0)
			//{
				//rem2=rem2-1;
			//}
			//else
			//{
				//rem2=rem2+1;
			//}
			//var2=(var2*10)+rem2;
		//}
		//System.out.println(var2);
		
			//int n3=var2,var4=0,rem5;
		//for(;n3>0;n3/=10)
		//{
			
		//rem5=n3%10;
		//var4=var4*10+rem5;
		
	//	}
		//System.out.println(var4);
		
//PALINDROME PROGRAM USING SCANNER CLASS
		
		//Scanner sc =new Scanner(System.in);
		//System.out.println("enter any number");
		//int n2=sc.nextInt();
		///int rem3,var3=0,temp2=n2;
		
		//for(;n2>0;n2/=10)
		//{
			//rem3=n2%10;
			//var3=var3*10+rem3;
		//}
		//n2=temp2;
		//if(n2==var)
		//{
		//	System.out.println("PALINDROME NUMBER");
		//}
		//else
		//{
			//System.out.println("NOT A PALINDROME NUMBER");
		//}
//PRIME NUMBER PROGRAM USING SCANNER CLASS
		//System.out.println("enter start number");
		//int start=sc.nextInt();
		//System.out.println("enter end number number");
		//int end=sc.nextInt();
		//int count=0;
		//for(;start<=end;start++)
		//{
			//if(end%start==0)
			//{
				//count++;
			//}
			
		//}
		//if(count==2)
		//{
			//System.out.println("prime number");
		//}
		//else
		//{
			//System.out.println("not a prime number");
		//}
		
		// countig,adding,multiplying
		
		int num=796421,remain,count1=0,sum=0,mul=1;
		for(;num>0;num/=10)
		{
			remain=num%10;
			if(count1==1||count1==3||count1==5)
			{
				sum=sum+remain;
			}
			else
			{
				mul=mul*remain;
			}
		}
		System.out.println("sum is:"+sum);
		System.out.println("multiple is:"+mul);
		if(mul%sum==0)
		{
			System.out.println("sum is factor of multiple");
		}
		else
		{
			System.out.println("sum is  not a factor of multiple");
			
		}
		
	}
}

