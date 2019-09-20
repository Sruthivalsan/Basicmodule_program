package winningbid;
import java.util.Scanner;

public class Winbid
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int i;
	int temp=0;
	System.out.println("Enter the number of applications:");
	int n=sc.nextInt();
	System.out.println("Enter the amount:");
	int[] a=new int[n];
	for(i=0;i<n;i++)
	{
	  a[i]=sc.nextInt();
	}
	for(i = 0; i < n; i ++)
	{
		if(a[i] > temp)
		{
		 temp = a[i];
			
		}
		
	}	
	System.out.println("The winning bid is:" + temp);
		}
	}

