import java.util.Scanner;
public class P2 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		double R, L, A, V;
		
		System.out.println("Enter radius and length of the cylinder : ");
		R = sc.nextFloat();
		L = sc.nextFloat();
		
		A = R * R * Math.PI;
		V = A * L;
		
		System.out.println("The area is " + A);
		System.out.println("The volume is " + V);
		sc.close();
	}

}
