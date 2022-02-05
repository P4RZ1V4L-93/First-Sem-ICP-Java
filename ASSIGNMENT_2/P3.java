import java.util.Scanner;
public class P3 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		float F, M;
		
		System.out.println("Enter a value in feet: ");
		F = sc.nextFloat();
		
		M = F * 0.305f;
		
		System.out.println(F + " feet is " + M + " meters ");
		sc.close();
	}

}
