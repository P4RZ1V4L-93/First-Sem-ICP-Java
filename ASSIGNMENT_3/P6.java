import java.util.Scanner;
public class P6 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double a, b, c, d, e, f, x, y;
		System.out.println("Enter a, b, c, d, e, f ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		d = sc.nextDouble();
		e = sc.nextDouble();
		f = sc.nextDouble();
		
		if((a * d - b * c) == 0 )
		{
			System.out.println("The equation has no solution");
		}
		else
		{
			x = (e * d - b * f)/(a * d - b * c);
			y = (a * f - e * c)/(a * d - b * c);
			
			System.out.println("x is " + x + " and y is " + y);
		}
		sc.close();
	}

}
