package avaragemark;

import java.util.Scanner;


public class Avarage
{
	public static void main(String[]args)
	{
		int i,sum=0,avg=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int n = sc.nextInt();
		System.out.println("Enter the marks of students:");
		int[] mark = new int[n];
		for(i = 0; i < n; i ++)
		{
			mark[i] = sc.nextInt();
			sum = sum + mark[i];
			
			
		}
		avg= sum / n;
		System.out.println("The average is:" +avg);
	}

}
