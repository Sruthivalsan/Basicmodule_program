package armstrong;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Armstrongnumber {
	public static void main(String[]args)throws  IOException
	{
		int num;
		int count = 0;
		int sum = 0;
		int a;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter n numbers: ")	;
		num = Integer.parseInt(br.readLine());
		int num1 = num;
		int temp = num;
		while (num1 > 0)
		{
			count ++;
			num1 = num1 /10;
		}
		while(num > 0)
		{
			a = num %10;
			sum = sum +(int)Math.pow(a,count);
			num = num / 10;
		}
		if(temp==sum)
			
		{
			System.out.println("given number is armstrong");
		}
		else
		{
			System.out.println("given number is not armstrong");
		}
		
		
	}

}
