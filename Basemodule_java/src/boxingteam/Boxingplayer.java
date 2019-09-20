package boxingteam;
import java.util.Scanner;


public class Boxingplayer 
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int i,temp=0;
	
	System.out.println("Enter the number of players:");
	int n=sc.nextInt();
	System.out.println("Enter the number of fouls made by each player:");
	int[] a=new int[n];
	for(i=0;i<n;i++)
	{
	  a[i]=sc.nextInt();
	}
	for(j =0;j <= n ;j++)
	{
	if(a[i] > temp)
	{
	 	System.out.println("The eligible player is player no :" +j+")" )
	}
	}
	}

}
