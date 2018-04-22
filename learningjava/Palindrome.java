package learningjava;

import java.util.Iterator;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		
		int remainder=0;
		int sum = 0 ;
		int temp = 0;
		
		
	
		System.out.println("Armstrong numbers are:");
		for ( int i = 1; i<=10; i++)
		{				
			temp = i;
			while(temp>0) {
				remainder = temp%10;
				int cube  = (int) Math.pow(remainder, 3);
				sum = sum+cube;	
				temp = temp/10;
			}
			if(sum==i)
				System.out.println(i+"  ");	
			temp =0;
		}	
	}

}