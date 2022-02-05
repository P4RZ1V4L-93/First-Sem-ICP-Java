import java.util.Scanner;
public class P10 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double x1, x2, x3, y1, y2, y3, a, b, c, s, A;
		
		System.out.println("Enter The Three points :");
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		x3 = sc.nextDouble();
		y3 = sc.nextDouble();
		
		a = (Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2)));
		b = (Math.sqrt(Math.pow(x2-x3, 2) + Math.pow(y2-y3, 2)));
		c = (Math.sqrt(Math.pow(x3-x1, 2) + Math.pow(y3-y1, 2)));
		s =  (a + b + c)/2;
		
		A = Math.sqrt(s * (s-a) * (s-b) * (s-c));
		
		System.out.println("The area of the triangle is " + A);
		sc.close();
	}

}
