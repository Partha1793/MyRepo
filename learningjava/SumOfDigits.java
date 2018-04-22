package learningjava;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
		int number;
		int inputNumber = number  = 932;
		int reminder;
		int sumOfDigits = 0;
				
		while(inputNumber != 0)
		{
			reminder = inputNumber%10;
			sumOfDigits = sumOfDigits + reminder;
			inputNumber = inputNumber/10;
		
		}
		
		System.out.println("Sum of Digits in " + number +  " is " + sumOfDigits);
	}

}
