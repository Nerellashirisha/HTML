
//public class Extractionexample1 {

	//public static void main(String[] args) {
		
		
			//EXTRACTING DIGITS
		
					//int num=32367919,rem;
					//for(int i=1;i<=8;i++)
					//{
					//rem=num%10;//32367919%10=9//3236791%10==1//323679%10==9//32367%10==7//3236%10==6
					//323%10==3//32%10==2//3%10==3//
					//num=num/10;//32367919/10==3236791//3236791/10==323679//323679/10==32367//32367/10==3236//3236/10==3236
								//3236/10==323//323/10==32//32/10==3//3/10==0
					//System.out.println(rem);//9//1//9//7//6//3//2//3
					
					
			//NUMBER OF DIGITS IN THE NUMBER
					
					//int num=32367919,rem,count=0;
					//for(;num>0;num/=10)
					//{
						//count++;
					//}
					//System.out.println("total count is:"+count);

					
			//SUM AND MULTIPLICATION OF ALL DIGITS
					
					//int num=32367919,rem,count=0,sum=0,multiple=1;
					//for(;num>0;num/=10)
					//{
						//rem=num%10;
						//System.out.println(rem);
						//sum=sum+rem;//0+9=9//9+1=10//10+9=19//19+7=26//26+6=32//32+3=35//35+2=37//37+3=40
						//multiple=multiple*rem;//1*9=9//9*1=9//9*9=81//81*7=567//567*6=3402//3402*3=10206//10206*2=20412//20412*3=61236
						
					//}
					//System.out.println("sum is:"+sum);//40
					//System.out.println("multiple is:"+multiple);//61236
					
					
			//SUM AND MULTIPLICATION of ALTERNATE DIGITS
					
					//int num=32367919,rem,count=0,sum=0,mul=1;
					//for(;num>0;num/=10)
					//{
						//count++;//1//2//3//4//5//6//7//8
						//rem=num%10;//9//1//9//7//6//3//2//3
						//if(count==1||count==3||count==5||count==7)//1==1//3==3//5==5
						//{
					//		sum=sum+rem;//9//9+9=18//18+6=24//24+2=26
						//}
						//else //2==2//4==4//6==6//8==8
						//{
							//mul=mul*rem;//1*1=1//1*7=7//7*3=21//21*3=63
						//}
					//}
					//System.out.println("sum is:"+sum);//26
					//System.out.println("multiple is:"+mul);//63
					
			//NUMBER OF ODD DIGITS IN THE NUMBER

					//int num=32367919,count=0,rem;
					//for(;num>0;num/=10)
					//{
				//		rem=num%10;//9//1//9//7//6//3//2//3
				//		if(rem%2!=0)//9%2!=0//1%2!=0//9%2!=0//7%2!=0//6%2!=0==>false//3%2!=0//2%2!=0==>false
										//3%2!=0
					//	{
						//	count++;//1//2//3//4//5//6
						//}

					//}	
					//System.out.println("total odd numbers are:"+count);//6
			//}
//}
			

//}
