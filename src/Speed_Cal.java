import java.util.Scanner;
/**
 * Title: Speed Calculator 
 * @author Yuvasree - 1797807, created on January 05, 2021.
 */
class Calculations
{
	double S1, S2;
	//Speed in Kilometer per hour 
	public void Speed_Kms(int km_distance, int km_time)
	{
		S1 = km_distance / km_time;
		System.out.println("Speed in kilometer per hour:" +S1);
	}
	//Speed in miles per hour
	public void Speed_Miles(int miles_distance, int miles_time )
	{
		S2 = (miles_distance * 0.62137) / miles_time;
		System.out.println("Speed in Miles per hour:" +S2);
	}
}

public class Speed_Cal 
{	
	public static void  main(String args[])
	{
		Scanner S = new Scanner(System.in);
		//Here distance in kilometer, time in hour
		System.out.println("Enter Distance and Time:"); 
		int distance = S.nextInt();
		int time = S.nextInt();
		
		System.out.println("Enter Kilometers for 1 or Miles for 2");
		int a = S.nextInt();
		
		Calculations A = new Calculations();
		
		if(a==1) 
		{
			A.Speed_Kms(distance, time);
		}
		else
		{
			A.Speed_Miles(distance, time);
		}
	}
}
