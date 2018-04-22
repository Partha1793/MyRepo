package learningjava;

public class MultipliactionTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rNumber = 2;
		int product ;
		int i;
		
		
		for (i=1;i<=10;i++)
		{
			product = i * rNumber ;
			
			System.out.println( i + " * "+rNumber+" = "+product );
		}
 
	}

}
