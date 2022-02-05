import java.util.Scanner;
public class P4 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Char: ");
		int a = sc.next().charAt(0);
		
		if((a>=65) && (a<=90))
		{
			System.out.println("Capital letter");
		}
		else if((a>=97) && (a<=122))
		{
			System.out.println("Small Case");
		}
		else if((a>=48) && (a<=57))
		{
			System.out.println("Digit");
		}
		else
		{
			System.out.println("Special Symbol");
		}
		sc.close();
	}

}
