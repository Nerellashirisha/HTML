
public class Extractionforloop {

	public static void main(String[] args) {
		
		// printing multiplication in extraction model using for loop
		
				int number=4372,rem1,temp=0,mul1=1,mul2=1;
				for(;number>0;number/=10)
				{
					temp++;
					rem1=number%10;
					if(temp==1||temp==4)
					{
						mul1=rem1*mul1;
					}
					else
					{
						mul2=mul2*rem1;
						
					}
					
				}
				System.out.println(mul1+mul2);

	}

}
