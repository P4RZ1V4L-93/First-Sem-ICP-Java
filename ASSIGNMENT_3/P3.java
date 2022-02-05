import java.util.Scanner;
public class P3 
{

	public static void main(String[] args) 
	{
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a positive Integer: ");
		a = sc.nextInt();
		
		if(a%2==0)
		{
			System.out.println("The number is even");
		}
		else
		{
			System.out.println("The number is odd");
		}
		sc.close();
	}

}
