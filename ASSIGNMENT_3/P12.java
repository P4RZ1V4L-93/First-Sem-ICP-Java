import java.util.Scanner;
public class P12 
{

	public static void main(String[] args) 
	{
		int a, b, c, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three number: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if((a>b) || (a>c))
		{
			if(a>b)
			{
				temp = a;
				a = b;
				b = temp;
			}
			if(a>c)
			{
				temp = a;
				a = c;
				c = temp;
			}
			if(b>c)
			{
				temp = b;
				b = c;
				c = temp;
			}
		}

		System.out.println("The Non-Decreasing order is: " + a + " " + b + " " + c);
		sc.close();
	}

}