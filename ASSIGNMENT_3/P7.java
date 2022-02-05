import java.util.Scanner;
public class P7 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double x, y;
		System.out.println("Enter the coordinates X and Y");
		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if(x==0 && y==0)
		{
			System.out.println("The point is on the origin");
		}
		else if(x==0)
		{
			System.out.println("(" + x + ", " + y + ") is on y-axis");
		}
		else if(y == 0)
		{
			System.out.println("(" + x + ", " + y + ") is on x-axis");
		}
		else if(x>0 && y>0)
		{
			System.out.println("(" + x + ", " + y + ") is in Quadrant I");
		}
		else if(x>0 && y<0)
		{
			System.out.println("(" + x + ", " + y + ") is in Quadrant IV");
		}
		else if(x<0 && y>0)
		{
			System.out.println("(" + x + ", " + y + ") is in Quadrant II");
		}
		else if(x<0 && y<0)
		{
			System.out.println("(" + x + ", " + y + ") is in Quadrant III");
		}
		sc.close();
	}

}
