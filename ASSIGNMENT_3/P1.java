import java.util.Scanner;
public class P1 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		float a;
		System.out.println("Enter your height in feet");
		a = sc.nextFloat();
		
		if(a>=6.0f)
		{
			System.out.println("The person is tall");
		}
		sc.close();
	}
}
