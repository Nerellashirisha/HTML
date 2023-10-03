import java.util.Scanner;
public class Scannerexample {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter integer values");
		int a=s.nextInt();
		System.out.println("enter double values");
		double b=s.nextDouble();
		System.out.println("enter String1  values");
		String s1=s.next();
		s.nextLine();
		System.out.println("enter String2 values");
		String s2=s.nextLine();
		System.out.println("enter character values");
		char c=s.next().charAt(0);
		System.out.println("a value is:"+a+"\n b value is:"+b+"\n s1 value is:"+s1+"\n s2 value is:"+s2+"\n c value is:"+c);
		
		//USING SCANNER TO PERFORM  EVEN OR ODD
		
		System.out.println("enter number:");
		int n1=s.nextInt();
		if(n1%2==0)
		{
			System.out.println("even number");
			
		}
		else
		{
			System.out.println("odd number");
		}
	}	

}
