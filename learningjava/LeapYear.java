package learningjava;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		
		 int year = in.nextInt();
		 System.out.println(year);
		 
		 //int leapyear =0;
		 //leapyear = year%4;
		 //int centurialyear = year%400;	
		 
		 
		 
		 if (year%4 == 0) {
			 if (year%100 == 0)
			 {
				 
				 if(year%400 == 0)
				 {
					 System.out.println("year is a  leap year");
				 }
				 else {
					 System.out.println("year is a not leap year");
				 }
			 
				 	 
		     }
			 
			 else {
				 System.out.println("year is a  leap year");
			 }
			
			 
		} 
			

		}
		 
		 
		 
			 
		 
		 
		 
		 


	

	private static void elseif(boolean b) {
		// TODO Auto-generated method stub
		
	}

}
