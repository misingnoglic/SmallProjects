// Calendar returns the number of months I've (Claire) have been dating due to never being able to count the months correctly.
// Since it was a quick project (that I wrote simultaneously while in BioLab) it only sends an estimated number of months.

import java.util.*;
public class Calendar {
	public static void main(String[] args) {
		System.out.println("This program calculates the number of months you've been dating!"); 
		System.out.println("Input today's date (mm dd yyyy): ");
		Scanner console = new Scanner(System.in);
		int month = console.nextInt();
		int day = console.nextInt();
		int year = console.nextInt();
		int absoluteDay = monthToDay(month, day, year);
		int totalDays = yearToDay(year, absoluteDay);
		int finalValue = subtract(totalDays);
		int numberMonths = months(finalValue);
		System.out.println("You've been dating for " + numberMonths + " months!!");
		secret(numberMonths);
	}
	public static int monthToDay(int x, int y, int z) { // converts months to a total number of days
		if (x==1){ 												
			x=0;
		} 
		if (x==2){
			x=31;
				
		}
		if (x==3){
			if (z%4!=0){
				x=59;
			} else {
				x=60;
			}
		}
		if (x==4){
			x=90;
		}
		if (x==5){
			x=120;
		}
		if (x==6){
			x=151;
		}
		if (x==7){
			x=181;
		}
		if (x==8){
			x=212;
		}
		if (x==9){
			x=243;
		}
		if (x==10){
			x=273;
		}
		if (x==11){
			x=304;
		}
		if (x==12){
			x=334;
		}
	return (x+y); //adds number of days in months and number of days
	}
	public static int yearToDay(int x, int y) { // converts number of days in years following 2015
	x = x-2015;	
	return y + 365*x;						
	}
	public static int subtract(int x) { 		// subtracts March 7th from the total number of days
		return x-66;
	}
	public static int months(int x) {			// calculates to an estimated number of months
		return (x/30);									
	}
	public static int secret(int x) {
		if(x==12) {
		System.out.println("You've been dating for a whole year!");
		} 
		return x;
	}
}
