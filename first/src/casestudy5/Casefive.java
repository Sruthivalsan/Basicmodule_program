package casestudy5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Casefive
{

	public static String[] name= new String[50];       
	String addres;
	String contactnumber;
	String emailid;
	String prooftype;
	String proofID;
	static int  ID = 0;
	String proceed1;
	String ac;
	String cot;
	String cable;
	String wifi;
	String laundry;
	public static int[] booked=new int[25];
	protected static int i=0;
	String date;


	public static void main(String args []) throws IOException
	{
	  //String[] name= new String[50];    
		//String[] name;
		String addres;
		String contactnumber;
		String emailid;
		String prooftype;
		String proofID;
		int registration;
		String proceed;
		String proceed1;
		String startdate;
		String enddate;
		
		
		Scanner sc=new Scanner(System.in);
		
		
			do
			{	
				ID ++;
				System.out.println("Enter your name:");
				name[ID] = sc.nextLine();
				//System.out.println(name[ID]);
				System.out.println("Enter your addres:");
				addres = sc.nextLine();
				System.out.println("Enter your  contactnumber:");
				contactnumber = sc.nextLine();
				sc.nextLine();
				System.out.println("Enter youremailid:");
				emailid = sc.nextLine();
				System.out.println("Enter your prooftype:");
				prooftype = sc.nextLine();
				
				System.out.println("Enter your proofID:");
				proofID = sc.nextLine();
				System.out.println("****THANK YOU FOR REGISTERING**Your id is: " +ID);
				System.out.println("Do you want to continue Book a room(y/n)?");
				proceed1 = sc.nextLine();
				if(proceed1.equalsIgnoreCase("Y"))
				booking();
				System.out.println("Do you want to continue registration (y/n)?");
				proceed = sc.nextLine();
				
				}
				while(proceed.equalsIgnoreCase("Y"));
			
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("View all booking");
			System.out.println("Enter the start  Date");
			startdate=br.readLine();
			System.out.println("Enter the end Date");
			enddate=br.readLine();
			System.out.println("The bookings made from "+startdate+"to"+enddate+"are");
			System.out.println("The registered customers are:");
			System.out.println("customerID: name:");
			for(int i = 1;  i <=ID; i ++)
			{
				System.out.println(+i+"\t    "+name[i]);
				
			}
	}
			private static void booking() throws IOException 
			{
String date;
			String ac;
			String cot;
			String cable;
			String wifi;
			String laundry;
			int total=0;
			int flag=0;
			int roomno=0;
			System.out.println("\nBooking");
			System.out.println("Please choose the services required.");
			System.out.println("AC/non-AC(AC/nAC)");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			ac=br.readLine();
			System.out.println("Cot(Single/Double)");
			cot=br.readLine();
			System.out.println("With cable connection/without cable connection(C/nC)");
			cable=br.readLine();
			System.out.println("Wi-Fi needed or not(W/nW)");
			wifi=br.readLine();
			System.out.println("Laundry service needed or not(L/nL)");
			laundry=br.readLine();
			
			System.out.println("Enter the Date");
			date=br.readLine();
			
		

			if(ac.equalsIgnoreCase("AC"))
			total=total+500;
			else if(ac.equalsIgnoreCase("nAC"))
			total=total+250;
			else
			ac="NULL";

			if(cot.equalsIgnoreCase("Single"))
			total=total+200;
			else if(cot.equalsIgnoreCase("Double"))
			total=total+450;
			else
			cot="NULL";

			if(cable.equalsIgnoreCase("C"))
			total=total+400;
			else if(cable.equalsIgnoreCase("nC"))
			total=total+350;
			else
			cable="NULL";

			if(wifi.equalsIgnoreCase("W"))
			total=total+400;
			else if(wifi.equalsIgnoreCase("nW"))
			total=total+350;
			else
			wifi="NULL";

			if(laundry.equalsIgnoreCase("L"))
			total=total+400;
			else if(laundry.equalsIgnoreCase("nL"))
			total=total+350;
			else
			laundry="NULL";

			System.out.println("The Total charge is "+total);
			System.out.println("The services chosen are");
			System.out.println(ac);
			System.out.println(cot);
			System.out.println(cable);
			System.out.println(wifi);
			System.out.println(laundry);
			System.out.println("Do you want to proceed?(yes/no)");
			String proceed=br.readLine();
			if(total>0 &&(proceed.equalsIgnoreCase("yes")))
			{
			for(int i=0;i<25;i++)
			{
			if(booked[i]==0)
			{
			booked[i]=total;
			roomno=i+1;
			flag=1;
			break;
			//i++;
			}
			}
			if(flag==1)
			System.out.println("Thank you for booking. Your room number is "+roomno+ ".");

			//Thank you for booking. Your room number is 2.
			}
			
		
		
			
		}

}


