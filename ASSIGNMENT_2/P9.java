import java.util.Scanner;
public class P9 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double x1, x2, y1, y2, D;
		
		System.out.println("Enter x1, y1:");
		x1 = sc.nextDouble();
		y1 = sc.nextDouble();
		
		System.out.println("Enter x2, y2:");
		x2 = sc.nextDouble();
		y2 = sc.nextDouble();
		
		D = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		System.out.println("The distance between the two points is "+D);
		sc.close();
	}

}
