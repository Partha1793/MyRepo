package learningjava;

public class TwoDimensionalArray {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

		String  nameBloodGroup[][] = {{"Partha","B+ve"},{"Saravanan" , "B+ve"},{"Revathy","O+ve"},
				{"Balakumar", "B+ve"}};
		//nested for loop
		for (int i =0; i<4;i++)
		{
		System.out.print(nameBloodGroup[i][0]);
		System.out.println(" "+nameBloodGroup[i][1]);
		}
		//for loop
		{
			for (int i=0;i<4;i++)
			{
				for (int j=0;j<2;j++)
					System.out.print(nameBloodGroup[i][j] +" ");
					System.out.println();
			}
		}
		}
		}
		
	


