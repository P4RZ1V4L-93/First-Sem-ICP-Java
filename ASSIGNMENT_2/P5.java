import java.util.Scanner;
public class P5 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		float v0, v1, t, a;
		
		System.out.println("Enter v0, v1 and t");
		v0 = sc.nextFloat();
		v1 = sc.nextFloat();
		t = sc.nextFloat();
		
		a = (v1 - v0)/t;
		
		System.out.println("The average acceleration is " + a);
		sc.close();
	}

}
