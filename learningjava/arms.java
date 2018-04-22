package learningjava;

public class arms {

    public static void main(String []args){
  		int e=0,m=0,sum=0;
  		System.out.println("Armstrong numbers are : " );
	for( int n=1 ; n<1000 ;n++)
	{
		//System.out.println("N value is " + n);
		int check=n;
		int aa=n;
		while (aa > 0)
			{
				m=aa%10;
				//System.out.println(m);
				sum=sum+(m*m*m);
				//System.out.println(sum);
				aa=aa/10;
			}
				if (check == sum)
				{
					//System.out.println("Check = " + check);
					//System.out.println("Sum = " + sum);
					System.out.println(check);
				}
			/*	else
				 */

			sum=0;
			
		
	}
	}
    
}
