import java.util.Scanner;
public class P5 
{

	public static void main(String[] args) 
	{
		double a, b, c, r1, r2, D;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a, b, c: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		D = (Math.pow(b, 2) - (4*a*c));
		
		if(D>0)
		{
			r1 = (-b + Math.sqrt(D))/(2*a);
			r2 = (-b - Math.sqrt(D))/(2*a);
			System.out.println("The roots are " + r1 + " and " + r2);
		}
		else if(D==0)
		{
			r1 = (-b + Math.sqrt(D))/(2*a);
			System.out.println("The roots are " + r1);
		}
		else
		{
			System.out.println("The Equation has no real roots");
		}
		sc.close();
	}	

}
