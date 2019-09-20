package alphanumber;
import java.io.IOException;
import java.util.Scanner;
public class Numberalpha 
{
	public static void main(String[] args) throws IOException
 {
	 
	 
	 int n,b,a,t=0;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter a number:");
		 n=sc.nextInt();
		 a = n / 10;
		  b =  n %10;
		 switch(b)
		 {
		 
		 
		 case 1:
		 case 2:
		 case 6: t = t + 3;
		 break;
		 case 4:
		 case 5:
		 case 9: t = t+4;
		 break;
		 case 3:
		 case 7: 
		 case 8: t = t + 5;
		 }
		 switch(a)
		 {
		 case 0:t=t+0;
		 break;
		 case 2:
		 case 3:
		 case 4:t = t + 6;
		 break;
		 case 5:
		 case 6:t = t + 7;
		 break;
		 case 7:t=t+7;
		 break;
		 case 8:
		 case 9:t=t+6;
		 }
		 System.out.println(t);

		 
		


		 
 }

}
