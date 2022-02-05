import java.util.Scanner;
public class P7 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		double S, A;
		
		System.out.println("Enter the side: ");
		S = sc.nextDouble();
		
		A = 3 * Math.sqrt(3) * Math.pow(S, 2) / 2;
		
		System.out.println("The area of the hexagon is " + A);
		sc.close();
	}

}
