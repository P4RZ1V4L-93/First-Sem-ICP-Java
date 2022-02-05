import java.util.Scanner;
public class P11 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		float invst, rate, year;
		double value;
		
		System.out.println("Enter investment amount: ");
		invst = sc.nextFloat();
		System.out.println("Enter annual interest rate in percentage: ");
		rate = sc.nextFloat();
		System.out.println("Enter number of years: ");
		year = sc.nextFloat();
		
		//value = invst*(Math.pow((1+rate), (year*12)));
		value = (invst*rate*year/100) + invst;
		System.out.println("Accumulated value is $"+value);
		sc.close();
	}

}
