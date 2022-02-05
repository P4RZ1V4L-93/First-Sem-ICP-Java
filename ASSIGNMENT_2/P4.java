import java.util.Scanner;
public class P4 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int I, O;
		int one, ten, hund;
		System.out.println("Enter a number between 0 and 1000: ");
		I = sc.nextInt();
		
		one = (I % 10);
		ten = (I % 100)/10;
		hund = I/100;
		O = one + ten + hund;
		
		System.out.println("The sum of digits is " + O);
		sc.close();
	}

}
